package com.craiggwilson.mql.ast

abstract class Node {
    abstract fun <T> accept(v: Visitor<T>): T
}
