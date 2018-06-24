package com.craiggwilson.mql.library.translators

import com.craiggwilson.mql.library.ast.AddExpression
import com.craiggwilson.mql.library.ast.AndExpression
import com.craiggwilson.mql.library.ast.ArrayAccessExpression
import com.craiggwilson.mql.library.ast.ConditionalExpression
import com.craiggwilson.mql.library.ast.DivideExpression
import com.craiggwilson.mql.library.ast.EqualsExpression
import com.craiggwilson.mql.library.ast.FieldDeclaration
import com.craiggwilson.mql.library.ast.FieldName
import com.craiggwilson.mql.library.ast.FieldReferenceExpression
import com.craiggwilson.mql.library.ast.FunctionCallExpression
import com.craiggwilson.mql.library.ast.GreaterThanExpression
import com.craiggwilson.mql.library.ast.GreaterThanOrEqualsExpression
import com.craiggwilson.mql.library.ast.InExpression
import com.craiggwilson.mql.library.ast.Int32Expression
import com.craiggwilson.mql.library.ast.LambdaExpression
import com.craiggwilson.mql.library.ast.LessThanExpression
import com.craiggwilson.mql.library.ast.LessThanOrEqualsExpression
import com.craiggwilson.mql.library.ast.LetExpression
import com.craiggwilson.mql.library.ast.ModExpression
import com.craiggwilson.mql.library.ast.MultiplyExpression
import com.craiggwilson.mql.library.ast.NewDocumentExpression
import com.craiggwilson.mql.library.ast.NotEqualsExpression
import com.craiggwilson.mql.library.ast.NotExpression
import com.craiggwilson.mql.library.ast.NullExpression
import com.craiggwilson.mql.library.ast.OrExpression
import com.craiggwilson.mql.library.ast.PowerExpression
import com.craiggwilson.mql.library.ast.RangeExpression
import com.craiggwilson.mql.library.ast.StringExpression
import com.craiggwilson.mql.library.ast.SubtractExpression
import com.craiggwilson.mql.library.ast.VariableReferenceExpression
import com.craiggwilson.mql.library.ast.builders.fieldReference
import com.craiggwilson.mql.library.ast.builders.function
import com.craiggwilson.mql.library.ast.builders.let
import com.craiggwilson.mql.library.ast.builders.newArray
import com.craiggwilson.mql.library.ast.builders.newDocument
import com.craiggwilson.mql.library.ast.builders.subtract
import com.craiggwilson.mql.library.ast.builders.variableReference
import org.bson.BsonString
import org.bson.BsonValue

internal object AggregateLanguageExpressionTranslator : AbstractExpressionTranslator() {
    override fun visit(n: AddExpression): BsonValue {
        return visit(function("add", n.left, n.right))
    }

    override fun visit(n: AndExpression): BsonValue {
        return visit(function("and", n.left, n.right))
    }

    override fun visit(n: ArrayAccessExpression): BsonValue {
        return visit(if (n.accessor is RangeExpression) {
            val access = when {
                n.accessor.end === NullExpression -> let(
                    listOf("array" to n.array),
                    function(
                        "slice",
                        variableReference("array"),
                        subtract(
                            n.accessor.start,
                            function("size", variableReference("array"))))
                )
                n.accessor.start === NullExpression -> function("slice", n.array, n.accessor.end)
                else -> function("slice", n.array, n.accessor.start, subtract(n.accessor.end, n.accessor.start))
            }

            if (n.accessor.step != null) {
                let(
                    listOf("array" to access),
                    function("map",
                        "input" to function("filter",
                            "input" to function("zip",
                                "inputs" to newArray(
                                    RangeExpression(Int32Expression(0), function("size", variableReference("array"))),
                                    variableReference("array")
                                )
                            ),
                            "as" to StringExpression("x"),
                            "cond" to EqualsExpression(
                                Int32Expression(0),
                                ModExpression(
                                    ArrayAccessExpression(variableReference("x"), Int32Expression(0)),
                                    n.accessor.step
                                )
                            )
                        ),
                        "as" to StringExpression("x"),
                        "in" to ArrayAccessExpression(variableReference("x"), Int32Expression(1))
                    )
                )
            } else access
        } else {
            function("arrayElemAt", n.array, n.accessor)
        }) as BsonValue
    }

