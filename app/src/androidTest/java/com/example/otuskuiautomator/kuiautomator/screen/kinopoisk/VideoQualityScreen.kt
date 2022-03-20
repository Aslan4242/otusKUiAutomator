package com.example.otuskuiautomator.kuiautomator.screen.kinopoisk

import com.kaspersky.components.kautomator.component.text.UiButton
import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.screen.UiScreen

object VideoQualityScreen : UiScreen<VideoQualityScreen>() {

    override val packageName: String = "ru.kinopoisk"

    val max = UiButton{ withText("Максимальное") }
    val optimal = UiButton{ withText("Оптимальное") }
    val min = UiButton{ withText("Минимальное") }
}