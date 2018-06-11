package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.BooleanExpression
import com.craiggwilson.mql.ast.DecimalExpression
import com.craiggwilson.mql.ast.DoubleExpression
import com.craiggwilson.mql.ast.Int32Expression
import com.craiggwilson.mql.ast.Int64Expression
import com.craiggwilson.mql.ast.NullExpression
import com.craiggwilson.mql.ast.StringExpression

class ShellValueTranslator : AbstractTranslator(), ValueTranslator {
    override fun visit(n: BooleanExpression): String {
        return n.value.toString()
    }

    override fun visit(n: DecimalExpression): String {
        return "NumberDecimal(\"${n.value}\")"
    }

    override fun visit(n: DoubleExpression): String {
        return n.value.toString()
    }

    override fun visit(n: Int32Expression): String {
        return "NumberInt(\"${n.value}\")"
    }

    override fun visit(n: Int64Expression): String {
        return "NumberLong(\"${n.value}\")"
    }

    override fun visit(n: NullExpression): String {
        return "null"
    }

    override fun visit(n: StringExpression): String {
        return quote(n.value)
    }
}