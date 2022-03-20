package com.example.otuskuiautomator.kuiautomator.scenario

import com.example.otuskuiautomator.kuiautomator.screen.kinopoisk.SubscriptionScreen
import com.example.otuskuiautomator.kuiautomator.screen.kinopoisk.WelcomeScreen
import com.kaspersky.kaspresso.testcases.api.scenario.Scenario
import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext

/**
 * Сценарий закрытия экрана приветствия, если он отображается
 */
class SkipWelcomeScreenScenario : Scenario() {

    override val steps: TestContext<Unit>.() -> Unit = {
        WelcomeScreen {
            compose {
                or(arrowButton) {
                    continuously(5_000L) { isNotDisplayed() }
                } then {
                    // do nothing
                }
                or(arrowButton) {
                    isDisplayed()
                } then {
                    step("Нажимаем два раза на стрелку на экране приветствия") {
                        WelcomeScreen {
                            for (i in 0..1) {
                                arrowButton.click()
                            }
                        }
                    }

                    step("Нажимаем на кнопку 'Пока не нужно' на экране рекламы подписки") {
                        SubscriptionScreen {
                            skipButton.click()
                        }
                    }
                }
            }
        }
    }
}
