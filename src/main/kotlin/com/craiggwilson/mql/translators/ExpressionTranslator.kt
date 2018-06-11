package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.AddExpression
import com.craiggwilson.mql.ast.AndExpression
import com.craiggwilson.mql.ast.ArrayAccessExpression
import com.craiggwilson.mql.ast.BooleanExpression
import com.craiggwilson.mql.ast.ConditionalExpression
import com.craiggwilson.mql.ast.DecimalExpression
import com.craiggwilson.mql.ast.DivideExpression
import com.craiggwilson.mql.ast.DoubleExpression
import com.craiggwilson.mql.ast.EqualsExpression
import com.craiggwilson.mql.ast.FieldReferenceExpression
import com.craiggwilson.mql.ast.FunctionCallExpression
import com.craiggwilson.mql.ast.GreaterThanExpression
import com.craiggwilson.mql.ast.GreaterThanOrEqualsExpression
import com.craiggwilson.mql.ast.Int32Expression
import com.craiggwilson.mql.ast.Int64Expression
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
import com.craiggwilson.mql.ast.StringExpression
import com.craiggwilson.mql.ast.SubtractExpression
import com.craiggwilson.mql.ast.VariableReferenceExpression

interface ExpressionTranslator {

    fun visit(n: AddExpression): String
    fun visit(n: AndExpression): String
    fun visit(n: ArrayAccessExpression): String
    fun visit(n: ConditionalExpression): String
    fun visit(n: DivideExpression): String
    fun visit(n: EqualsExpression): String
    fun visit(n: FieldReferenceExpression): String
    fun visit(n: FunctionCallExpression): String
    fun visit(n: GreaterThanExpression): String
    fun visit(n: GreaterThanOrEqualsExpression): String
    fun visit(n: LessThanExpression): String
    fun visit(n: LessThanOrEqualsExpression): String
    fun visit(n: LetExpression): String
    fun visit(n: ModExpression): String
    fun visit(n: MultiplyExpression): String
    fun visit(n: NewArrayExpression): String
    fun visit(n: NewDocumentExpression): String
    fun visit(n: NotEqualsExpression): String
    fun visit(n: NotExpression): String
    fun visit(n: OrExpression): String
    fun visit(n: PowerExpression): String
    fun visit(n: RangeExpression): String
    fun visit(n: SubtractExpression): String
    fun visit(n: VariableReferenceExpression): String

    // Values
    fun visit(n: BooleanExpression): String
    fun visit(n: DecimalExpression): String
    fun visit(n: DoubleExpression): String
    fun visit(n: Int32Expression): String
    fun visit(n: Int64Expression): String
    fun visit(n: NullExpression): String
    fun visit(n: StringExpression): String
}