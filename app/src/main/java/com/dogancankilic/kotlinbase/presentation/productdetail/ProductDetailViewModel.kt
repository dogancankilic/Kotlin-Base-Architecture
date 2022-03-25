package com.dogancankilic.kotlinbase.presentation.productdetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.dogancankilic.kotlinbase.core.platform.BaseViewModel
import com.dogancankilic.kotlinbase.domain.productdetail.ProductDetailUseCase
import com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
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
            productDetailUseCase.execute(id.toInt()).collect { result ->
                result
                    .onSuccess { setProduct(it) }
                    .onFailure { handleHttpError(it) }
            }
        }
    }

    suspend fun setProduct(uiModel: Flow<ProductsUiModel>) {
        uiModel.collect { value ->
            _product.value = value
        }
    }
}
