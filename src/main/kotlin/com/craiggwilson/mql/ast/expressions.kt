package com.craiggwilson.mql.ast

abstract class Expression : Node()

// Expressions
data class FieldReferenceExpression(val parent: Expression?, val name: FieldName) : Expression() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(parent: Expression?, name: FieldName): FieldReferenceExpression {
        if (parent !== this.parent || name !== this.name) {
            return FieldReferenceExpression(parent, name)
        }
        return this
    }
}