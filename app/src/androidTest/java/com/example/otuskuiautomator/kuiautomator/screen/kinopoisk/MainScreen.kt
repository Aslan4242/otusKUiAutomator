package com.example.otuskuiautomator.kuiautomator.screen.kinopoisk

import com.kaspersky.components.kautomator.component.text.UiButton
import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.screen.UiScreen

object MainScreen : UiScreen<MainScreen>() {

    override val packageName: String = "ru.kinopoisk"

    val searchButton = UiButton { withId(this@MainScreen.packageName, "search") }
    val profileButton = UiButton { withId(this@MainScreen.packageName, "profile") }
}