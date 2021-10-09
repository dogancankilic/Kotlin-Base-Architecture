package com.dogancankilic.kotlin_base_architecture.data.products

import com.dogancankilic.kotlin_base_architecture.core.exception.Failure
import com.dogancankilic.kotlin_base_architecture.core.functional.Either
import com.dogancankilic.kotlin_base_architecture.data.products.model.ProductsResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface ProductsService {
    @GET("products")
    suspend fun getProducts() : Response<List<ProductsResponseModel>>
}
