package com.craiggwilson.mql.visitors

import com.craiggwilson.mql.ast.Node

object EmptyNodeRewriter : NodeRewriter {
    override val appliesTo = emptySet<Class<*>>()

    override fun visit(n: Node): Node = n
}