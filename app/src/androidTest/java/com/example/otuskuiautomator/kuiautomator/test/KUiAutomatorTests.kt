package com.example.otuskuiautomator.kuiautomator.test

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.otuskuiautomator.kuiautomator.base.BaseTestCase
import com.example.otuskuiautomator.kuiautomator.scenario.SkipWelcomeScreenScenario
import com.example.otuskuiautomator.kuiautomator.screen.kinopoisk.*
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class KUiAutomatorTests : BaseTestCase() {

    /**
     * Проверка открытия экрана 'О приложении'
     */
    @Test
    fun aboutScreenTest() {
        launch().run {
            installAndLaunchApp()

            scenario(SkipWelcomeScreenScenario())

            step("Нажимаем на кнопку 'Профиль'") {
                MainScreen {
                    profileButton.click()
                }
            }

            step("Нажимаем на кнопку 'Настройки'") {
                ProfileScreen {
                    settings.click()
                }
            }

            step("Скроллим вниз") {
                SettingsScreen {
                    scrollView.scrollToEnd()
                }
            }

            step("Нажимаем на кнопку 'О приложении'") {
                SettingsScreen {
                    aboutButton.click()
                }
            }

            step("Проверяем открытие экрана 'О приложении'") {
                AboutScreen {
                    title.isDisplayed()
                    version {
                        isDisplayed()
                        containsText("Версия")
                    }
                }
            }
        }
    }

    /**
     * Проверка выбора качества загружаемого видео
     */
    @Test
    fun setVideoQualityTest() {
        launch().run {
            installAndLaunchApp()

            scenario(SkipWelcomeScreenScenario())

            step("Нажимаем на кнопку 'Профиль'") {
                MainScreen {
                    profileButton.click()
                }
            }

            step("Нажимаем на кнопку 'Настройки'") {
                ProfileScreen {
                    settings.click()
                }
            }

            step("Нажимаем на кнопку 'Качество видео'") {
                SettingsScreen {
                    videoQualityValue.click()
                }
            }

            step("Выбираем минимальное качество видео") {
                VideoQualityScreen {
                    min.click()
                }
            }

            step("Нажимаем 'Назад'") {
                device.uiDevice.pressBack()
            }

            step("Проверяем, что значение поля 'Качество видео' равно 'Минимальное'") {
                SettingsScreen {
                    videoQualityValue.hasText("Минимальное")
                }
            }

            step("Нажимаем на кнопку 'Качество видео'") {
                SettingsScreen {
                    videoQualityValue.click()
                }
            }

            step("Выбираем максимальное качество видео") {
                VideoQualityScreen {
                    max.click()
                }
            }

            step("Нажимаем 'Назад'") {
                device.uiDevice.pressBack()
            }

            step("Проверяем, что значение поля 'Качество видео' равно 'Максимальное'") {
                SettingsScreen {
                    videoQualityValue.hasText("Максимальное")
                }
            }
        }
    }

    /**
     * Проверка поиска фильма
     */
    @Test
    fun searchMovieTest() {
        launch().run {
            val movie = "Titanic, 1997"

            installAndLaunchApp()

            scenario(SkipWelcomeScreenScenario())

            step("Нажимаем на кнопку 'Поиск'") {
                MainScreen {
                    searchButton.click()
                }
            }

            step("Вводим навазние фильма") {
                SearchScreen {
                    searchField {
                        click()
                        replaceText(movie)
                    }
                }
            }

            step("Выбираем '$movie' из списка") {
                SearchResultScreen {
                    clickSearchItem(movie)
                }
            }

            step("Проверяем открытие карточки фильма '$movie'") {
                MovieScreen {
                    title {
                        isDisplayed()
                        containsText("Titanic")
                    }
                }
            }
        }
    }
}