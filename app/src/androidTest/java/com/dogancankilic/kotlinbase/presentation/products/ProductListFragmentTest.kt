package com.dogancankilic.kotlinbase.presentation.products

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ProductListFragmentTest {

    @Test
    fun testEventFragment() {
        val scenario = launchFragmentInContainer<ProductListFragment>(
            initialState = Lifecycle.State.INITIALIZED
        )

        // EventFragment has gone through onAttach(), but not onCreate().
        // Verify the initial state.
        scenario.moveToState(Lifecycle.State.RESUMED)
    }


}