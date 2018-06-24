package com.craiggwilson.mql.library.ast

abstract class Node {
    abstract fun <T> accept(v: Visitor<T>): T
}
