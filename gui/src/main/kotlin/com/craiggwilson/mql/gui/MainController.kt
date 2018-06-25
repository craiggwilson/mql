package com.craiggwilson.mql.gui

import com.craiggwilson.mql.library.parser.MQLLexer
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

        var lastKWend = 0
        while (!lexer._hitEOF) {
            val token = lexer.nextToken()

            val cssClasses = when (token.type) {
                MQLLexer.FROM -> listOf("keyword")
                MQLLexer.PROJECT -> listOf("keyword", "stage")
                else -> emptyList()
            }
            builder.add(emptyList(), token.startIndex - lastKWend)
            builder.add(cssClasses, token.stopIndex - token.startIndex + 1)
            lastKWend = token.stopIndex + 1
        }
        builder.add(emptyList(), text.length - lastKWend)
        return builder.create()
    }

    fun translate(input: String): String {
        val statement = parseMQL(input)[0]
        return statement.toShell()
    }
}
