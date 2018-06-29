package com.craiggwilson.mql.library.translators

import com.craiggwilson.mql.library.ast.BooleanExpression
import com.craiggwilson.mql.library.ast.DecimalExpression
import com.craiggwilson.mql.library.ast.DoubleExpression
import com.craiggwilson.mql.library.ast.Int32Expression
import com.craiggwilson.mql.library.ast.Int64Expression
import com.craiggwilson.mql.library.ast.NewArrayExpression
import com.craiggwilson.mql.library.ast.NewDocumentExpression
import com.craiggwilson.mql.library.ast.NullExpression
import com.craiggwilson.mql.library.ast.RegexExpression
import com.craiggwilson.mql.library.ast.StringExpression
import org.bson.BsonArray
import org.bson.BsonBoolean
import org.bson.BsonDecimal128
import org.bson.BsonDocument
import org.bson.BsonDouble
import org.bson.BsonElement
import org.bson.BsonInt32
import org.bson.BsonInt64
import org.bson.BsonNull
import org.bson.BsonRegularExpression
import org.bson.BsonString
import org.bson.BsonValue
import org.bson.types.Decimal128

internal abstract class AbstractExpressionTranslator : AbstractTranslator() {
    // Expressions

    override fun visit(n: NewArrayExpression): BsonValue {
        val items = n.items.map { visit(it) }

        return BsonArray(items)
    }

    override fun visit(n: NewDocumentExpression): BsonValue {
        val elements = n.elements.map { BsonElement(it.field.flatten().name.name, visit(it.expression)) }

        return BsonDocument(elements)
    }

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

    override fun visit(n: RegexExpression): BsonValue {
        return BsonRegularExpression(n.pattern, n.options)
    }

    override fun visit(n: StringExpression): BsonValue {
        return BsonString(n.value)
    }
}
