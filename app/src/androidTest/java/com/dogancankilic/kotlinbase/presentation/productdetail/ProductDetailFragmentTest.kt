package com.dogancankilic.kotlinbase.presentation.productdetail

import androidx.core.os.bundleOf
import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.internal.runner.junit4.statement.UiThreadStatement.runOnUiThread
import com.dogancankilic.kotlinbase.R
import com.dogancankilic.kotlinbase.core.util.CountingIdlingResourceSingleton
import com.dogancankilic.kotlinbase.data.products.model.Rating
import com.dogancankilic.kotlinbase.domain.productdetail.ProductDetailUseCase
import com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel
import com.dogancankilic.kotlinbase.presentation.util.launchFragmentInHiltContainer
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flow
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
@ExperimentalCoroutinesApi
@HiltAndroidTest
class ProductDetailFragmentTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun setup() {
        // Populate @Inject fields in test class
        hiltRule.inject()
        IdlingRegistry.getInstance().register(CountingIdlingResourceSingleton.countingIdlingResource)
    }

    @Test
    fun testProductDetailData() {

        val navController = TestNavHostController(
            ApplicationProvider.getApplicationContext()
        )
        runOnUiThread {
            navController.setGraph(R.navigation.nav_graph)
        }
        val scenario = launchFragmentInHiltContainer<ProductDetailFragment>(
            fragmentArgs = bundleOf(
                "@string/productId" to "2",

            )
        ) {
            navController.setCurrentDestination(destId = R.id.detailsFragment)
        }
        val productId = "2"
        val title = "Mens Casual Premium Slim Fit T-Shirts "
        val price = "22.3"
        val description = "Slim-fitting style, contrast raglan long sleeve, " +
            "three-button henley placket, light weight & soft fabric for breat" +
            "hable and comfortable wearing. And Solid stitched shirts with round neck made f" +
            "or durability and a great fit for casual fashion wear and diehard baseball fans. The Henley " +
            "style round neckline includes a three-button placket."
        val category = "men's clothing"
        val image = "https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_.jpg"
        val rating = Rating(259, 4.1)
        val model = ProductsUiModel(image, price, rating, description, title, category, productId)

        val productDetailUseCase = mockk<ProductDetailUseCase>()
        coEvery {
            productDetailUseCase.run(productId.toInt())
        } returns flow { emit(model) }

        Espresso.onView(ViewMatchers.withId(R.id.tvName))
            .check(ViewAssertions.matches(ViewMatchers.withText(title)))
    }
    @After
    fun unregisterIdlingResource() {
        IdlingRegistry.getInstance().unregister(CountingIdlingResourceSingleton.countingIdlingResource)
    }
}
