package com.craiggwilson.mql.gui

import tornadofx.App
import tornadofx.reloadStylesheetsOnFocus

class MainApp : App(MainView::class, MainStylesheet::class) {
    init {
        reloadStylesheetsOnFocus()
    }
}
