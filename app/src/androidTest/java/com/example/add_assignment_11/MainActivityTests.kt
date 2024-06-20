package com.example.add_assignment_11

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTests {
    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)
    @Test
    fun loginTest(){
        onView(withId(R.id.etUi))
            .perform(typeText("androidworkshpos@gmail.com"), closeSoftKeyboard())
        onView(withId(R.id.btnUi)).perform(click())
        onView(withId(R.id.tvUi))
            .check(matches(withText("androidworkshpos@gmail.com")))
    }
}