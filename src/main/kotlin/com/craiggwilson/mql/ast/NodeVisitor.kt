package com.craiggwilson.mql.ast

abstract class NodeVisitor : Visitor<Node>() {
  // Expressions
  override fun visit(n: FieldReferenceExpression): Node {
    return n.update(
      visit(n.parent) as Expression?,
      n.name)
  }

  // Nodes
  override fun visit(n: Statement): Node {
    return n.update(
      n.collectionName,
      visitNodes(n.pipeline))
  }

  // Stages
  override fun visit(n: LimitStage): Node {
    return n.update(n.limit)
  }

  override fun visit(n: SkipStage): Node {
    return n.update(n.skip)
  }

  override fun visit(n: UnwindStage): Node {
    return n.update(n.field, n.indexField, n.preserveNullAndEmpty)
  }
}