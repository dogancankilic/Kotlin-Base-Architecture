package com.dogancankilic.kotlinbase.presentation.productdetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dogancankilic.kotlinbase.core.platform.BaseViewModel
import com.dogancankilic.kotlinbase.domain.productdetail.ProductDetailUseCase
import com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel
import javax.inject.Inject

/**
 * Product Detail ViewModel
 */
class ProductDetailViewModel @Inject constructor(
    private val productDetailUseCase: ProductDetailUseCase,
) : BaseViewModel() {
    private val _product = MutableLiveData<ProductsUiModel>()
    val product: LiveData<ProductsUiModel>
        get() = _product

    fun getProduct(id: String) {
        executeUseCase(
            productDetailUseCase,
            id.toInt()
        ) {
            _product.value = it
        }
    }
}
