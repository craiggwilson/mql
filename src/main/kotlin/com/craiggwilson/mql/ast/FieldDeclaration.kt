package com.craiggwilson.mql.ast

data class FieldDeclaration(val parent: FieldDeclaration?, val name: FieldName) {
    fun update(parent: FieldDeclaration?, name: FieldName): FieldDeclaration {
        if (parent !== this.parent || name !== this.name) {
            return FieldDeclaration(parent, name)
        }
        return this
    }
}