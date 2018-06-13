package com.craiggwilson.mql.ast

data class FieldDeclaration(val parent: FieldDeclaration?, val name: FieldName) : Node() {
    constructor(name: FieldName): this(null, name)

    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun flatten(): FieldDeclaration {
        var name = this.name
        var parent = this.parent
        while (parent != null) {
            name = parent.name.append(name)
            parent = parent.parent
        }

        return update(null, name)
    }

    fun update(parent: FieldDeclaration?, name: FieldName): FieldDeclaration {
        if (parent !== this.parent || name !== this.name) {
            return FieldDeclaration(parent, name)
        }
        return this
    }
}