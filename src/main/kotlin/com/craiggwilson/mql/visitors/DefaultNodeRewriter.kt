package com.craiggwilson.mql.visitors

import com.craiggwilson.mql.ast.Node

object DefaultNodeRewriter : NodeRewriter {
    private val transformer = CompositeNodeRewriter(listOf(
        DefaultFunctionNodeRewriter
    ))

    override val appliesTo = transformer.appliesTo

    override fun visit(n: Node): Node = transformer.visit(n)
}