package com.dogancankilic.kotlinbase.products.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.dogancankilic.kotlinbase.domain.productdetail.ProductDetailUseCase
import com.dogancankilic.kotlinbase.presentation.productdetail.ProductDetailViewModel
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

/**
 * ProductDetailViewModelTest
 */
@ExperimentalCoroutinesApi
class ProductDetailViewModelTest {

    @get:Rule
    val coroutineTestRule = TestCoroutineRule()

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    private val productDetailUseCase = mockk<ProductDetailUseCase>()

    private lateinit var viewModel: ProductDetailViewModel

    var expectedResponse: ProductsUiModel? = null

    @Before
    fun setUp() {
        viewModel = ProductDetailViewModel(productDetailUseCase)
    }

    @Test
    fun `success state testing case`() {
        coroutineTestRule.runBlockingTest {

            // Given
            val expectedResponse = mockk<ProductsUiModel>()
            coEvery { productDetailUseCase.execute(2) } returns Result.success(expectedResponse)

            // When
            viewModel.getProduct("2")
            val response = viewModel.product.value

            // Then
            coVerify(exactly = 1) { productDetailUseCase.execute(2) }
            response shouldBeEqualTo expectedResponse
        }
    }
}
