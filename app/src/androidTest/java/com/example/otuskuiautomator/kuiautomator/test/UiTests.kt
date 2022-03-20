package com.example.otuskuiautomator.kuiautomator.test

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.otuskuiautomator.kuiautomator.base.BaseTestCase
import com.example.otuskuiautomator.kuiautomator.scenario.SkipWelcomeScreenScenario
import com.example.otuskuiautomator.kuiautomator.screen.kinopoisk.MainScreen
import com.example.otuskuiautomator.kuiautomator.screen.kinopoisk.ProfileScreen
import com.example.otuskuiautomator.kuiautomator.screen.kinopoisk.SettingsScreen
import com.example.otuskuiautomator.kuiautomator.screen.kinopoisk.VideoQualityScreen
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class UiTests : BaseTestCase() {


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

            step("Нажимаем 'Назад'"){
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

            step("Нажимаем 'Назад'"){
                device.uiDevice.pressBack()
            }

            step("Проверяем, что значение поля 'Качество видео' равно 'Максимальное'") {
                SettingsScreen {
                    videoQualityValue.hasText("Максимальное")
                }
            }
        }
    }

}