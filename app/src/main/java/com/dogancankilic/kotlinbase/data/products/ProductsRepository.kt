package com.dogancankilic.kotlinbase.data.products

import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel
import com.dogancankilic.kotlinbase.di.RemoteDataSource
import javax.inject.Inject

/**
 * Executing remote or local data sources
 */
class ProductsRepository @Inject constructor(
    @RemoteDataSource private val remoteDataSource: ProductsDataSource
) : ProductsDataSource {
    override suspend fun products(): MutableList<ProductsResponseModel> {
        return remoteDataSource.products()
    }

    override suspend fun productDetail(id: Int): ProductsResponseModel {
        return remoteDataSource.productDetail(id)
    }
}
