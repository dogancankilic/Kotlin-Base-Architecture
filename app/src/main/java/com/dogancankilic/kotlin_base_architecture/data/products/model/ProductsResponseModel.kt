package com.dogancankilic.kotlin_base_architecture.data.products.model


data class ProductsResponseModel(
    val image: String,
    val price: Double,
    val rating: Rating,
    val description: String,
    val id: Int,
    val title: String,
    val category: String
)


data class Rating(
    val rate: Double,
    val count: Int
)
