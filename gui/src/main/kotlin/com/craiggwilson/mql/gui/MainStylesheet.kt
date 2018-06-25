package com.craiggwilson.mql.gui

import javafx.scene.paint.Color
import tornadofx.Stylesheet
import tornadofx.cssclass

class MainStyleSheet : Stylesheet() {
    init {
        keyword {
            fill = Color.RED
        }
    }

    companion object {
        val keyword by cssclass("keyword")
    }
}
