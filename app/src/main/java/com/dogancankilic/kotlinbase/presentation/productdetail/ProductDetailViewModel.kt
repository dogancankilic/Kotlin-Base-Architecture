package com.dogancankilic.kotlinbase.presentation.productdetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.dogancankilic.kotlinbase.core.platform.BaseViewModel
import com.dogancankilic.kotlinbase.domain.productdetail.ProductDetailUseCase
import com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.supervisorScope
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
        viewModelScope.launch {
            supervisorScope {
                val backgroundJob = async { productDetailUseCase.execute(id.toInt()) }
                val result = (backgroundJob.await())

                result
                    .onSuccess { setProduct(it) }
                    .onFailure { handleHttpError(it) }
            }
        }
    }

    fun setProduct(value: ProductsUiModel) {
        _product.value = value
    }
}
