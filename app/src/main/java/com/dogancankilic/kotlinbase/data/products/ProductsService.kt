package com.dogancankilic.kotlinbase.data.products

import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Products endpoints
 */
interface ProductsService {
    @GET("products")
    suspend fun getProducts(): MutableList<ProductsResponseModel>

    @GET("products/{id}")
    suspend fun getProduct(
        @Path("id") productId: Int,
    ): ProductsResponseModel
}
