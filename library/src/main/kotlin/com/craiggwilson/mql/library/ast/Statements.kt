package com.craiggwilson.mql.library.ast

sealed class Statement : Node()

data class DeleteStatement(val collectionName: CollectionName, val expression: Expression, val many: Boolean) : Statement() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(collectionName: CollectionName, expression: Expression, many: Boolean): DeleteStatement {
        if (collectionName !== this.collectionName || expression !== this.expression || many != this.many) {
            return DeleteStatement(collectionName, expression, many)
        }
        return this
    }
}

data class InsertStatement(val collectionName: CollectionName, val documents: List<NewDocumentExpression>) : Statement() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(collectionName: CollectionName, documents: List<NewDocumentExpression>): InsertStatement {
        if (collectionName !== this.collectionName || documents !== this.documents) {
            return InsertStatement(collectionName, documents)
        }
        return this
    }
}

data class QueryStatement(val collectionName: CollectionName, val stages: List<Stage>) : Statement() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(collectionName: CollectionName, stages: List<Stage>): QueryStatement {
        if (collectionName !== this.collectionName || stages !== this.stages) {
            return QueryStatement(collectionName, stages)
        }
        return this
    }
}
