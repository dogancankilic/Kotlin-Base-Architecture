package com.dogancankilic.kotlinbase.data.products

import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel
import retrofit2.http.GET

interface ProductsService {
    @GET("products")
    suspend fun getProducts(): MutableList<ProductsResponseModel>
}
