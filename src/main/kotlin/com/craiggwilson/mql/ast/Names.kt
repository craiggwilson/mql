package com.craiggwilson.mql.ast

data class CollectionName(val databaseName: DatabaseName?, val name: String)
data class DatabaseName(val name: String)
data class FieldName(val name: String) {
    fun append(name: FieldName): FieldName {
        return FieldName("${this.name}.${name.name}")
    }
}
data class VariableName(val name: String)