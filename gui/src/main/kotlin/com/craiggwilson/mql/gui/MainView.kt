package com.craiggwilson.mql.gui

import javafx.beans.property.SimpleBooleanProperty
import javafx.scene.layout.BorderPane
import javafx.scene.layout.Priority
import org.fxmisc.flowless.VirtualizedScrollPane
import org.fxmisc.richtext.CodeArea
import org.fxmisc.richtext.LineNumberFactory
import org.fxmisc.richtext.model.StyleSpansBuilder
import tornadofx.View
import tornadofx.action
import tornadofx.box
import tornadofx.button
import tornadofx.center
import tornadofx.checkbox
import tornadofx.field
import tornadofx.fieldset
import tornadofx.form
import tornadofx.hbox
import tornadofx.importStylesheet
import tornadofx.px
import tornadofx.right
import tornadofx.style
import tornadofx.vbox
import tornadofx.vgrow
import java.time.Duration

class MainView : View("MQL Transpiler") {
    override val root = BorderPane()
    private val controller: MainController by inject()
    private val inputArea = CodeArea().apply {
        importStylesheet(CodeAreaStyleSheet::class)
        paragraphGraphicFactory = LineNumberFactory.get(this)

        plainTextChanges()
            .successionEnds(Duration.ofMillis(100))
            .subscribe {
                try {
                    setStyleSpans(0, controller.computeSyntaxSpans(text))
                } catch (t: Throwable) {
                    setStyleSpans(0, StyleSpansBuilder<Collection<String>>().add(emptyList(), text.length).create())
                }
            }
    }

    private val outputArea = CodeArea().apply {
        paragraphGraphicFactory = LineNumberFactory.get(this)
        isEditable = false
    }
    private val prettyPrint = SimpleBooleanProperty(true)

    init {
        with(root) {
            shortcut("SHIFT+ENTER") {
                translate()
            }

            center {

                vbox {
                    val inputScrollPane = VirtualizedScrollPane(inputArea)
                    add(inputScrollPane)
                    inputScrollPane.vgrow = Priority.SOMETIMES

                    hbox {
                        style {
                            padding = box(10.px)
                        }

                        button("Translate") {
                            action {
                                translate()
                            }
                        }
                    }

                    val outputScrollPane = VirtualizedScrollPane(outputArea)
                    add(outputScrollPane)
                    outputScrollPane.vgrow = Priority.ALWAYS

                }
            }

            right {
                form {
                    fieldset("Options") {
                        field("Indent Output") {
                            checkbox(null, prettyPrint)
                        }
                    }
                }
            }
        }
    }

    private fun translate() {
        outputArea.replaceText(controller.translate(inputArea.text, prettyPrint.value))
    }
}
