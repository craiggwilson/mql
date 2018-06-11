package com.craiggwilson.mql.ast

abstract class Visitor<T> {
    open fun visit(n: Node?): T? {
        if (n == null) {
            return null
        }

        return n.accept(this)
    }

    // Expressions

    open fun visit(n: FieldReferenceExpression): T = throw NotImplementedError()

    // Nodes

    open fun visit(n: FieldDeclaration): T = throw NotImplementedError()
    open fun visit(n: Statement): T = throw NotImplementedError()

    // Stages

    open fun visit(n: LimitStage): T = throw NotImplementedError()
    open fun visit(n: ProjectStage): T = throw NotImplementedError()
    open fun visit(n: SkipStage): T = throw NotImplementedError()
    open fun visit(n: SortStage): T = throw NotImplementedError()
    open fun visit(n: UnwindStage): T = throw NotImplementedError()

    protected fun <T> visit(items: List<T>, visit: (T) -> T): List<T> {
        var newItems: MutableList<T>? = null
        for (i in items.indices) {
            val item = items[i]
            val newItem = visit(item)
            if (newItem !== item && newItems == null) {
                newItems = mutableListOf()
                newItems.addAll(items.subList(0, i))
            }

            if (newItems != null) {
                newItems.add(newItem)
            }
        }

        return if (newItems == null) items else newItems
    }

    @Suppress("UNCHECKED_CAST")
    protected fun <T : Node> visit(items: List<T>): List<T> = visit(items) { visit(it) as T }
}

abstract class NodeVisitor : Visitor<Node>() {
    // Expressions

    override fun visit(n: FieldReferenceExpression): Node = n.update(
        visit(n.parent) as Expression?,
        n.name)

    // Nodes

    override fun visit(n: FieldDeclaration): Node = n.update(
        visit(n.parent) as FieldDeclaration?,
        n.name)

    override fun visit(n: Statement): Node = n.update(
        n.collectionName,
        visit(n.pipeline))

    // Stages

    override fun visit(n: LimitStage): Node = n.update(n.limit)

    override fun visit(n: ProjectStage): Node = n.update(
        visit(n.items) { item ->
            item.update(
                visit(item.field) as FieldDeclaration,
                visit(item.expression) as Expression
            )
        }
    )

    override fun visit(n: SkipStage): Node = n.update(n.skip)

    override fun visit(n: SortStage): Node = n.update(
        visit(n.fields) { field ->
            field.update(
                visit(field.field) as FieldReferenceExpression,
                field.direction
            )
        }
    )

    override fun visit(n: UnwindStage): Node = n.update(n.field, n.indexField, n.preserveNullAndEmpty)
}