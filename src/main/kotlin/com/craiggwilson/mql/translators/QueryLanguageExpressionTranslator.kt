package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.AddExpression
import com.craiggwilson.mql.ast.AndExpression
import com.craiggwilson.mql.ast.ArrayAccessExpression
import com.craiggwilson.mql.ast.ConditionalExpression
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
import com.craiggwilson.mql.ast.OrExpression
import com.craiggwilson.mql.ast.PowerExpression
import com.craiggwilson.mql.ast.RangeExpression
import com.craiggwilson.mql.ast.SubtractExpression

class QueryLanguageExpressionTranslator(valueTranslator: ValueTranslator) : AbstractExpressionTranslator(valueTranslator) {
    override fun visit(n: FieldReferenceExpression): String {
        val flattened = flatten(n)
        return quote("${flattened.name.name}")
    }


    override fun visit(n: AddExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: AndExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: ArrayAccessExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: ConditionalExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: DivideExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: EqualsExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: GreaterThanExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: GreaterThanOrEqualsExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: LessThanExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: LessThanOrEqualsExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: ModExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: MultiplyExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: NewArrayExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: NewDocumentExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: NotEqualsExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: NotExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: OrExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: PowerExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: RangeExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun visit(n: SubtractExpression): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}