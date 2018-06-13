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
import org.bson.BsonValue

interface ExpressionTranslator {

    fun visit(n: AddExpression): BsonValue
    fun visit(n: AndExpression): BsonValue
    fun visit(n: ArrayAccessExpression): BsonValue
    fun visit(n: ConditionalExpression): BsonValue
    fun visit(n: DivideExpression): BsonValue
    fun visit(n: EqualsExpression): BsonValue
    fun visit(n: FieldReferenceExpression): BsonValue
    fun visit(n: FunctionCallExpression): BsonValue
    fun visit(n: GreaterThanExpression): BsonValue
    fun visit(n: GreaterThanOrEqualsExpression): BsonValue
    fun visit(n: LessThanExpression): BsonValue
    fun visit(n: LessThanOrEqualsExpression): BsonValue
    fun visit(n: LetExpression): BsonValue
    fun visit(n: ModExpression): BsonValue
    fun visit(n: MultiplyExpression): BsonValue
    fun visit(n: NewArrayExpression): BsonValue
    fun visit(n: NewDocumentExpression): BsonValue
    fun visit(n: NotEqualsExpression): BsonValue
    fun visit(n: NotExpression): BsonValue
    fun visit(n: OrExpression): BsonValue
    fun visit(n: PowerExpression): BsonValue
    fun visit(n: RangeExpression): BsonValue
    fun visit(n: SubtractExpression): BsonValue
    fun visit(n: VariableReferenceExpression): BsonValue

    // Values
    fun visit(n: BooleanExpression): BsonValue
    fun visit(n: DecimalExpression): BsonValue
    fun visit(n: DoubleExpression): BsonValue
    fun visit(n: Int32Expression): BsonValue
    fun visit(n: Int64Expression): BsonValue
    fun visit(n: NullExpression): BsonValue
    fun visit(n: StringExpression): BsonValue
}