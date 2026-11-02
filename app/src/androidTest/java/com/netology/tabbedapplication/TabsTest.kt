package com.netology.tabbedapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TabsTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testTabSwitching() {
        // Проверяем, что изначально активна первая вкладка
        // Espresso сам дождётся отображения view
        onView(withText("Page: 1"))
            .check(matches(isDisplayed()))

        // Кликаем на вторую вкладку
        onView(withText("TAB 2"))
            .perform(click())

        // Проверяем, что отображается вторая страница
        // Espresso автоматически подождёт переключения
        onView(withText("Page: 2"))
            .check(matches(isDisplayed()))
    }
}
