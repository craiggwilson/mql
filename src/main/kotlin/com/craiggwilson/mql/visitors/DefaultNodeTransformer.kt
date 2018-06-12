package com.craiggwilson.mql.visitors

import com.craiggwilson.mql.ast.Node

object DefaultNodeTransformer : NodeTransformer {
    private val transformer = CompositeNodeTransformer(listOf(
        DefaultFunctionNodeTransformer
    ))

    override val appliesTo = transformer.appliesTo

    override fun visit(n: Node): Node = transformer.visit(n)
}