package com.craiggwilson.mql.library.translators

import com.craiggwilson.mql.library.ast.AddExpression
import com.craiggwilson.mql.library.ast.ArrayAccessExpression
import com.craiggwilson.mql.library.ast.Expression
import com.craiggwilson.mql.library.ast.FieldName
import com.craiggwilson.mql.library.ast.FieldReferenceExpression
import com.craiggwilson.mql.library.ast.Int32Expression
import com.craiggwilson.mql.library.ast.Int64Expression
import com.craiggwilson.mql.library.ast.NewDocumentExpression
import com.craiggwilson.mql.library.ast.Node
import com.craiggwilson.mql.library.ast.NodeVisitor
import com.craiggwilson.mql.library.ast.NumberExpression
import com.craiggwilson.mql.library.ast.SubtractExpression
import com.craiggwilson.mql.library.ast.ValueExpression
import com.craiggwilson.mql.library.parser.ParseException
import org.bson.BsonDocument
import org.bson.BsonValue

internal fun translateToUpdateLanguage(n: Node?): BsonValue? {
    return UpdateLanguageExpressionTranslator.visit(n)
}

private object UpdateLanguageNormalizer : NodeVisitor() {

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
}

private object UpdateLanguageExpressionTranslator : ValueExpressionTranslator() {

    override fun visit(n: Node?): BsonValue? {
        if (n == null) {
            return null
        }

        val normalized = UpdateLanguageNormalizer.visit(n)
        return super.visit(normalized)
    }

    override fun visit(n: NewDocumentExpression): BsonValue {
        return n.elements.fold(BsonDocument()) { result, e ->
            val target = e.field.flatten()
            when(e.expression) {
                is AddExpression -> {
                    val target2 = e.expression.left as? FieldReferenceExpression
                        ?: throw ParseException("only fields are allowed on the left side of an add expression in an update statement")

                    if (target.name != target2.flatten().name) {
                        throw ParseException("target and the increment field must be the same")
                    }

                    val inc = e.expression.right as? NumberExpression
                        ?: throw ParseException("only a number can be used to increment a field")

                    val incValue = visit(inc) as BsonValue

                    result.getOrPut("\$inc") { BsonDocument() }
                        .asDocument()
                        .append(target.name.name, incValue)

                    result
                }
                is SubtractExpression -> {
                    val target2 = e.expression.left as? FieldReferenceExpression
                        ?: throw ParseException("only fields are allowed on the left side of a subtract expression in an update statement")

                    if (target.name != target2.flatten().name) {
                        throw ParseException("target and the decrement field must be the same")
                    }

                    val inc = e.expression.right as? NumberExpression
                        ?: throw ParseException("only a number can be used to decrement a field")

                    val incValue = visit(inc.negate()) as BsonValue

                    result.getOrPut("\$inc") { BsonDocument() }
                        .asDocument()
                        .append(target.name.name, incValue)

                    result
                }
                is ValueExpression -> {
                    val value = visit(e.expression) as BsonValue

                    result.getOrPut("\$set") { BsonDocument() }
                        .asDocument()
                        .append(target.name.name, value)

                    result
                }
                else -> throw ParseException("unsupported update operation ${e.expression}")
            }
        }
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
