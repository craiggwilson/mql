package com.craiggwilson.mql.library.visitors

import com.craiggwilson.mql.library.ast.Node
import com.craiggwilson.mql.library.ast.NodeVisitor

class Rewriter(private val rewriter: NodeRewriter) : NodeVisitor() {
    private val set = rewriter.appliesTo.toSet()

    override fun visit(n: Node?): Node? {
        if (n == null) {
            return null
        }

        val newN = super.visit(n)

        if (newN != null && set.contains(n::class.java)) {
            return rewriter.visit(newN)
        }

        return newN
    }
}
