package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.AddExpression
import com.craiggwilson.mql.ast.AndExpression
import com.craiggwilson.mql.ast.ArrayAccessExpression
import com.craiggwilson.mql.ast.BooleanExpression
import com.craiggwilson.mql.ast.DecimalExpression
import com.craiggwilson.mql.ast.DivideExpression
import com.craiggwilson.mql.ast.DoubleExpression
import com.craiggwilson.mql.ast.EqualsExpression
import com.craiggwilson.mql.ast.FieldReferenceExpression
import com.craiggwilson.mql.ast.GreaterThanExpression
import com.craiggwilson.mql.ast.GreaterThanOrEqualsExpression
import com.craiggwilson.mql.ast.Int32Expression
import com.craiggwilson.mql.ast.Int64Expression
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
import com.craiggwilson.mql.ast.StringExpression
import com.craiggwilson.mql.ast.SubtractExpression

abstract class AbstractExpressionTranslator(private val valueTranslator: ValueTranslator): AbstractTranslator(), ExpressionTranslator {
    abstract override fun visit(n: AddExpression): String
    abstract override fun visit(n: AndExpression): String
    abstract override fun visit(n: ArrayAccessExpression): String
    abstract override fun visit(n: DivideExpression): String
    abstract override fun visit(n: EqualsExpression): String
    abstract override fun visit(n: FieldReferenceExpression): String
    abstract override fun visit(n: GreaterThanExpression): String
    abstract override fun visit(n: GreaterThanOrEqualsExpression): String
    abstract override fun visit(n: LessThanExpression): String
    abstract override fun visit(n: LessThanOrEqualsExpression): String
    abstract override fun visit(n: ModExpression): String
    abstract override fun visit(n: MultiplyExpression): String
    abstract override fun visit(n: NewArrayExpression): String
    abstract override fun visit(n: NewDocumentExpression): String
    abstract override fun visit(n: NotEqualsExpression): String
    abstract override fun visit(n: NotExpression): String
    abstract override fun visit(n: OrExpression): String
    abstract override fun visit(n: PowerExpression): String
    abstract override fun visit(n: RangeExpression): String
    abstract override fun visit(n: SubtractExpression): String

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