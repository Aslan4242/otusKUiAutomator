package com.example.otuskuiautomator.kuiautomator.screen.kinopoisk

import com.kaspersky.components.kautomator.component.scroll.UiScrollView
import com.kaspersky.components.kautomator.component.text.UiButton
import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.screen.UiScreen

object SettingsScreen : UiScreen<SettingsScreen>() {

    override val packageName: String = "ru.kinopoisk"

    val scrollView = UiScrollView{ withId(this@SettingsScreen.packageName, "settings_scroll_view") }
    val videoQualityValue = UiButton{ withId(this@SettingsScreen.packageName, "cell_primary_value_view") }
    val aboutButton = UiButton{ withId(this@SettingsScreen.packageName, "about_button") }
}