package com.craiggwilson.mql.gui

import org.fxmisc.richtext.CodeArea
import tornadofx.View
import tornadofx.action
import tornadofx.button
import tornadofx.vbox
import java.time.Duration

class MainView : View() {
    val controller: MainController by inject()
    val inputArea = CodeArea().apply {

        plainTextChanges()
            .successionEnds(Duration.ofMillis(100))
            .subscribe {
                setStyleSpans(0, controller.computeSyntaxSpans(text))
            }
    }

    val outputArea = CodeArea().also {
        it.isEditable = false
    }

    override val root = vbox {
        shortcut("SHIFT+ENTER") {
            outputArea.replaceText(controller.translate(inputArea.text))
        }

        add(inputArea)

        button("Translate") {
            action {
                outputArea.replaceText(controller.translate(inputArea.text))
            }
        }

        add(outputArea)
    }
}
