package com.craiggwilson.mql.ast

abstract class NodeVisitor : Visitor<Node>() {
    // Expressions
    override fun visit(n: FieldReferenceExpression): Node = n.update(
        visit(n.parent) as Expression?,
        n.name)

    // Nodes
    override fun visit(n: Statement): Node = n.update(
        n.collectionName,
        visitNodes(n.pipeline))

    // Stages
    override fun visit(n: LimitStage): Node = n.update(n.limit)

    override fun visit(n: SkipStage): Node = n.update(n.skip)

    override fun visit(n: UnwindStage): Node = n.update(n.field, n.indexField, n.preserveNullAndEmpty)
}