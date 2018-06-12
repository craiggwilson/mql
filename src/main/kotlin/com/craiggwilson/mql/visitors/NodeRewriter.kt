package com.craiggwilson.mql.visitors

import com.craiggwilson.mql.ast.Node

interface NodeRewriter {
    val appliesTo: Set<Class<*>>

    fun visit(n: Node): Node
}



