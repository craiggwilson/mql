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
            // KEYWORDS
            MQLLexer.AND,
            MQLLexer.ASC,
            MQLLexer.BY,
            MQLLexer.CASE,
            MQLLexer.DESC,
            MQLLexer.ELSE,
            MQLLexer.IF,
            MQLLexer.IN,
            MQLLexer.INDEX,
            MQLLexer.LET,
            MQLLexer.LIKE,
            MQLLexer.NOT,
            MQLLexer.OR,
            MQLLexer.STEP,
            MQLLexer.SWITCH,
            MQLLexer.THEN,
            MQLLexer.WITH -> listOf("keyword")

        // SYMBOLS
            MQLLexer.LPAREN,
            MQLLexer.RPAREN -> listOf("symbol", "paren")
            MQLLexer.LBRACE,
            MQLLexer.RBRACE -> listOf("symbol", "brace")
            MQLLexer.LBRACK,
            MQLLexer.RBRACK -> listOf("symbol", "bracket")

        // STAGES
            MQLLexer.FROM,
            MQLLexer.GROUP,
            MQLLexer.LIMIT,
            MQLLexer.LOOKUP,
            MQLLexer.MATCH,
            MQLLexer.PROJECT,
            MQLLexer.SKIP_,
            MQLLexer.UNWIND -> listOf("keyword", "stage")

            // LITERALS
            MQLLexer.BIN,
            MQLLexer.DECIMAL,
            MQLLexer.STRING,
            MQLLexer.FALSE,
            MQLLexer.HEX,
            MQLLexer.INT,
            MQLLexer.LONG,
            MQLLexer.NULL,
            MQLLexer.TRUE -> listOf("literal")

            // OTHER
            MQLLexer.ID -> listOf("id")
            MQLLexer.VARIABLE_ID -> listOf("id")
            else -> emptyList()
        }
    }
}
