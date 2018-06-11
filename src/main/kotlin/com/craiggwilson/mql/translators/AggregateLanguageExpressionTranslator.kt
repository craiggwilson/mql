package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.FieldReferenceExpression
import com.craiggwilson.mql.ast.NotExpression

class AggregateLanguageExpressionTranslator(valueTranslator: ValueTranslator) : AbstractExpressionTranslator(valueTranslator) {

    override fun visit(n: FieldReferenceExpression): String {
        val flattened = flatten(n)
        return quote("\$${flattened.name.name}")
    }

    override fun visit(n: NotExpression): String {
        val expression = visit(n.expression)
        return "{ \"\$not\": [ $expression ] }"
    }
}