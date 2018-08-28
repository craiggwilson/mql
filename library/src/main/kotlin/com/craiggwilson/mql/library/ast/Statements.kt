package com.craiggwilson.mql.library.ast

sealed class Statement : Node()

data class DeleteStatement(val collectionName: CollectionName, val predicate: Expression, val many: Boolean) : Statement() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(collectionName: CollectionName, predicate: Expression, many: Boolean): DeleteStatement {
        if (collectionName !== this.collectionName || predicate !== this.predicate || many != this.many) {
            return DeleteStatement(collectionName, predicate, many)
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

data class UpdateStatement(val collectionName: CollectionName,
                           val predicate: Expression,
                           val set: NewDocumentExpression,
                           val many: Boolean) : Statement() {
    override fun <T> accept(v: Visitor<T>) = v.visit(this)

    fun update(collectionName: CollectionName, predicate: Expression, set: NewDocumentExpression, many: Boolean): UpdateStatement {
        if (collectionName !== this.collectionName || predicate !== this.predicate || set !== this.set || many != this.many) {
            return UpdateStatement(collectionName, predicate, set, many)
        }
        return this
    }
}
