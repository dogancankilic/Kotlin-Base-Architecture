package com.dogancankilic.kotlinbase.data.products

import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel
import javax.inject.Inject

class ProductsRemoteDataSource @Inject constructor(
    private val productsService: ProductsService,
) : ProductsDataSource {
    override suspend fun movies(): MutableList<ProductsResponseModel> {
        return productsService.getProducts()
    }
}
