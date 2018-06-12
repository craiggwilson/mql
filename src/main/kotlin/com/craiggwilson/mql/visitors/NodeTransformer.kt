package com.craiggwilson.mql.visitors

import com.craiggwilson.mql.ast.Node

interface NodeTransformer {
    val appliesTo: List<Class<*>>

    fun visit(n: Node): Node
}



