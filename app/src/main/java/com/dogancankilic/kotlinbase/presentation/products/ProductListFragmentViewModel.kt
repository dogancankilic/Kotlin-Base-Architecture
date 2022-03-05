package com.dogancankilic.kotlinbase.presentation.products

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dogancankilic.kotlinbase.core.platform.BaseViewModel
import com.dogancankilic.kotlinbase.core.util.Resource
import com.dogancankilic.kotlinbase.domain.products.ProductsUseCase
import com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel
import javax.inject.Inject

/**
 * ViewModel for [ProductListFragment]
 */
class ProductListFragmentViewModel @Inject constructor(
    private val productsUseCase: ProductsUseCase,
) : BaseViewModel() {
    private val _products = MutableLiveData<Resource<MutableList<ProductsUiModel>>>()
    val products: LiveData<Resource<MutableList<ProductsUiModel>>>
        get() = _products

    fun getProducts() {
        executeUseCase(productsUseCase) {
            _products.postValue(Resource.success(it))
        }
    }
}
