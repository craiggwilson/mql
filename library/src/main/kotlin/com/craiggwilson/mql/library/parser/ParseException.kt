package com.craiggwilson.mql.library.parser

class ParseException : RuntimeException {
    constructor(message: String) : super(message)
    constructor(t: Throwable) : super(t)
}
