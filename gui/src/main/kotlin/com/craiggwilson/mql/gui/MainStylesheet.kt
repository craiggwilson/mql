package com.craiggwilson.mql.gui

import tornadofx.Stylesheet
import tornadofx.box
import tornadofx.px

class MainStylesheet : Stylesheet() {
    init {
        root {
            prefHeight = 600.px
            prefWidth = 800.px

            padding = box(10.px)
        }
    }
}
