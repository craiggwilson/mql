package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.BooleanExpression
import com.craiggwilson.mql.ast.DecimalExpression
import com.craiggwilson.mql.ast.DoubleExpression
import com.craiggwilson.mql.ast.FieldReferenceExpression
import com.craiggwilson.mql.ast.Int32Expression
import com.craiggwilson.mql.ast.Int64Expression
import com.craiggwilson.mql.ast.NotExpression
import com.craiggwilson.mql.ast.NullExpression
import com.craiggwilson.mql.ast.StringExpression

abstract class AbstractExpressionTranslator(private val valueTranslator: ValueTranslator): AbstractTranslator(), ExpressionTranslator {
    abstract override fun visit(n: FieldReferenceExpression): String
    abstract override fun visit(n: NotExpression): String

    // Values
    override fun visit(n: BooleanExpression): String {
        return valueTranslator.visit(n)
    }

    override fun visit(n: DecimalExpression): String {
        return valueTranslator.visit(n)
    }

    override fun visit(n: DoubleExpression): String {
        return valueTranslator.visit(n)
    }

    override fun visit(n: Int32Expression): String {
        return valueTranslator.visit(n)
    }

    override fun visit(n: Int64Expression): String {
        return valueTranslator.visit(n)
    }

    override fun visit(n: NullExpression): String {
        return valueTranslator.visit(n)
    }

    override fun visit(n: StringExpression): String {
        return valueTranslator.visit(n)
    }
}