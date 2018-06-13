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
import org.bson.BsonArray
import org.bson.BsonBoolean
import org.bson.BsonDecimal128
import org.bson.BsonDocument
import org.bson.BsonDouble
import org.bson.BsonElement
import org.bson.BsonInt32
import org.bson.BsonInt64
import org.bson.BsonNull
import org.bson.BsonString
import org.bson.BsonValue
import org.bson.types.Decimal128

internal abstract class AbstractExpressionTranslator: AbstractTranslator(), ExpressionTranslator {
    // Expressions

    abstract override fun visit(n: AddExpression): BsonValue
    abstract override fun visit(n: AndExpression): BsonValue
    abstract override fun visit(n: ArrayAccessExpression): BsonValue
    abstract override fun visit(n: ConditionalExpression): BsonValue
    abstract override fun visit(n: DivideExpression): BsonValue
    abstract override fun visit(n: EqualsExpression): BsonValue
    abstract override fun visit(n: FieldReferenceExpression): BsonValue
    abstract override fun visit(n: FunctionCallExpression): BsonValue
    abstract override fun visit(n: GreaterThanExpression): BsonValue
    abstract override fun visit(n: GreaterThanOrEqualsExpression): BsonValue
    abstract override fun visit(n: LessThanExpression): BsonValue
    abstract override fun visit(n: LessThanOrEqualsExpression): BsonValue
    abstract override fun visit(n: LetExpression): BsonValue
    abstract override fun visit(n: ModExpression): BsonValue
    abstract override fun visit(n: MultiplyExpression): BsonValue
    override fun visit(n: NewArrayExpression): BsonValue {
        val items = n.items.map { visit(it) }

        return BsonArray(items)
    }

    override fun visit(n: NewDocumentExpression): BsonValue {
        val elements = n.elements.map { BsonElement(it.field.flatten().name.name, visit(it.expression)) }

        return BsonDocument(elements)
    }
    abstract override fun visit(n: NotEqualsExpression): BsonValue
    abstract override fun visit(n: NotExpression): BsonValue
    abstract override fun visit(n: OrExpression): BsonValue
    abstract override fun visit(n: PowerExpression): BsonValue
    abstract override fun visit(n: RangeExpression): BsonValue
    abstract override fun visit(n: SubtractExpression): BsonValue
    abstract override fun visit(n: VariableReferenceExpression): BsonValue

    // Values

    override fun visit(n: BooleanExpression): BsonValue {
        return BsonBoolean(n.value)
    }

    override fun visit(n: DecimalExpression): BsonValue {
        return BsonDecimal128(Decimal128(n.value))
    }

    override fun visit(n: DoubleExpression): BsonValue {
        return BsonDouble(n.value)
    }

    override fun visit(n: Int32Expression): BsonValue {
        return BsonInt32(n.value)
    }

    override fun visit(n: Int64Expression): BsonValue {
        return BsonInt64(n.value)
    }

    override fun visit(n: NullExpression): BsonValue {
        return BsonNull.VALUE
    }

    override fun visit(n: StringExpression): BsonValue {
        return BsonString(n.value)
    }
}