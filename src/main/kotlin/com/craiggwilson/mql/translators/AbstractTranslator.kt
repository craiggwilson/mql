package com.craiggwilson.mql.translators

import com.craiggwilson.mql.ast.FieldDeclaration
import com.craiggwilson.mql.ast.FieldReferenceExpression
import com.craiggwilson.mql.ast.Visitor

abstract class AbstractTranslator : Visitor<String>() {
    override fun visit(n: FieldDeclaration): String {
        val flattened = flatten(n)
        return quote("${flattened.name.name}")
    }

    protected fun flatten(field: FieldReferenceExpression): FieldReferenceExpression {
        return if (field.parent != null && field.parent is FieldReferenceExpression) {
            val combined = FieldReferenceExpression(field.parent.parent, field.parent.name.append(field.name))
            flatten(combined)
        } else {
            field
        }
    }

    protected fun quote(n: String): String {
        return "\"$n\""
    }

    private fun flatten(field: FieldDeclaration): FieldDeclaration{
        if (field.parent != null) {
            val combined = FieldDeclaration(field.parent.parent, field.parent.name.append(field.name))
            return flatten(combined)
        } else {
            return field
        }
    }
}