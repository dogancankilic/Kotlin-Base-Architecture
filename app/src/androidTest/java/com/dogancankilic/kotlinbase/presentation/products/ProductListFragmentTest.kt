package com.dogancankilic.kotlinbase.presentation.products

import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.dogancankilic.kotlinbase.R
import com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import org.hamcrest.TypeSafeMatcher
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

        val recyclerView = onView(
            Matchers.allOf(
                withId(R.id.rvProducts),
                childAtPosition(
                    ViewMatchers.withClassName(Matchers.`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                    0
                )
            )
        )
        recyclerView.perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                2,
                click()
            )
        )

        val textView = onView(
            Matchers.allOf(
                withId(R.id.tvName), ViewMatchers.withText("Mens Cotton Jacket"),
                ViewMatchers.withParent(ViewMatchers.withParent(withId(R.id.nav_host_container))),
                ViewMatchers.isDisplayed()
            )
        )
        textView.check(ViewAssertions.matches(ViewMatchers.withText("Mens Cotton Jacket")))

       /* onView(withId(R.id.rvProducts))
            .perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));*/
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }




}