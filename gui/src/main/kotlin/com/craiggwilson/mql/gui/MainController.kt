package com.craiggwilson.mql.gui

import com.craiggwilson.mql.library.parser.lexMQL
import com.craiggwilson.mql.library.parser.parseMQL
import com.craiggwilson.mql.library.translators.toShell
import org.fxmisc.richtext.model.StyleSpans
import org.fxmisc.richtext.model.StyleSpansBuilder
import tornadofx.Controller

class MainController : Controller() {
    fun computeSyntaxSpans(text: String): StyleSpans<Collection<String>> {
        val builder = StyleSpansBuilder<Collection<String>>()

        val lexer = lexMQL(text)
        while (!lexer._hitEOF) {
            val token = lexer.nextToken()
            builder.add(listOf("keyword"), token.stopIndex - token.startIndex)
        }
        return builder.create()
    }

    fun translate(input: String): String {
        val statement = parseMQL(input)[0]
        return statement.toShell()
    }
}
