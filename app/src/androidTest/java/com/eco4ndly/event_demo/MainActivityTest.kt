package com.eco4ndly.event_demo

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Rule
import org.junit.Test


/**
 * A Sayan Porya code on 04/05/20
 */
class MainActivityTest {

    @Test
    fun shouldShowToast() {
        onView(withId(R.id.btn_toast))
            .perform(click())
    }
}