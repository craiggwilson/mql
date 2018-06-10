package com.craiggwilson.mql.ast

data class CollectionName(val databaseName: DatabaseName?, val name: String)
data class DatabaseName(val name: String)
data class FieldName(val name: String)