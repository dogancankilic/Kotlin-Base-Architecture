package com.dogancankilic.kotlinbase.data.products

import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel

interface ProductsDataSource {
    suspend fun movies(): MutableList<ProductsResponseModel>
}
