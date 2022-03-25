package com.dogancankilic.kotlinbase.data.products

import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel
import kotlinx.coroutines.flow.Flow

/**
 * Provide functions for either remote or local data sources
 */
interface ProductsDataSource {
    suspend fun products(): MutableList<ProductsResponseModel>

    suspend fun productDetail(id: Int): Flow<ProductsResponseModel>
}
