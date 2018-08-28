package com.craiggwilson.mql.library.translators

import com.craiggwilson.mql.library.ast.CollectionName
import com.craiggwilson.mql.library.ast.DeleteStatement
import com.craiggwilson.mql.library.ast.InsertStatement
import com.craiggwilson.mql.library.ast.QueryStatement
import com.craiggwilson.mql.library.ast.Statement
import com.craiggwilson.mql.library.ast.UpdateStatement
import com.craiggwilson.mql.library.ast.Visitor
import com.craiggwilson.mql.library.parser.ParseException
import org.bson.BsonArray
import org.bson.BsonDocument
import org.bson.BsonValue
import org.bson.json.JsonMode
import org.bson.json.JsonWriterSettings

fun Statement.toShell(pretty: Boolean = false): String {
    return ShellStatementTranslator(pretty).visit(this)
        ?: throw ParseException("unsupported statement")
}

private class ShellStatementTranslator(private val pretty: Boolean) : Visitor<String>() {

    override fun visit(n: DeleteStatement): String {
        val db = getDb(n.collectionName)
        val predicate = getJson(translateToQueryLanguage(n.predicate))
        val methodName = if(n.many) "deleteMany" else "deleteOne"


        return "$db.${n.collectionName.name}.$methodName($predicate)"
    }

    override fun visit(n: InsertStatement): String {
        val db = getDb(n.collectionName)
        val valueTranslator = ValueExpressionTranslator()
        val documents = n.documents.map { valueTranslator.visit(it) }
        val jsonDocuments = getJsonArray(documents)
        return "$db.${n.collectionName.name}.insert($jsonDocuments)"
    }

    override fun visit(n: QueryStatement): String {
        val pipeline = n.translatePipeline()
        val db = getDb(n.collectionName)
        val jsonStages = getJsonArray(pipeline)
        return "$db.${n.collectionName.name}.aggregate($jsonStages)"
    }

    override fun visit(n: UpdateStatement): String {
        val db = getDb(n.collectionName)
        val predicate = getJson(translateToQueryLanguage(n.predicate))
        val set = getJson(translateToUpdateLanguage(n.set))
        val methodName = if(n.many) "updateMany" else "updateOne"

        return "$db.${n.collectionName.name}.$methodName($predicate, $set)"
    }

    private fun getDb(collectionName: CollectionName): String {
        return if (collectionName.databaseName != null) {
            "db.getSiblingDB(\"${collectionName.databaseName}"
        } else "db"
    }

    private fun getJson(value: BsonValue?): String {
        if (value == null) {
            return "null"
        }

        val settings = JsonWriterSettings.builder().outputMode(JsonMode.SHELL).indent(pretty).build()
        return value.asDocument().toJson(settings)
    }

    private fun getJsonArray(array: List<BsonValue>): String {
        val settings = JsonWriterSettings.builder().outputMode(JsonMode.SHELL).indent(pretty).build()
        val dummyDoc = BsonDocument("d", BsonArray(array))
        val json = dummyDoc.toJson(settings)
        val startIndex = json.indexOf('[')
        return json.substring(startIndex until json.length-1)
    }
}
