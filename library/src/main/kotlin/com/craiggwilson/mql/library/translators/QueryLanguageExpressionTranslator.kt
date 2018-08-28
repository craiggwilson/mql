package com.craiggwilson.mql.library.translators

import com.craiggwilson.mql.library.ast.AddExpression
import com.craiggwilson.mql.library.ast.AndExpression
import com.craiggwilson.mql.library.ast.ArrayAccessExpression
import com.craiggwilson.mql.library.ast.ConditionalExpression
import com.craiggwilson.mql.library.ast.DivideExpression
import com.craiggwilson.mql.library.ast.EqualsExpression
import com.craiggwilson.mql.library.ast.Expression
import com.craiggwilson.mql.library.ast.FieldName
import com.craiggwilson.mql.library.ast.FieldReferenceExpression
import com.craiggwilson.mql.library.ast.FunctionCallExpression
import com.craiggwilson.mql.library.ast.GreaterThanExpression
import com.craiggwilson.mql.library.ast.GreaterThanOrEqualsExpression
import com.craiggwilson.mql.library.ast.InExpression
import com.craiggwilson.mql.library.ast.Int32Expression
import com.craiggwilson.mql.library.ast.Int64Expression
import com.craiggwilson.mql.library.ast.LessThanExpression
import com.craiggwilson.mql.library.ast.LessThanOrEqualsExpression
import com.craiggwilson.mql.library.ast.LetExpression
import com.craiggwilson.mql.library.ast.LikeExpression
import com.craiggwilson.mql.library.ast.ModExpression
import com.craiggwilson.mql.library.ast.MultiplyExpression
import com.craiggwilson.mql.library.ast.Node
import com.craiggwilson.mql.library.ast.NodeVisitor
import com.craiggwilson.mql.library.ast.NotEqualsExpression
import com.craiggwilson.mql.library.ast.NotExpression
import com.craiggwilson.mql.library.ast.OrExpression
import com.craiggwilson.mql.library.ast.PowerExpression
import com.craiggwilson.mql.library.ast.RangeExpression
import com.craiggwilson.mql.library.ast.SubtractExpression
import com.craiggwilson.mql.library.ast.VariableReferenceExpression
import org.bson.BsonArray
import org.bson.BsonDocument
import org.bson.BsonString
import org.bson.BsonValue

internal fun translateToQueryLanguage(n: Node?): BsonValue? {
    return QueryLanguageExpressionTranslator.visit(n)
}

private object QueryLanguageNormalizer : NodeVisitor() {

    override fun visit(n: ArrayAccessExpression): Node {
        if (n.array is FieldReferenceExpression) {
            when (n.accessor) {
                is Int32Expression -> return n.array.update(
                    n.array.parent,
                    FieldName("${n.array.name.name}.${n.accessor.value}"))
                is Int64Expression -> return n.array.update(
                    n.array.parent,
                    FieldName("${n.array.name.name}.${n.accessor.value}"))
            }
        }

        return super.visit(n)
    }

    override fun visit(n: EqualsExpression): Node {
        val left = visit(n.left) as Expression
        val right = visit(n.right) as Expression
        return if (right is FieldReferenceExpression) {
            EqualsExpression(right, left)
        } else if (right is ModExpression && right.left is FieldReferenceExpression) {
            EqualsExpression(right, left)
        } else n.update(left, right)
    }

    override fun visit(n: GreaterThanExpression): Node {
        val left = visit(n.left) as Expression
        val right = visit(n.right) as Expression
        return if (right is FieldReferenceExpression) {
            LessThanExpression(right, left)
        } else n.update(left, right)
    }

    override fun visit(n: GreaterThanOrEqualsExpression): Node {
        val left = visit(n.left) as Expression
        val right = visit(n.right) as Expression
        return if (right is FieldReferenceExpression) {
            LessThanOrEqualsExpression(right, left)
        } else n.update(left, right)
    }

    override fun visit(n: LessThanExpression): Node {
        val left = visit(n.left) as Expression
        val right = visit(n.right) as Expression
        return if (right is FieldReferenceExpression) {
            GreaterThanExpression(right, left)
        } else n.update(left, right)
    }

    override fun visit(n: LessThanOrEqualsExpression): Node {
        val left = visit(n.left) as Expression
        val right = visit(n.right) as Expression
        return if (right is FieldReferenceExpression) {
            GreaterThanOrEqualsExpression(right, left)
        } else n.update(left, right)
    }

    override fun visit(n: NotEqualsExpression): Node {
        val left = visit(n.left) as Expression
        val right = visit(n.right) as Expression
        return if (right is FieldReferenceExpression) {
            NotEqualsExpression(right, left)
        } else n.update(left, right)
    }
}

private object QueryLanguageExpressionTranslator : ValueExpressionTranslator() {