    override fun visit(n: ConditionalExpression): BsonValue {
        return visit(if (n.cases.size == 1 && n.fallback != null) {
            function("cond", n.cases[0].condition, n.cases[0].then, n.fallback)
        } else {
            val branches = newArray(n.cases.map { case ->
                newDocument(
                    "case" to case.condition,
                    "then" to case.then
                )
            })

            if (n.fallback != null) {
                function(
                    "switch",
                    "branches" to branches,
                    "default" to n.fallback)
            } else {
                function(
                    "switch",
                    "branches" to branches
                )
            }
        })
    }

    override fun visit(n: DivideExpression): BsonValue {
        return visit(function("divide", n.left, n.right))
    }

    override fun visit(n: EqualsExpression): BsonValue {
        return visit(function("eq", n.left, n.right))
    }

    override fun visit(n: FieldReferenceExpression): BsonValue {
        val flattened = n.flatten()
        return if (flattened.parent != null && flattened.parent is VariableReferenceExpression) {
            BsonString("\$\$${flattened.parent.name.name}.${flattened.name.name}")
        } else if (flattened.parent != null) {
            return visit(let(
                listOf("parent" to flattened.parent),
                fieldReference(variableReference("parent"), flattened.name.name)
            ))
        } else {
            BsonString("\$${flattened.name.name}")
        }
    }

    override fun visit(n: FunctionCallExpression): BsonValue {
        // shift parent to first position
        var arguments = n.arguments
        if (n.parent != null) {
            arguments = listOf(FunctionCallExpression.Argument.Positional(n.parent)) + arguments
        }

        return visit(if (arguments.all { it is FunctionCallExpression.Argument.Named }) {
            val elements = arguments
                .filterIsInstance<FunctionCallExpression.Argument.Named>()
                .map { NewDocumentExpression.Element(FieldDeclaration(FieldName(it.name.name)), it.expression) }

            newDocument("$" + n.name.name to NewDocumentExpression(elements))
        } else if (arguments.size > 1) {
            newDocument("$" + n.name.name to newArray(arguments.map { it.expression }))
        } else {
            newDocument("$" + n.name.name to arguments[0].expression)
        })
    }

    override fun visit(n: GreaterThanExpression): BsonValue {
        return visit(function("gt", n.left, n.right))
    }

    override fun visit(n: GreaterThanOrEqualsExpression): BsonValue {
        return visit(function("gte", n.left, n.right))
    }

    override fun visit(n: InExpression): BsonValue {
        return visit(function("in", n.left, n.right))
    }

    override fun visit(n: LambdaExpression): BsonValue {
        throw UnsupportedOperationException("lambda expressions are not supported")
    }

    override fun visit(n: LessThanExpression): BsonValue {
        return visit(function("lt", n.left, n.right))
    }

    override fun visit(n: LessThanOrEqualsExpression): BsonValue {
        return visit(function("lte", n.left, n.right))
    }

    override fun visit(n: LetExpression): BsonValue {
        val variables = NewDocumentExpression(
            n.variables.map { NewDocumentExpression.Element(FieldDeclaration(FieldName(it.name.name)), it.expression) }
        )

        return visit(function(
            "let",
            "vars" to variables,
            "in" to n.expression))
    }

    override fun visit(n: ModExpression): BsonValue {
        return visit(function("mod", n.left, n.right))
    }

    override fun visit(n: MultiplyExpression): BsonValue {
        return visit(function("multiply", n.left, n.right))
    }

    override fun visit(n: NotEqualsExpression): BsonValue {
        return visit(function("ne", n.left, n.right))
    }

    override fun visit(n: NotExpression): BsonValue {
        return visit(function("not", n.expression))
    }

    override fun visit(n: OrExpression): BsonValue {
        return visit(function("or", n.left, n.right))
    }

    override fun visit(n: PowerExpression): BsonValue {
        return visit(function("pow", n.left, n.right))
    }

    override fun visit(n: RangeExpression): BsonValue {
        return visit(if (n.step != null) {
            function("range", n.start, n.end, n.step)
        } else {
            function("range", n.start, n.end)
        })
    }

    override fun visit(n: SubtractExpression): BsonValue {
        return visit(function("subtract", n.left, n.right))
    }

    override fun visit(n: VariableReferenceExpression): BsonValue {
        return BsonString("\$\$${n.name.name}")
    }
}
