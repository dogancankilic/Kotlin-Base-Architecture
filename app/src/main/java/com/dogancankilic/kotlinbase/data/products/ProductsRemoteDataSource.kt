package com.dogancankilic.kotlinbase.data.products

import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel
import javax.inject.Inject

/**
 * Indicates data coming from network call
 */
class ProductsRemoteDataSource @Inject constructor(
    private val productsService: ProductsService,
) : ProductsDataSource {
    override suspend fun products(): MutableList<ProductsResponseModel> {
        return productsService.getProducts()
    }

    override suspend fun productDetail(id: Int): ProductsResponseModel {
        return productsService.getProduct(id)
    }
}
