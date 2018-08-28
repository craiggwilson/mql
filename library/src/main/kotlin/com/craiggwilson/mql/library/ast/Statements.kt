package com.craiggwilson.mql.library.ast

sealed class Statement : Node()

data class QueryStatement(val collectionName: CollectionName, val stages: List<Stage>) : Statement() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(collectionName: CollectionName, stages: List<Stage>): QueryStatement {
        if (collectionName !== this.collectionName || stages !== this.stages) {
            return QueryStatement(collectionName, stages)
        }
        return this
    }
}
