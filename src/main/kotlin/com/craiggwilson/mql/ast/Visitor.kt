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

  // Expressions
  open fun visit(n: LimitStage): T = throw NotImplementedError()
  open fun visit(n: SkipStage): T = throw NotImplementedError()
  open fun visit(n: UnwindStage): T = throw NotImplementedError()

  @Suppress("UNCHECKED_CAST")
  protected fun <U : Node> visitNodes(items: List<U>): List<U> {
    var newItems: MutableList<U>? = null
    for (i in items.indices) {
      val item = items[i]
      val newItem = visit(item) as U?
      if (newItem !== item && newItems == null) {
        newItems = mutableListOf()
        newItems.addAll(items.subList(0, i))
      }

      if (newItems != null) {
        newItems.add(newItem as U)
      }
    }

    return if (newItems == null) items else newItems
  }
}