package com.craiggwilson.mql.gui

import com.craiggwilson.mql.library.parser.MQLLexer
import com.craiggwilson.mql.library.parser.lexMQL
import com.craiggwilson.mql.library.parser.parseMQL
import com.craiggwilson.mql.library.translators.toShell
import org.antlr.v4.runtime.Token
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

            val cssClasses = token.cssClasses()

            builder.add(emptyList(), token.startIndex - lastKWend)
            builder.add(cssClasses, token.stopIndex - token.startIndex + 1)
            lastKWend = token.stopIndex + 1
        }
        builder.add(emptyList(), text.length - lastKWend)
        return builder.create()
    }

    fun translate(input: String, prettyPrint: Boolean): String {
        return try {
            val statement = parseMQL(input)[0]
            statement.toShell(prettyPrint)
        } catch (t: Throwable) {
            t.message ?: "unknown error"
        }
    }

    private fun Token.cssClasses(): List<String> {
        return when (type) {
        // SYMBOLS
            MQLLexer.LPAREN,
            MQLLexer.RPAREN -> listOf("paren")
            MQLLexer.LBRACE,
            MQLLexer.RBRACE -> listOf("brace")
            MQLLexer.LBRACK,
            MQLLexer.RBRACK -> listOf("bracket")

        // KEYWORDS
            MQLLexer.FROM -> listOf("keyword")
            MQLLexer.GROUP,
            MQLLexer.LIMIT,
            MQLLexer.LOOKUP,
            MQLLexer.MATCH,
            MQLLexer.PROJECT,
            MQLLexer.SKIP_,
            MQLLexer.UNWIND -> listOf("keyword", "stage")

            // OTHER
            MQLLexer.DQ_STRING -> listOf("string")
            MQLLexer.UNQUOTED_ID -> listOf("id")
            else -> emptyList()
        }
    }
}
