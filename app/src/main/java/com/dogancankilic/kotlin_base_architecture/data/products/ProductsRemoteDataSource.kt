package com.dogancankilic.kotlin_base_architecture.data.products

import com.dogancankilic.kotlin_base_architecture.core.functional.GenericRequest
import com.dogancankilic.kotlin_base_architecture.data.products.model.ProductsResponseModel
import javax.inject.Inject

class ProductsRemoteDataSource @Inject constructor(
    private val productsService: ProductsService,
) : ProductsDataSource, GenericRequest() {
    override suspend fun movies(): List<ProductsResponseModel> =  apiRequest {
        productsService.getProducts()
    }
}
