package com.example.otuskuiautomator.kuiautomator.screen.kinopoisk

import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.screen.UiScreen

object AboutScreen : UiScreen<AboutScreen>() {

    override val packageName: String = "ru.kinopoisk"

    val title = UiTextView{ withText("О приложении") }
    val version = UiTextView{ withId(this@AboutScreen.packageName,"app_version_text_view") }
}