package com.example.otuskuiautomator.kuiautomator.screen.kinopoisk

import com.kaspersky.components.kautomator.component.edit.UiEditText
import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.screen.UiScreen

object SearchResultScreen : UiScreen<SearchResultScreen>() {

    override val packageName: String = "ru.kinopoisk"

    /**
     * Нажимает на указанный элемент из резульатов  поиска
     *
     * @param [itemName] Имя элемента
     */
    fun clickSearchItem(itemName: String) {
        UiTextView {
            withId(this@SearchResultScreen.packageName, "secondary_info")
            withText(itemName)
        }.click()
    }
}