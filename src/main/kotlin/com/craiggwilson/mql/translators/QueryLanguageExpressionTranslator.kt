package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.AddExpression
import com.craiggwilson.mql.ast.AndExpression
import com.craiggwilson.mql.ast.ArrayAccessExpression
import com.craiggwilson.mql.ast.ConditionalExpression
import com.craiggwilson.mql.ast.DivideExpression
import com.craiggwilson.mql.ast.EqualsExpression
import com.craiggwilson.mql.ast.Expression
import com.craiggwilson.mql.ast.FieldReferenceExpression
import com.craiggwilson.mql.ast.FunctionCallExpression
import com.craiggwilson.mql.ast.GreaterThanExpression
import com.craiggwilson.mql.ast.GreaterThanOrEqualsExpression
import com.craiggwilson.mql.ast.LessThanExpression
import com.craiggwilson.mql.ast.LessThanOrEqualsExpression
import com.craiggwilson.mql.ast.LetExpression
import com.craiggwilson.mql.ast.ModExpression
import com.craiggwilson.mql.ast.MultiplyExpression
import com.craiggwilson.mql.ast.Node
import com.craiggwilson.mql.ast.NotEqualsExpression
import com.craiggwilson.mql.ast.NotExpression
import com.craiggwilson.mql.ast.OrExpression
import com.craiggwilson.mql.ast.PowerExpression
import com.craiggwilson.mql.ast.RangeExpression
import com.craiggwilson.mql.ast.SubtractExpression
import com.craiggwilson.mql.ast.VariableReferenceExpression
import org.bson.BsonArray
import org.bson.BsonDocument
import org.bson.BsonValue

internal object QueryLanguageExpressionTranslator : AbstractExpressionTranslator() {

    override fun visit(n: Node?): BsonValue? {
        if (n == null) {
            return null
        }

        return try {
            super.visit(n)
        } catch(e: UnsupportedOperationException) {
            if (n is Expression) {
                BsonDocument("\$expr", AggregateLanguageExpressionTranslator.visit(n))
            } else {
                throw e
            }
        }
    }

    override fun visit(n: AddExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: AndExpression): BsonValue {
        val (merged, remaining) = n.flatten()
            .map { visit(it) as BsonDocument }
            .fold(BsonDocument() to mutableListOf<BsonDocument>()) { acc, x ->
                if (x.size== 1 && !acc.first.containsKey(x.firstKey)) {
                    acc.first[x.firstKey] = x[x.firstKey]
                } else {
                    acc.second += x
                }

                acc
            }

        val parts = listOf(merged) + remaining

        if (parts.size == 1) {
            return parts[0]
        }

        return BsonDocument(
            "\$and",
            BsonArray(parts)
        )
    }

    override fun visit(n: ArrayAccessExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: ConditionalExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: DivideExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: EqualsExpression): BsonValue {
        val fieldName = getFieldName(n.left)
        return BsonDocument(fieldName, visit(n.right))
    }

    override fun visit(n: FieldReferenceExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: FunctionCallExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: GreaterThanExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: GreaterThanOrEqualsExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: LessThanExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: LessThanOrEqualsExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: LetExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: ModExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: MultiplyExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: NotEqualsExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: NotExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: OrExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: PowerExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: RangeExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: SubtractExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: VariableReferenceExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    private fun getFieldName(n: Expression): String {
        if(n is FieldReferenceExpression) {
            val flattened = n.flatten()
            if (flattened.parent == null) {
                return flattened.name.name
            }
        }

        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }
}