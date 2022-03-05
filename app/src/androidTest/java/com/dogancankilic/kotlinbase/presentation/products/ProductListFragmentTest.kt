package com.dogancankilic.kotlinbase.presentation.products

import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.internal.runner.junit4.statement.UiThreadStatement.runOnUiThread
import com.dogancankilic.kotlinbase.R
import com.dogancankilic.kotlinbase.core.platform.BaseViewHolder
import com.dogancankilic.kotlinbase.core.util.CountingIdlingResourceSingleton
import com.dogancankilic.kotlinbase.databinding.ProductListItemBinding
import com.dogancankilic.kotlinbase.presentation.util.RecyclerViewMatchers.hasItemCount
import com.dogancankilic.kotlinbase.presentation.util.launchFragmentInHiltContainer
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)

@HiltAndroidTest
class ProductListFragmentTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun registerIdlingResource() {
        // Populate @Inject fields in test class
        hiltRule.inject()
        IdlingRegistry.getInstance().register(CountingIdlingResourceSingleton.countingIdlingResource)
    }

    @Test
    fun productListTest() {
        val navController = TestNavHostController(
            ApplicationProvider.getApplicationContext()
        )
        runOnUiThread {
            navController.setGraph(R.navigation.nav_graph)
        }

        launchFragmentInHiltContainer<ProductListFragment>(navHostController = navController) {
        }
        onView(withId(R.id.rvProducts)).check(matches(isDisplayed()))
        onView(withId(R.id.rvProducts)).check(matches((hasItemCount(20))))
        onView(withId(R.id.rvProducts)).perform(
            RecyclerViewActions.actionOnItemAtPosition<BaseViewHolder<ProductListItemBinding>>(
                2,
                click()
            )
        )
    }

    @After
    fun unregisterIdlingResource() {
        IdlingRegistry.getInstance().unregister(CountingIdlingResourceSingleton.countingIdlingResource)
    }
}
