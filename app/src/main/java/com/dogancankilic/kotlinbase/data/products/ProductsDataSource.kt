package com.dogancankilic.kotlinbase.data.products

import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel

/**
 * Provide functions for either remote or local data sources
 */
interface ProductsDataSource {
    suspend fun products(): MutableList<ProductsResponseModel>

    suspend fun productDetail(id: Int): ProductsResponseModel
}
