package com.example.otuskuiautomator.kuiautomator.screen.kinopoisk

import com.kaspersky.components.kautomator.component.text.UiButton
import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.screen.UiScreen

object WelcomeScreen : UiScreen<WelcomeScreen>() {

    override val packageName: String = "ru.kinopoisk"

    val description = UiTextView { withId(this@WelcomeScreen.packageName, "description") }
    val arrowButton = UiButton { withId(this@WelcomeScreen.packageName, "button_next") }
}