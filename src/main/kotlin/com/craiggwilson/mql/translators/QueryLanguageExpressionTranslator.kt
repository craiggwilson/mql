package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.FieldReferenceExpression
import com.craiggwilson.mql.ast.NotExpression

class QueryLanguageExpressionTranslator(valueTranslator: ValueTranslator) : AbstractExpressionTranslator(valueTranslator) {

    override fun visit(n: FieldReferenceExpression): String {
        val flattened = flatten(n)
        return "\"${flattened.name.name}\""
    }

    override fun visit(n: NotExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}