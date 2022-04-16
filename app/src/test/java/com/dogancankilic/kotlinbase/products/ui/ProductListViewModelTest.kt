package com.dogancankilic.kotlinbase.products.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.dogancankilic.kotlinbase.domain.products.ProductsUseCase
import com.dogancankilic.kotlinbase.presentation.products.ProductListFragmentViewModel
import com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel
import com.util.TestCoroutineRule
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.amshove.kluent.shouldBeEqualTo
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

@ExperimentalCoroutinesApi
class ProductListViewModelTest {
    @get:Rule
    val coroutineTestRule = TestCoroutineRule()

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    private val productsUseCase = mockk<ProductsUseCase>()

    private lateinit var viewModel: ProductListFragmentViewModel

    @Before
    fun setUp() {
        viewModel = ProductListFragmentViewModel(productsUseCase)
    }

    @Test
    fun `success state testing case`() {
        coroutineTestRule.runBlockingTest {

            // Given
            val expectedResponse = mockk<MutableList<ProductsUiModel>>()
            coEvery { productsUseCase.execute(Unit) } returns Result.success(expectedResponse)

            // When
            viewModel.getProducts()
            val response = viewModel.products.value

            // Then
            coVerify(exactly = 1) { productsUseCase.execute(Unit) }
            response?.data shouldBeEqualTo expectedResponse
        }
    }
}
