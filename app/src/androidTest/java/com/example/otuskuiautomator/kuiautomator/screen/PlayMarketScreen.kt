package com.example.otuskuiautomator.kuiautomator.screen

import com.kaspersky.components.kautomator.component.edit.UiEditText
import com.kaspersky.components.kautomator.component.text.UiButton
import com.kaspersky.components.kautomator.screen.UiScreen

object PlayMarketScreen : UiScreen<PlayMarketScreen>() {

    override val packageName: String = "com.android.vending"

    val searchField = UiEditText { withText("Search for apps & games") }
    val installButton = UiButton { withContentDescription("Install") }
    val openButton = UiButton { withContentDescription("Open") }
}