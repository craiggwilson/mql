package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.AddExpression
import com.craiggwilson.mql.ast.AndExpression
import com.craiggwilson.mql.ast.ArrayAccessExpression
import com.craiggwilson.mql.ast.ConditionalExpression
import com.craiggwilson.mql.ast.DivideExpression
import com.craiggwilson.mql.ast.EqualsExpression
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
import com.craiggwilson.mql.ast.VariableReferenceExpression

class AggregateLanguageExpressionTranslator(valueTranslator: ValueTranslator) : AbstractExpressionTranslator(valueTranslator) {
    override fun visit(n: AddExpression): String {
        val left = visit(n.left)
        val right = visit(n.right)

        return "{ \"\$add\": [ $left, $right ] }"
    }

    override fun visit(n: AndExpression): String {
        val left = visit(n.left)
        val right = visit(n.right)

        return "{ \"\$and\": [ $left, $right ] }"
    }

    override fun visit(n: ArrayAccessExpression): String {
        val array = visit(n.array)
        if (n.accessor is RangeExpression) {
            return if (n.accessor.end === NullExpression) {
                val start = visit(n.accessor.start)
                "{ \"\$let\": { \"vars\": { \"array\": $array }, \"in\": { \"\$slice\": [ \"\$\$array\", { \"\$subtract\": [ $start, { \"\$size\": \"\$\$array\" } ] } ] } } }"
            } else if (n.accessor.start === NullExpression) {
                val end = visit(n.accessor.end)
                "{ \"\$slice\": [ $array, $end ] }"
            } else {
                val start = visit(n.accessor.start)
                val end = visit(SubtractExpression(n.accessor.end, n.accessor.start))
                "{ \"\$slice\": [ $array, $start, $end ] }"
            }
        } else {
            val index = visit(n.accessor)
            return "{ \"\$arrayElemAt\": [ $array, $index ] }"
        }
    }

    override fun visit(n: ConditionalExpression): String {
        if (n.cases.size == 1 && n.fallback != null) {
            val condition = visit(n.cases[0].condition)
            val then = visit(n.cases[0].then)
            val fallback = visit(n.fallback)

            return "{ \"\$cond\": [ $condition, $then, $fallback ] }"
        } else {
            val branches = n.cases.joinToString { case ->
                val condition = visit(case.condition)
                val then = visit(case.then)

                "{ \"case\": $condition, \"then\": $then }"
            }

            var body = "\"branches\": [ $branches ]"

            if (n.fallback != null) {
                val fallback = visit(n.fallback)
                body += ", \"default\": $fallback"
            }

            return "{ \"\$switch\": { $body } }"
        }
    }

    override fun visit(n: DivideExpression): String {
        val left = visit(n.left)
        val right = visit(n.right)

        return "{ \"\$divide\": [ $left, $right ] }"
    }

    override fun visit(n: EqualsExpression): String {
        val left = visit(n.left)
        val right = visit(n.right)

        return "{ \"\$eq\": [ $left, $right ] }"
    }

    override fun visit(n: FieldReferenceExpression): String {
        val flattened = flatten(n)
        return if (flattened.parent != null && flattened.parent is VariableReferenceExpression) {
            quote("\$\$${flattened.parent.name.name}.${flattened.name.name}")
        } else if (flattened.parent != null) {
            val parent = visit(flattened.parent)

            "{ \"\$let\": { \"vars\": { \"parent\": $parent }, \"in\": \"\$\$parent.${flattened.name.name}\" } }"
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

        if (arguments.all { it is FunctionCallExpression.Argument.Named }) {
            val argExpressions = arguments
                .filterIsInstance<FunctionCallExpression.Argument.Named>()
                .map { argument ->
                    val name = quote(argument.name.name)
                    val expression = visit(argument.expression)

                    "$name: $expression"
                }.joinToString()

            return "{ \"\$${n.name.name}\": { $argExpressions } }"
        } else {
            val argExpressions = arguments.map { visit(it.expression) }.joinToString()

            return "{ \"\$${n.name.name}\": [ $argExpressions ] }"
        }
    }

    override fun visit(n: GreaterThanExpression): String {
        val left = visit(n.left)
        val right = visit(n.right)

        return "{ \"\$gt\": [ $left, $right ] }"
    }

    override fun visit(n: GreaterThanOrEqualsExpression): String {
        val left = visit(n.left)
        val right = visit(n.right)

        return "{ \"\$gte\": [ $left, $right ] }"
    }

    override fun visit(n: LambdaExpression): String {
        throw UnsupportedOperationException("lambda expressions are not supported")
    }

    override fun visit(n: LessThanExpression): String {
        val left = visit(n.left)
        val right = visit(n.right)

        return "{ \"\$lt\": [ $left, $right ] }"
    }

    override fun visit(n: LessThanOrEqualsExpression): String {
        val left = visit(n.left)
        val right = visit(n.right)

        return "{ \"\$lte\": [ $left, $right ] }"
    }

    override fun visit(n: LetExpression): String {
        val variables = n.variables.joinToString { variable ->
            var name = quote(variable.name.name)
            var expression = visit(variable.expression)

            "$name: $expression"
        }

        val expression = visit(n.expression)
        return "{ \"\$let\": { \"vars\": { $variables }, \"in\": $expression } }"
    }

    override fun visit(n: ModExpression): String {
        val left = visit(n.left)
        val right = visit(n.right)

        return "{ \"\$mod\": [ $left, $right ] }"
    }

    override fun visit(n: MultiplyExpression): String {
        val left = visit(n.left)
        val right = visit(n.right)

        return "{ \"\$multiply\": [ $left, $right ] }"
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
        val left = visit(n.left)
        val right = visit(n.right)

        return "{ \"\$ne\": [ $left, $right ] }"
    }

    override fun visit(n: NotExpression): String {
        val expression = visit(n.expression)
        return "{ \"\$not\": [ $expression ] }"
    }

    override fun visit(n: OrExpression): String {
        val left = visit(n.left)
        val right = visit(n.right)

        return "{ \"\$or\": [ $left, $right ] }"
    }

    override fun visit(n: PowerExpression): String {
        val left = visit(n.left)
        val right = visit(n.right)

        return "{ \"\$pow\": [ $left, $right ] }"
    }

    override fun visit(n: RangeExpression): String {
        val start = visit(n.start)
        val end = visit(n.end)

        var body = "[ $start, $end"
        if (n.step != null) {
            val step = visit(n.step)
            body += ", $step"
        }

        body += " ]"

        return "{ \"\$range\": $body }"
    }

    override fun visit(n: SubtractExpression): String {
        val left = visit(n.left)
        val right = visit(n.right)

        return "{ \"\$subtract\": [ $left, $right ] }"
    }

    override fun visit(n: VariableReferenceExpression): String {
        return quote("\$\$${n.name.name}")
    }
}