package com.craiggwilson.mql.library.translators

import com.craiggwilson.mql.library.ast.Direction
import com.craiggwilson.mql.library.ast.GroupStage
import com.craiggwilson.mql.library.ast.LimitStage
import com.craiggwilson.mql.library.ast.LookupStage
import com.craiggwilson.mql.library.ast.MatchStage
import com.craiggwilson.mql.library.ast.ProjectStage
import com.craiggwilson.mql.library.ast.QueryStatement
import com.craiggwilson.mql.library.ast.SkipStage
import com.craiggwilson.mql.library.ast.SortStage
import com.craiggwilson.mql.library.ast.UnwindStage
import org.bson.BsonArray
import org.bson.BsonBoolean
import org.bson.BsonDocument
import org.bson.BsonElement
import org.bson.BsonInt32
import org.bson.BsonInt64
import org.bson.BsonString
import org.bson.BsonValue

fun QueryStatement.translatePipeline(): List<BsonValue> {
    return stages.mapNotNull { BsonTranslator.visit(it) }
}

object BsonTranslator : AbstractTranslator() {

    override fun visit(n: GroupStage): BsonValue {
        val body = BsonDocument()
        body["_id"] = translateToAggregationLanguage(n.by)

        val aggregates = translateToAggregationLanguage(n.projection) as BsonDocument
        aggregates.forEach { agg ->
            body[agg.key] = agg.value
        }

        return BsonDocument("\$group", body)
    }

    override fun visit(n: LimitStage) = BsonDocument("\$limit", BsonInt64(n.limit))

    override fun visit(n: LookupStage): BsonDocument {
        val body = BsonDocument()
        body.append("from", BsonString(n.statement.collectionName.name))
        if (n.variables.isNotEmpty()) {
            val letDocument = BsonDocument()
            body.append("let", letDocument)
            n.variables.forEach { variable ->
                letDocument.append(
                    variable.name.name,
                    translateToAggregationLanguage(variable.expression)
                )
            }
        }
        body.append("pipeline", BsonArray(n.statement.stages.mapNotNull { visit(it) }))
        body.append("as", BsonString(n.field.flatten().name.name))

        return BsonDocument("\$lookup", body)
    }

    override fun visit(n: MatchStage) = BsonDocument(
        "\$match",
        translateToQueryLanguage(n.expression) as BsonDocument
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
                        translateToAggregationLanguage(item.expression)
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
