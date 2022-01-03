package com.dogancankilic.kotlinbase.data.products

import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel
import com.dogancankilic.kotlinbase.di.RemoteDataSource
import javax.inject.Inject

class ProductsRepository @Inject constructor(
    @RemoteDataSource private val remoteDataSource: ProductsDataSource
) : ProductsDataSource {
    override suspend fun movies(): MutableList<ProductsResponseModel> {
        return remoteDataSource.movies()
    }
}
