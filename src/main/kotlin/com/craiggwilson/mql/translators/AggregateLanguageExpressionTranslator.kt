package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.AddExpression
import com.craiggwilson.mql.ast.AndExpression
import com.craiggwilson.mql.ast.ArrayAccessExpression
import com.craiggwilson.mql.ast.DivideExpression
import com.craiggwilson.mql.ast.EqualsExpression
import com.craiggwilson.mql.ast.FieldReferenceExpression
import com.craiggwilson.mql.ast.GreaterThanExpression
import com.craiggwilson.mql.ast.GreaterThanOrEqualsExpression
import com.craiggwilson.mql.ast.LessThanExpression
import com.craiggwilson.mql.ast.LessThanOrEqualsExpression
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
        if (flattened.parent != null) {
            val parent = visit(flattened.parent)

            return "{ \"\$let\": { \"vars\": { \"parent\": $parent }, \"in\": \"\$\$parent.${flattened.name.name}\" } }"
        }

        return quote("\$${flattened.name.name}")
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
}