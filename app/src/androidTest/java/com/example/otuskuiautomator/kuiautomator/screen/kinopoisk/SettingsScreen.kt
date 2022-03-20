package com.example.otuskuiautomator.kuiautomator.screen.kinopoisk

import com.kaspersky.components.kautomator.component.text.UiButton
import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.screen.UiScreen

object SettingsScreen : UiScreen<SettingsScreen>() {

    override val packageName: String = "ru.kinopoisk"

    val videoQualityValue = UiButton{ withId(this@SettingsScreen.packageName, "cell_primary_value_view") }
    val darkMode = UiButton{ withId(this@SettingsScreen.packageName, "dark_theme_button") }
}