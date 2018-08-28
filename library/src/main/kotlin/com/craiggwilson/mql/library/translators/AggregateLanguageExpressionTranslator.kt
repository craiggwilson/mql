package com.craiggwilson.mql.library.translators

import com.craiggwilson.mql.library.ast.AddExpression
import com.craiggwilson.mql.library.ast.AndExpression
import com.craiggwilson.mql.library.ast.ArrayAccessExpression
import com.craiggwilson.mql.library.ast.BooleanExpression
import com.craiggwilson.mql.library.ast.ConcatExpression
import com.craiggwilson.mql.library.ast.ConditionalExpression
import com.craiggwilson.mql.library.ast.DecimalExpression
import com.craiggwilson.mql.library.ast.DivideExpression
import com.craiggwilson.mql.library.ast.DoubleExpression
import com.craiggwilson.mql.library.ast.EqualsExpression
import com.craiggwilson.mql.library.ast.FieldDeclaration
import com.craiggwilson.mql.library.ast.FieldName
import com.craiggwilson.mql.library.ast.FieldReferenceExpression
import com.craiggwilson.mql.library.ast.FunctionCallExpression
import com.craiggwilson.mql.library.ast.GreaterThanExpression
import com.craiggwilson.mql.library.ast.GreaterThanOrEqualsExpression
import com.craiggwilson.mql.library.ast.InExpression
import com.craiggwilson.mql.library.ast.Int32Expression
import com.craiggwilson.mql.library.ast.Int64Expression
import com.craiggwilson.mql.library.ast.LambdaExpression
import com.craiggwilson.mql.library.ast.LessThanExpression
import com.craiggwilson.mql.library.ast.LessThanOrEqualsExpression
import com.craiggwilson.mql.library.ast.LetExpression
import com.craiggwilson.mql.library.ast.ModExpression
import com.craiggwilson.mql.library.ast.MultiplyExpression
import com.craiggwilson.mql.library.ast.NewDocumentExpression
import com.craiggwilson.mql.library.ast.Node
import com.craiggwilson.mql.library.ast.NotEqualsExpression
import com.craiggwilson.mql.library.ast.NotExpression
import com.craiggwilson.mql.library.ast.NullCoalesceExpression
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
import org.bson.BsonBoolean
import org.bson.BsonDecimal128
import org.bson.BsonDocument
import org.bson.BsonDouble
import org.bson.BsonInt32
import org.bson.BsonInt64
import org.bson.BsonNull
import org.bson.BsonString
import org.bson.BsonValue
import org.bson.types.Decimal128

internal fun translateToAggregationLanguage(n: Node?): BsonValue? {
    return AggregateLanguageExpressionTranslator.visit(n)
}

internal object AggregateLanguageExpressionTranslator : ValueExpressionTranslator() {
    override fun visit(n: AddExpression): BsonValue {
        return visit(function("add", n.left, n.right))
    }

    override fun visit(n: AndExpression): BsonValue {
        var args = n.flatten()
        return visit(function("and", *args.toTypedArray()))
    }

    override fun visit(n: ArrayAccessExpression): BsonValue {
        return visit(if (n.accessor is RangeExpression) {
            val access = when {
                n.accessor.start == NullExpression && n.accessor.end == NullExpression -> n.array
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

    override fun visit(n: ConcatExpression): BsonValue {
        val args = n.flatten()
        return visit(function("concat", *args.toTypedArray()))
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
        return visit(when {
            n.arguments.all { it is FunctionCallExpression.Argument.Named } -> {
                val elements = n.arguments
                    .filterIsInstance<FunctionCallExpression.Argument.Named>()
                    .map { NewDocumentExpression.Element(FieldDeclaration(FieldName(it.name.name)), it.expression) }

                newDocument("$" + n.name.name to NewDocumentExpression(elements))
            }
            n.arguments.size > 1 -> newDocument("$" + n.name.name to newArray(n.arguments.map { it.expression }))
            else -> newDocument("$" + n.name.name to n.arguments[0].expression)
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

    override fun visit(n: NullCoalesceExpression): BsonValue {
        return visit(function("ifNull", n.left, n.right))
    }

    override fun visit(n: OrExpression): BsonValue {
        val args = n.flatten()
        return visit(function("or", *args.toTypedArray()))
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

    // Values
    override fun visit(n: BooleanExpression): BsonValue {
        return BsonDocument("\$literal", BsonBoolean(n.value))
    }

    override fun visit(n: DecimalExpression): BsonValue {
        return BsonDocument("\$literal", BsonDecimal128(Decimal128(n.value)))
    }

    override fun visit(n: DoubleExpression): BsonValue {
        return BsonDocument("\$literal", BsonDouble(n.value))
    }

    override fun visit(n: Int32Expression): BsonValue {
        return BsonDocument("\$literal", BsonInt32(n.value))
    }

    override fun visit(n: Int64Expression): BsonValue {
        return BsonDocument("\$literal", BsonInt64(n.value))
    }

    override fun visit(n: NullExpression): BsonValue {
        return BsonNull.VALUE
    }

    override fun visit(n: StringExpression): BsonValue {
        if (n.value.contains("\$")) {
            return BsonDocument("\$literal", BsonString(n.value))
        }

        return BsonString(n.value)
    }
}
