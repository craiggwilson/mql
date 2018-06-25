package com.craiggwilson.mql.gui

import javafx.scene.paint.Color
import javafx.scene.text.FontPosture
import javafx.scene.text.FontWeight
import tornadofx.Stylesheet
import tornadofx.cssclass

class MainStyleSheet : Stylesheet() {
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
            fontWeight = FontWeight.BOLD
        }
        paren {
            fill = Color.TEAL
            fontWeight = FontWeight.BOLD
        }
        string {
            fill = Color.BLUE
        }
    }

    companion object {
        val brace by cssclass()
        val bracket by cssclass()
        val keyword by cssclass()
        val id by cssclass()
        val paren by cssclass()
        val string by cssclass()
    }
}
