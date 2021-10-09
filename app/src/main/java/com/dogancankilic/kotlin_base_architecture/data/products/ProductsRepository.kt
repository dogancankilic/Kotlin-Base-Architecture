package com.dogancankilic.kotlin_base_architecture.data.products

import com.dogancankilic.kotlin_base_architecture.data.products.model.ProductsResponseModel
import com.dogancankilic.kotlin_base_architecture.di.RemoteDataSource
import javax.inject.Inject

class ProductsRepository @Inject constructor(
    @RemoteDataSource private val remoteDataSource: ProductsDataSource
)  : ProductsDataSource {
    override suspend fun movies(): List<ProductsResponseModel> {
        return remoteDataSource.movies()
    }


}
