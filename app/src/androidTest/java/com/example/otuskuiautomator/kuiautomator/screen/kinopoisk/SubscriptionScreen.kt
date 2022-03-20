package com.example.otuskuiautomator.kuiautomator.screen.kinopoisk

import com.kaspersky.components.kautomator.component.text.UiButton
import com.kaspersky.components.kautomator.screen.UiScreen

object SubscriptionScreen : UiScreen<SubscriptionScreen>() {

    override val packageName: String = "ru.kinopoisk"

    val skipButton = UiButton { withId(this@SubscriptionScreen.packageName, "button_skip_subscription") }
}