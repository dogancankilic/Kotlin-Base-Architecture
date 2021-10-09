package com.dogancankilic.kotlin_base_architecture.data.products


import com.dogancankilic.kotlin_base_architecture.data.products.model.ProductsResponseModel

interface ProductsDataSource {
    suspend fun movies(): List<ProductsResponseModel>

}
