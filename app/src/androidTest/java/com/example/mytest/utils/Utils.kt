package com.example.mytest.utils

import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.CoreMatchers.not

internal fun ViewInteraction.isDisplayed() = check(matches(ViewMatchers.isDisplayed()))

internal fun ViewInteraction.isClickable() = check(matches(ViewMatchers.isClickable()))

internal fun ViewInteraction.isNotClickable() = check(matches(not(ViewMatchers.isClickable())))

internal fun ViewInteraction.withText(stringRes: Int) =
    check(matches(ViewMatchers.withText(stringRes)))
