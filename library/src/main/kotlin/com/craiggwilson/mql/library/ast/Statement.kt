package com.craiggwilson.mql.library.ast

data class Statement(val collectionName: CollectionName, val stages: List<Stage>) : Node() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(collectionName: CollectionName, stages: List<Stage>): Statement {
        if (collectionName !== this.collectionName || stages !== this.stages) {
            return Statement(collectionName, stages)
        }
        return this
    }
}
