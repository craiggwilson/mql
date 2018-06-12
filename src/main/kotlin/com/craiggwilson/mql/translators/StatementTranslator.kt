package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.Direction
import com.craiggwilson.mql.ast.LimitStage
import com.craiggwilson.mql.ast.ProjectStage
import com.craiggwilson.mql.ast.SkipStage
import com.craiggwilson.mql.ast.SortStage
import com.craiggwilson.mql.ast.Statement
import com.craiggwilson.mql.ast.UnwindStage

fun Statement.toShell(): String {
    return StatementTranslator(ShellValueTranslator()).visit(this)
}

class StatementTranslator(valueTranslator: ValueTranslator) : AbstractTranslator() {
    private val aggLanguageTranslator = AggregateLanguageExpressionTranslator(valueTranslator)
    private val queryLanguageTranslator = QueryLanguageExpressionTranslator(valueTranslator)

    // Nodes
    override fun visit(n: Statement): String {
        val pipelineString = n.pipeline.joinToString(prefix = "[", postfix = "]") { visit(it) as String }

        return "db.${n.collectionName.name}.aggregate($pipelineString)"
    }

    // Stages
    override fun visit(n: LimitStage): String {
        return "{ \$limit: ${n.limit} }"
    }

    override fun visit(n: ProjectStage): String {
        val fieldString = n.items.joinToString { item ->
            val fieldName = visit(item.field)
            val expression = aggLanguageTranslator.visit(item.expression)

            "$fieldName: $expression"
        }

        return "{ \$project: { $fieldString } }"
    }

    override fun visit(n: SkipStage): String {
        return "{ \$skip: ${n.skip} }"
    }

    override fun visit(n: SortStage): String {
        val fieldString = n.fields.joinToString { field ->
            val fieldName = queryLanguageTranslator.visit(field.field)
            val direction = if (field.direction == Direction.ASCENDING) {
                "1"
            } else {
                "-1"
            }

            "$fieldName: $direction"
        }

        return "{ \$sort: { $fieldString } }"
    }

    override fun visit(n: UnwindStage): String {
        var options = "path: ${aggLanguageTranslator.visit(n.field)}, preserveNullAndEmptyArrays: ${n.preserveNullAndEmpty}"
        if (n.indexField != null) {
            options += ", includeArrayIndex: ${visit(n.indexField)}"
        }

        return "{ \$unwind: { $options } }"
    }
}