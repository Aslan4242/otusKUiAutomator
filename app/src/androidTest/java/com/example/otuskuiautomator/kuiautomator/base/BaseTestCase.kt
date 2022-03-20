package com.example.otuskuiautomator.kuiautomator.base

import android.view.KeyEvent
import com.example.otuskuiautomator.kuiautomator.screen.PlayMarketScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import com.kaspersky.kaspresso.testcases.core.sections.InitSection
import com.kaspersky.kaspresso.testcases.core.testcontext.BaseTestContext
import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext

open class BaseTestCase : TestCase() {

    /**
     * Действия, выполняемые до запуска теста
     *
     * @param [before] Действия, которые следует выполнить до теста
     * @param [after] Действия, которые следует выполнить после теста
     */
    protected fun launch(
        before: BaseTestContext.() -> Unit = {},
        after: BaseTestContext.() -> Unit = {}
    ): InitSection<Unit, Unit> {
        return before(actions = before).after(after)
    }

    fun TestContext<Unit>.installAndLaunchApp() {
        val appName = "Кинопоиск"

        if (!device.apps.isInstalled("ru.kinopoisk")) {
            step("Открывем Play Store") {
                device.apps.launch("com.android.vending")
            }

            step("Вводим в строку поиска название приложения '$appName' и нажимаем кнопку поиска") {
                PlayMarketScreen {
                    searchField {
                        click()
                        continuously(1_000L) { isDisplayed() }
                        replaceText(appName)
                        device.uiDevice.pressKeyCode(KeyEvent.KEYCODE_ENTER)
                    }
                }
            }

            step("Нажимаем 'Установить' у приложения '$appName'") {
                PlayMarketScreen {
                    installButton.click()
                }
            }

            while (!device.apps.isInstalled("ru.kinopoisk")) {
            }
        }

        step("Открывем '$appName'") {
            device.apps.launch("ru.kinopoisk")
        }
    }
}
