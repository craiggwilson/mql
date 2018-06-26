package com.craiggwilson.mql.library.translators

import com.craiggwilson.mql.library.ast.Direction
import com.craiggwilson.mql.library.ast.GroupStage
import com.craiggwilson.mql.library.ast.LimitStage
import com.craiggwilson.mql.library.ast.MatchStage
import com.craiggwilson.mql.library.ast.ProjectStage
import com.craiggwilson.mql.library.ast.SkipStage
import com.craiggwilson.mql.library.ast.SortStage
import com.craiggwilson.mql.library.ast.Statement
import com.craiggwilson.mql.library.ast.UnwindStage
import com.craiggwilson.mql.library.visitors.DefaultNodeRewriter
import com.craiggwilson.mql.library.visitors.NodeRewriter
import com.craiggwilson.mql.library.visitors.Rewriter
import org.bson.BsonArray
import org.bson.BsonBoolean
import org.bson.BsonDocument
import org.bson.BsonElement
import org.bson.BsonInt32
import org.bson.BsonInt64
import org.bson.BsonString
import org.bson.BsonValue
import org.bson.json.JsonMode
import org.bson.json.JsonWriterSettings

fun Statement.toShell(pretty: Boolean = false): String {
    val pipeline = translatedPipeline()
    val settings = JsonWriterSettings.builder().outputMode(JsonMode.SHELL).indent(pretty).build()
    val dummyDoc = BsonDocument("d", pipeline)
    val json = dummyDoc.toJson(settings)

    val db = if (collectionName.databaseName != null) {
        "db.getSiblingDB(\"${collectionName.databaseName}"
    } else "db"

    return "$db.${collectionName.name}.aggregate(${json.substring(7 until json.length-1)})"
}

fun Statement.translatedPipeline(): BsonArray {
    return StatementTranslator().visit(this)
}

class StatementTranslator(rewriter: NodeRewriter = DefaultNodeRewriter) : AbstractTranslator() {
    private val preProcessor = Rewriter(rewriter)
    private val aggLanguageTranslator = AggregateLanguageExpressionTranslator
    private val queryLanguageTranslator = QueryLanguageExpressionTranslator

    // Nodes
    override fun visit(n: Statement): BsonArray {
        val stmt = preProcessor.visit(n) as Statement
        return BsonArray(stmt.stages.map { visit(it) })
    }

    override fun visit(n: GroupStage): BsonValue {
        val body = BsonDocument()
        body["_id"] = aggLanguageTranslator.visit(n.by)

        val aggregates = aggLanguageTranslator.visit(n.projection) as BsonDocument
        aggregates.forEach { agg ->
            body[agg.key] = agg.value
        }

        return BsonDocument("\$group", body)
    }

    override fun visit(n: LimitStage) = BsonDocument("\$limit", BsonInt64(n.limit))

    override fun visit(n: MatchStage) = BsonDocument(
        "\$match",
        queryLanguageTranslator.visit(n.expression) as BsonDocument
    )

    override fun visit(n: ProjectStage) = BsonDocument(
        "\$project",
        BsonDocument(
            n.items.map { item ->
                val name = item.field.flatten().name.name
                when (item) {
                    is ProjectStage.Item.Exclude -> BsonElement(name, BsonInt32(0))
                    is ProjectStage.Item.Include -> BsonElement(
                        item.field.flatten().name.name,
                        aggLanguageTranslator.visit(item.expression)
                    )
                }
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
