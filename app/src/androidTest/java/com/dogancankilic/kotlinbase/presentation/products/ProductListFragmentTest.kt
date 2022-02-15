package com.dogancankilic.kotlinbase.presentation.products

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.dogancankilic.kotlinbase.R
import com.dogancankilic.kotlinbase.core.extension.launchFragmentInHiltContainer
import com.dogancankilic.kotlinbase.core.util.CountingIdlingResourceSingleton
import com.dogancankilic.kotlinbase.core.platform.BaseViewHolder
import com.dogancankilic.kotlinbase.databinding.ProductListItemBinding
import com.dogancankilic.kotlinbase.presentation.main.MainActivity
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
@ExperimentalCoroutinesApi
@HiltAndroidTest
class ProductListFragmentTest {

   /* @Rule
    @JvmField
    var mActivityTestRule = ActivityScenarioRule(MainActivity::class.java)*/

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

        launchFragmentInHiltContainer<ProductListFragment>(

        )
        // EventFragment has gone through onAttach(), but not onCreate().
        // Verify the initial state.
        // EventFragment moves to CREATED -> STARTED -> RESUMED.
        onView(withId(R.id.rvProducts)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.rvProducts)).perform(
            RecyclerViewActions.actionOnItemAtPosition<BaseViewHolder<ProductListItemBinding>>(
                2,
                click()
            )
        )

        /* val textView = onView(
             allOf(
                 withId(R.id.tvName), withText("Mens Cotton Jacket"),
                 withParent(withParent(withId(R.id.nav_host_container))),
                 isDisplayed()
             )
         )
         textView.check(matches(withText("Mens Cotton Jacket")))*/
    }

    @After
    fun unregisterIdlingResource() {
        IdlingRegistry.getInstance().unregister(CountingIdlingResourceSingleton.countingIdlingResource)
    }
}
