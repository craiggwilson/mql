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

    open fun visit(n: Statement): T = throw NotImplementedError()

    // Stages

    open fun visit(n: LimitStage): T = throw NotImplementedError()
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