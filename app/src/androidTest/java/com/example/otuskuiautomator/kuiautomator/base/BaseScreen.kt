package com.example.otuskuiautomator.kuiautomator.base

import io.github.kakaocup.kakao.screen.Screen

abstract class BaseScreen<out T : BaseScreen<T>> : Screen<T>() {
}