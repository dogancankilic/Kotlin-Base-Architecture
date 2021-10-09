package com.dogancankilic.kotlin_base_architecture.presentation.products

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dogancankilic.kotlin_base_architecture.domain.products.ProductsUseCase
import com.dogancankilic.kotlin_base_architecture.presentation.products.model.ProductsUiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class ProductListFragmentViewModel @Inject constructor(
    private val productsUseCase: ProductsUseCase
) : ViewModel() {
    private val _products = MutableLiveData<List<ProductsUiModel>>()
    val products: LiveData<List<ProductsUiModel>>
        get() = _products


    fun getProducts() {
        // showLoader()
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = productsUseCase.execute()
                withContext(Dispatchers.Main) {
                  //  hideLoader()
                    _products.value = response
                }
            } catch (e: Exception) {
              /*  hideLoader()
                handleError(e, _popularMovies)*/
            }


        }
    }
}
