package com.craiggwilson.mql.visitors

import com.craiggwilson.mql.ast.Node
import com.craiggwilson.mql.ast.NodeVisitor

class TransformerVisitor(private val transformer: NodeTransformer) : NodeVisitor() {
    private val set = transformer.appliesTo.toSet()

    override fun visit(n : Node?): Node? {
        if (n == null) {
            return null
        }

        if (set.contains(n::class.java)) {
            return transformer.visit(n)
        }

        return super.visit(n)
    }
}