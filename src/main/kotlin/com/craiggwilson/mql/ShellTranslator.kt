package com.craiggwilson.mql

import com.craiggwilson.mql.ast.FieldDeclaration
import com.craiggwilson.mql.ast.FieldReferenceExpression
import com.craiggwilson.mql.ast.LimitStage
import com.craiggwilson.mql.ast.SkipStage
import com.craiggwilson.mql.ast.Statement
import com.craiggwilson.mql.ast.UnwindStage
import com.craiggwilson.mql.ast.Visitor

fun Statement.toShell(): String {
    return ShellTranslator().visit(this)
}

class ShellTranslator : Visitor<String>() {
    // Expressions
    override fun visit(n: FieldReferenceExpression): String {
        return if (n.parent != null) {
            visit(n.parent) + "." + n.name.name
        } else n.name.name
    }

    // Nodes
    override fun visit(n: Statement): String {
        val pipelineString = n.pipeline.joinToString(prefix = "[", postfix = "]") { visit(it) as String };

        return "db.${n.collectionName.name}.aggregate($pipelineString)"
    }

    // Stages
    override fun visit(n: LimitStage): String {
        return "{ \$limit: ${n.limit} }"
    }

    override fun visit(n: SkipStage): String {
        return "{ \$skip: ${n.skip} }"
    }

    override fun visit(n: UnwindStage): String {
        var s = "{ \$unwind: { path: ${quoteFieldName(visit(n.field))}, preserveNullAndEmptyArrays: ${n.preserveNullAndEmpty}"
        if (n.indexField != null) {
            s += ", includeArrayIndex: ${quote(visit(n.indexField))}"
        }
        s += " } }"
        return s
    }

    private fun quote(n: String): String {
        return "\"$n\""
    }

    private fun quoteFieldName(n: String): String {
        return "\"\$$n\""

    }

    private fun visit(n: FieldDeclaration): String {
        return if (n.parent != null) {
            visit(n.parent) + "." + n.name.name
        } else n.name.name
    }
}