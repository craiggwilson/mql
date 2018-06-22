package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.Direction
import com.craiggwilson.mql.ast.LimitStage
import com.craiggwilson.mql.ast.MatchStage
import com.craiggwilson.mql.ast.ProjectStage
import com.craiggwilson.mql.ast.SkipStage
import com.craiggwilson.mql.ast.SortStage
import com.craiggwilson.mql.ast.Statement
import com.craiggwilson.mql.ast.UnwindStage
import com.craiggwilson.mql.visitors.DefaultNodeRewriter
import com.craiggwilson.mql.visitors.NodeRewriter
import com.craiggwilson.mql.visitors.Rewriter
import org.bson.BsonArray
import org.bson.BsonBoolean
import org.bson.BsonDocument
import org.bson.BsonElement
import org.bson.BsonInt32
import org.bson.BsonInt64
import org.bson.BsonString

fun Statement.translate(): BsonArray {
    return StatementTranslator().visit(this)
}

class StatementTranslator(rewriter: NodeRewriter = DefaultNodeRewriter) : AbstractTranslator() {
    private val preProcessor = Rewriter(rewriter)
    private val aggLanguageTranslator = AggregateLanguageExpressionTranslator
    private val queryLanguageTranslator = QueryLanguageExpressionTranslator

    // Nodes
    override fun visit(n: Statement): BsonArray {
        val stmt = preProcessor.visit(n) as Statement
        return BsonArray(stmt.pipeline.map { visit(it) })
    }

    // Stages
    override fun visit(n: LimitStage) = BsonDocument("\$limit", BsonInt64(n.limit))

    override fun visit(n: MatchStage) = BsonDocument(
        "\$match",
        queryLanguageTranslator.visit(n.expression) as BsonDocument
    )

    override fun visit(n: ProjectStage) = BsonDocument(
        "\$project",
        BsonDocument(
            n.items.map { item ->
                BsonElement(
                    item.field.flatten().name.name,
                    aggLanguageTranslator.visit(item.expression)
                )
            }
        )
    )

    override fun visit(n: SkipStage) = BsonDocument("\$skip", BsonInt64(n.skip))

    override fun visit(n: SortStage) = BsonDocument(
        "\$sort",
        BsonDocument(
            n.fields.map { field ->
                val ref = field.field.flatten()
                if (ref.parent != null) {
                    throw UnsupportedOperationException("can only specify a field for sorting")
                }

                BsonElement(
                    ref.name.name,
                    if (field.direction == Direction.ASCENDING) {
                        BsonInt32(1)
                    } else {
                        BsonInt32(-1)
                    }
                )
            }
        )
    )

    override fun visit(n: UnwindStage): BsonDocument {
        val ref = n.field.flatten()
        if (ref.parent != null) {
            throw UnsupportedOperationException("can only specify a field for sorting")
        }

        val elements = mutableListOf(
            BsonElement("path", BsonString("\$${ref.name.name}")),
            BsonElement("preserveNullAndEmptyArrays", BsonBoolean(n.preserveNullAndEmpty))
        )

        if (n.indexField != null) {
            elements += BsonElement("includeArrayIndex", BsonString(n.indexField.flatten().name.name))
        }

        return BsonDocument("\$unwind", BsonDocument(elements))
    }
}