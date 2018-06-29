package com.craiggwilson.mql.gui

import javafx.scene.paint.Color
import javafx.scene.text.FontPosture
import javafx.scene.text.FontWeight
import tornadofx.Stylesheet
import tornadofx.cssclass

class CodeAreaStylesheet : Stylesheet() {
    companion object {
        val brace by cssclass()
        val bracket by cssclass()
        val keyword by cssclass()
        val id by cssclass()
        val literal by cssclass()
        val paren by cssclass()
        val stage by cssclass()
    }

    init {
        brace {
            fill = Color.TEAL
            fontWeight = FontWeight.BOLD
        }
        bracket {
            fill = Color.TEAL
            fontWeight = FontWeight.BOLD
        }
        id {
            fill = Color.DARKGREEN
            fontStyle = FontPosture.ITALIC
        }
        keyword {
            fill = Color.PURPLE
        }
        literal {
            fill = Color.BLUE
        }
        paren {
            fill = Color.TEAL
            fontWeight = FontWeight.BOLD
        }
        stage {
            fontWeight = FontWeight.BOLD
        }
    }
}
