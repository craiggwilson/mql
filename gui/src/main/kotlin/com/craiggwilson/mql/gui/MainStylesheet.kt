package com.craiggwilson.mql.gui

import tornadofx.Stylesheet
import tornadofx.box
import tornadofx.px

class MainStyleSheet : Stylesheet() {
    init {
        root {
            prefHeight = 600.px
            prefWidth = 800.px

            padding = box(10.px)
        }

        s(button) {
            startMargin = 10.px
            endMargin = 10.px
        }

    }
}
