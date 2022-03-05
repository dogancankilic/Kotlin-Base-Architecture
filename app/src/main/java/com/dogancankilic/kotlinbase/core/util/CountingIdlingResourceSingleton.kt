package com.dogancankilic.kotlinbase.core.util

import androidx.test.espresso.idling.CountingIdlingResource

/**
 * Idling resource for espresso tests
 */
object CountingIdlingResourceSingleton {

    private const val RESOURCE = "GLOBAL"

    @JvmField val countingIdlingResource = CountingIdlingResource(RESOURCE)

    fun increment() {
        countingIdlingResource.increment()
    }

    fun decrement() {
        if (!countingIdlingResource.isIdleNow) {
            countingIdlingResource.decrement()
        }
    }
}
