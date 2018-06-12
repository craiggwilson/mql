package com.craiggwilson.mql.visitors

import com.craiggwilson.mql.ast.Node

object EmptyNodeTransformer : NodeTransformer {
    override val appliesTo = emptyList<Class<*>>()

    override fun visit(n: Node): Node = n
}