package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.BooleanExpression
import com.craiggwilson.mql.ast.DecimalExpression
import com.craiggwilson.mql.ast.DoubleExpression
import com.craiggwilson.mql.ast.FieldDeclaration
import com.craiggwilson.mql.ast.FieldReferenceExpression
import com.craiggwilson.mql.ast.Int32Expression
import com.craiggwilson.mql.ast.Int64Expression
import com.craiggwilson.mql.ast.NotExpression
import com.craiggwilson.mql.ast.NullExpression
import com.craiggwilson.mql.ast.StringExpression

interface ExpressionTranslator {

    fun visit(n: FieldReferenceExpression): String
    fun visit(n: NotExpression): String

    // Values
    fun visit(n: BooleanExpression): String
    fun visit(n: DecimalExpression): String
    fun visit(n: DoubleExpression): String
    fun visit(n: Int32Expression): String
    fun visit(n: Int64Expression): String
    fun visit(n: NullExpression): String
    fun visit(n: StringExpression): String
}