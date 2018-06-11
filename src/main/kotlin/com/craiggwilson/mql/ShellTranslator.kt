package com.craiggwilson.mql

import com.craiggwilson.mql.ast.BooleanExpression
import com.craiggwilson.mql.ast.DecimalExpression
import com.craiggwilson.mql.ast.Direction
import com.craiggwilson.mql.ast.DoubleExpression
import com.craiggwilson.mql.ast.FieldDeclaration
import com.craiggwilson.mql.ast.FieldReferenceExpression
import com.craiggwilson.mql.ast.Int32Expression
import com.craiggwilson.mql.ast.Int64Expression
import com.craiggwilson.mql.ast.LimitStage
import com.craiggwilson.mql.ast.NullExpression
import com.craiggwilson.mql.ast.ProjectStage
import com.craiggwilson.mql.ast.SkipStage
import com.craiggwilson.mql.ast.SortStage
import com.craiggwilson.mql.ast.Statement
import com.craiggwilson.mql.ast.StringExpression
import com.craiggwilson.mql.ast.UnwindStage
import com.craiggwilson.mql.ast.Visitor

fun Statement.toShell(): String {
    return ShellTranslator().visit(this)
}

class ShellTranslator : Visitor<String>() {
    private var dollarReference = false

    override fun visit(n: BooleanExpression): String {
        return n.toString()
    }

    override fun visit(n: DecimalExpression): String {
        return "NumberDecimal(\"${n.value}\")"
    }

    override fun visit(n: DoubleExpression): String {
        return n.value.toString()
    }

    override fun visit(n: FieldReferenceExpression): String {
        val flattened = flatten(n)
        return quote(if (dollarReference) {
            "\$${flattened.name.name}"
        } else {
            flattened.name.name
        })
    }

    override fun visit(n: Int32Expression): String {
        return "NumberInt(\"${n.value}\")"
    }

    override fun visit(n: Int64Expression): String {
        return "NumberLong(\"${n.value}\")"
    }

    override fun visit(n: NullExpression): String {
        return "null"
    }

    override fun visit(n: StringExpression): String {
        return quote(n.value)
    }

    // Nodes
    override fun visit(n: FieldDeclaration): String {
        return if (n.parent != null) {
            visit(n.parent) + "." + n.name.name
        } else n.name.name
    }

    override fun visit(n: Statement): String {
        val pipelineString = n.pipeline.joinToString(prefix = "[", postfix = "]") { visit(it) as String }

        return "db.${n.collectionName.name}.aggregate($pipelineString)"
    }

    // Stages
    override fun visit(n: LimitStage): String {
        return "{ \$limit: ${n.limit} }"
    }

    override fun visit(n: ProjectStage): String {
        val oldDollarReference = dollarReference
        dollarReference = true
        val fieldString = n.items.joinToString { item ->
            val fieldName = quote(visit(item.field))
            val expression = visit(item.expression)

            "$fieldName: $expression"
        }
        dollarReference = oldDollarReference

        return "{ \$project: { $fieldString } }"
    }

    override fun visit(n: SkipStage): String {
        return "{ \$skip: ${n.skip} }"
    }

    override fun visit(n: SortStage): String {
        val oldDollarReference = dollarReference
        dollarReference = false
        val fieldString = n.fields.joinToString { field ->
            val fieldName = visit(field.field)
            val direction = if (field.direction == Direction.ASCENDING) {
                "1"
            } else {
                "-1"
            }

            "$fieldName: $direction"
        }
        dollarReference = oldDollarReference

        return "{ \$sort: { $fieldString } }"
    }

    override fun visit(n: UnwindStage): String {
        val oldDollarReference = dollarReference
        dollarReference = true
        var options = "path: ${visit(n.field)}, preserveNullAndEmptyArrays: ${n.preserveNullAndEmpty}"
        if (n.indexField != null) {
            options += ", includeArrayIndex: ${quote(visit(n.indexField))}"
        }
        dollarReference = oldDollarReference

        return "{ \$unwind: { $options } }"
    }

    private fun flatten(field: FieldReferenceExpression): FieldReferenceExpression {
        if (field.parent != null && field.parent is FieldReferenceExpression) {
            val combined = FieldReferenceExpression(field.parent.parent, field.parent.name.append(field.name))
            return flatten(combined)
        } else {
            return field
        }
    }

    private fun quote(n: String): String {
        return "\"$n\""
    }
}