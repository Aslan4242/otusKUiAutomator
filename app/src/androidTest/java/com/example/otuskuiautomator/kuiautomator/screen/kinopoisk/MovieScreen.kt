package com.example.otuskuiautomator.kuiautomator.screen.kinopoisk

import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.screen.UiScreen

object MovieScreen : UiScreen<MovieScreen>() {

    override val packageName: String = "ru.kinopoisk"

    val title = UiTextView { withId(this@MovieScreen.packageName, "original_title_text_view") }

}