    override fun visit(n: Node?): BsonValue? {
        if (n == null) {
            return null
        }

        return try {
            val normalized = QueryLanguageNormalizer.visit(n)
            super.visit(normalized)
        } catch (e: UnsupportedOperationException) {
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
                if (x.size == 1 && !acc.first.containsKey(x.firstKey)) {
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
        if (n.array is FieldReferenceExpression) {
            val fieldName = getFieldName(n.array)
            when (n.accessor) {
                is Int32Expression -> return BsonString("$fieldName.${n.accessor.value}")
                is Int64Expression -> return BsonString("$fieldName.${n.accessor.value}")
            }
        }

        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: ConditionalExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: DivideExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: EqualsExpression): BsonValue {
        if (n.left is ModExpression) {
            val fieldName = getFieldName(n.left.left)
            val divisor = visit(n.left.right)
            val remainder = visit(n.right)
            return BsonDocument(fieldName, BsonDocument("\$mod", BsonArray(listOf(divisor, remainder))))
        }

        val fieldName = getFieldName(n.left)
        return BsonDocument(fieldName, BsonDocument("\$eq", visit(n.right)))
    }

    override fun visit(n: FieldReferenceExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: FunctionCallExpression): BsonValue {
        if (n.arguments.size == 2) {
            val fieldName = getFieldName(n.arguments[0].expression)
            val value = visit(n.arguments[1].expression)
            return BsonDocument(fieldName, BsonDocument("\$${n.name.name}", value))
        }

        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: GreaterThanExpression): BsonValue {
        val fieldName = getFieldName(n.left)
        return BsonDocument(fieldName, BsonDocument("\$gt", visit(n.right)))
    }

    override fun visit(n: GreaterThanOrEqualsExpression): BsonValue {
        val fieldName = getFieldName(n.left)
        return BsonDocument(fieldName, BsonDocument("\$gte", visit(n.right)))
    }

    override fun visit(n: InExpression): BsonValue {
        val fieldName = getFieldName(n.left)
        return BsonDocument(fieldName, BsonDocument("\$in", visit(n.right)))
    }

    override fun visit(n: LessThanExpression): BsonValue {
        val fieldName = getFieldName(n.left)
        return BsonDocument(fieldName, BsonDocument("\$lt", visit(n.right)))
    }

    override fun visit(n: LessThanOrEqualsExpression): BsonValue {
        val fieldName = getFieldName(n.left)
        return BsonDocument(fieldName, BsonDocument("\$lte", visit(n.right)))
    }

    override fun visit(n: LetExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: LikeExpression): BsonValue {
        val fieldName = getFieldName(n.left)
        return BsonDocument(fieldName, visit(n.right))
    }

    override fun visit(n: ModExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: MultiplyExpression): BsonValue {
        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }

    override fun visit(n: NotEqualsExpression): BsonValue {
        val fieldName = getFieldName(n.left)
        return BsonDocument(fieldName, BsonDocument("\$ne", visit(n.right)))
    }

    override fun visit(n: NotExpression): BsonValue {
        val inner = visit(n.expression) as BsonDocument
        if (inner.size == 1) {
            val (name, value) = inner.entries.single()
            if (name.startsWith("\$")) {
                when (name) {
                    "\$or" -> return BsonDocument("\$nor", value)
                    "\$nor" -> return BsonDocument("\$or", value)
                }
            } else if (value is BsonDocument && value.size == 1) {
                val (innerName, innerValue) = value.entries.first()
                if (innerName.startsWith("\$")) {
                    return when (innerName) {
                        "\$eq" -> BsonDocument(name, BsonDocument("\$ne", innerValue))
                        "\$in" -> BsonDocument(name, BsonDocument("\$nin", innerValue))
                        "\$ne" -> BsonDocument(name, BsonDocument("\$eq", innerValue))
                        "\$nin" -> BsonDocument(name, BsonDocument("\$in", innerValue))
                        "\$regex" -> BsonDocument(name, BsonDocument("\$nin", BsonArray(listOf(innerValue))))
                        "\$not" -> BsonDocument(name, innerValue)
                        else -> BsonDocument(name, BsonDocument("\$not", BsonDocument(innerName, innerValue)))
                    }
                }
            }
        }

        return BsonDocument("\$nor", BsonArray(listOf(inner)))
    }

    override fun visit(n: OrExpression): BsonValue {
        val parts = n.flatten().map { visit(it) }
        return BsonDocument("\$or", BsonArray(parts))
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
        if (n is FieldReferenceExpression) {
            val flattened = n.flatten()
            if (flattened.parent == null) {
                return flattened.name.name
            }
        }

        throw UnsupportedOperationException("$n is not allowed in a \$match clause")
    }
}
