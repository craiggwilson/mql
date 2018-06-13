package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.AddExpression
import com.craiggwilson.mql.ast.AndExpression
import com.craiggwilson.mql.ast.ArrayAccessExpression
import com.craiggwilson.mql.ast.ConditionalExpression
import com.craiggwilson.mql.ast.DivideExpression
import com.craiggwilson.mql.ast.EqualsExpression
import com.craiggwilson.mql.ast.FieldDeclaration
import com.craiggwilson.mql.ast.FieldName
import com.craiggwilson.mql.ast.FieldReferenceExpression
import com.craiggwilson.mql.ast.FunctionCallExpression
import com.craiggwilson.mql.ast.GreaterThanExpression
import com.craiggwilson.mql.ast.GreaterThanOrEqualsExpression
import com.craiggwilson.mql.ast.LambdaExpression
import com.craiggwilson.mql.ast.LessThanExpression
import com.craiggwilson.mql.ast.LessThanOrEqualsExpression
import com.craiggwilson.mql.ast.LetExpression
import com.craiggwilson.mql.ast.ModExpression
import com.craiggwilson.mql.ast.MultiplyExpression
import com.craiggwilson.mql.ast.NewArrayExpression
import com.craiggwilson.mql.ast.NewDocumentExpression
import com.craiggwilson.mql.ast.NotEqualsExpression
import com.craiggwilson.mql.ast.NotExpression
import com.craiggwilson.mql.ast.NullExpression
import com.craiggwilson.mql.ast.OrExpression
import com.craiggwilson.mql.ast.PowerExpression
import com.craiggwilson.mql.ast.RangeExpression
import com.craiggwilson.mql.ast.SubtractExpression
import com.craiggwilson.mql.ast.VariableName
import com.craiggwilson.mql.ast.VariableReferenceExpression
import com.craiggwilson.mql.ast.builders.fieldReference
import com.craiggwilson.mql.ast.builders.function
import com.craiggwilson.mql.ast.builders.let
import com.craiggwilson.mql.ast.builders.newArray
import com.craiggwilson.mql.ast.builders.newDocument
import com.craiggwilson.mql.ast.builders.subtract
import com.craiggwilson.mql.ast.builders.variableReference

class AggregateLanguageExpressionTranslator(valueTranslator: ValueTranslator) : AbstractExpressionTranslator(valueTranslator) {
    override fun visit(n: AddExpression): String {
        return visit(function("add", n.left, n.right))
    }

    override fun visit(n: AndExpression): String {
        return visit(function("and", n.left, n.right))
    }

    override fun visit(n: ArrayAccessExpression): String {
        return if (n.accessor is RangeExpression) {
            when {
                n.accessor.end === NullExpression -> visit(LetExpression(
                    listOf(LetExpression.Variable(VariableName("array"), n.array)),
                    function(
                        "slice",
                        variableReference("array"),
                        subtract(
                            n.accessor.start,
                            function("size", variableReference("array"))))
                ))
                n.accessor.start === NullExpression -> visit(function("slice", n.array, n.accessor.end))
                else -> visit(function("slice", n.array, n.accessor.start, subtract(n.accessor.end, n.accessor.start)))
            }
        } else {
            visit(function("arrayElemAt", n.array, n.accessor))
        }
    }

    override fun visit(n: ConditionalExpression): String {
        if (n.cases.size == 1 && n.fallback != null) {
            return visit(function("cond", n.cases[0].condition, n.cases[0].then, n.fallback))
        } else {
            val branches = n.cases.map { case ->
                newDocument(
                    "case" to case.condition,
                    "then" to case.then
                )
            }

            val f = if (n.fallback != null) {
                function(
                    "switch",
                    "branches" to newArray(branches),
                    "default" to n.fallback)
            } else {
                function(
                    "switch",
                    "branches" to newArray(branches)
                )
            }

            return visit(f)
        }
    }

    override fun visit(n: DivideExpression): String {
        return visit(function("divide", n.left, n.right))
    }

    override fun visit(n: EqualsExpression): String {
        return visit(function("eq", n.left, n.right))
    }

    override fun visit(n: FieldReferenceExpression): String {
        val flattened = flatten(n)
        return if (flattened.parent != null && flattened.parent is VariableReferenceExpression) {
            quote("\$\$${flattened.parent.name.name}.${flattened.name.name}")
        } else if (flattened.parent != null) {
            return visit(let(
                listOf("parent" to flattened.parent),
                fieldReference(variableReference("parent"), flattened.name.name)
            ))
        } else {
            quote("\$${flattened.name.name}")
        }
    }

    override fun visit(n: FunctionCallExpression): String {
        // shift parent to first position
        var arguments = n.arguments
        if (n.parent != null) {
            arguments = listOf(FunctionCallExpression.Argument.Positional(n.parent)) + arguments
        }

        return if (arguments.all { it is FunctionCallExpression.Argument.Named }) {
            val elements = arguments
                .filterIsInstance<FunctionCallExpression.Argument.Named>()
                .map { NewDocumentExpression.Element(FieldDeclaration(FieldName(it.name.name)), it.expression) }

            visit(newDocument("$" + n.name.name to NewDocumentExpression(elements)))
        } else {
            visit(newDocument("$" + n.name.name to newArray(arguments.map { it.expression })))
        }
    }

    override fun visit(n: GreaterThanExpression): String {
        return visit(function("gt", n.left, n.right))
    }

    override fun visit(n: GreaterThanOrEqualsExpression): String {
        return visit(function("gte", n.left, n.right))
    }

    override fun visit(n: LambdaExpression): String {
        throw UnsupportedOperationException("lambda expressions are not supported")
    }

    override fun visit(n: LessThanExpression): String {
        return visit(function("lt", n.left, n.right))
    }

    override fun visit(n: LessThanOrEqualsExpression): String {
        return visit(function("lte", n.left, n.right))
    }

    override fun visit(n: LetExpression): String {
        val variables = NewDocumentExpression(
            n.variables.map { NewDocumentExpression.Element(FieldDeclaration(FieldName(it.name.name)), it.expression) }
        )

        return visit(function(
            "let",
            "vars" to variables,
            "in" to n.expression))
    }

    override fun visit(n: ModExpression): String {
        return visit(function("mod", n.left, n.right))
    }

    override fun visit(n: MultiplyExpression): String {
        return visit(function("multiply", n.left, n.right))
    }

    override fun visit(n: NewArrayExpression): String {
        val items = n.items.map { visit(it) }.joinToString()

        return "[ $items ]"
    }

    override fun visit(n: NewDocumentExpression): String {
        val fieldString = n.elements.joinToString { element ->
            val fieldName = visit(element.field)
            val expression = visit(element.expression)

            "$fieldName: $expression"
        }

        return "{ $fieldString }"
    }

    override fun visit(n: NotEqualsExpression): String {
        return visit(function("ne", n.left, n.right))
    }

    override fun visit(n: NotExpression): String {
        return visit(function("not", n.expression))
    }

    override fun visit(n: OrExpression): String {
        return visit(function("or", n.left, n.right))
    }

    override fun visit(n: PowerExpression): String {
        return visit(function("pow", n.left, n.right))
    }

    override fun visit(n: RangeExpression): String {
        return if (n.step != null) {
            visit(function("range", n.start, n.end, n.step))
        } else {
            visit(function("range", n.start, n.end))
        }
    }

    override fun visit(n: SubtractExpression): String {
        return visit(function("subtract", n.left, n.right))
    }

    override fun visit(n: VariableReferenceExpression): String {
        return quote("\$\$${n.name.name}")
    }
}