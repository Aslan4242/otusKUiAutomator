package com.example.otuskuiautomator.kuiautomator.screen.kinopoisk

import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.screen.UiScreen

object ProfileScreen : UiScreen<ProfileScreen>() {

    override val packageName: String = "ru.kinopoisk"

    val settings = UiTextView { withId(this@ProfileScreen.packageName, "settings_button") }
}