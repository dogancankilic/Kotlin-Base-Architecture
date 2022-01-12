package com.dogancankilic.kotlinbase.data.products.model

import com.google.gson.annotations.SerializedName

/**
 * Response model for products
 */
data class ProductsResponseModel(
    @SerializedName("id") var id: Int,
    @SerializedName("title") var title: String,
    @SerializedName("price") var price: Double,
    @SerializedName("description") var description: String,
    @SerializedName("category") var category: String,
    @SerializedName("image") var image: String,
    @SerializedName("rating") var rating: Rating
)

/**
 * Rating model for products
 */
data class Rating(
    @SerializedName("count")
    val count: Int,
    @SerializedName("rate")
    val rate: Double
)
