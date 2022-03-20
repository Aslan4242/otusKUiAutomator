package com.example.otuskuiautomator.kuiautomator.screen.kinopoisk

import com.kaspersky.components.kautomator.component.edit.UiEditText
import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.screen.UiScreen

object SearchScreen : UiScreen<SearchScreen>() {

    override val packageName: String = "ru.kinopoisk"

    val searchField = UiEditText { withId(this@SearchScreen.packageName, "search_edit_text") }
}