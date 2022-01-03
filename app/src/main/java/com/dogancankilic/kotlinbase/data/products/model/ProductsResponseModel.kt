package com.dogancankilic.kotlinbase.data.products.model

import com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel
import com.google.gson.annotations.SerializedName

data class ProductsResponseModel(
    @SerializedName("id") var id: Int,
    @SerializedName("title") var title: String,
    @SerializedName("price") var price: Double,
    @SerializedName("description") var description: String,
    @SerializedName("category") var category: String,
    @SerializedName("image") var image: String,
    @SerializedName("rating") var rating: Rating
)

fun List<ProductsResponseModel>.groupBySeasons() =
    map {

        ProductsUiModel(
            it.image,
            it.price,
            it.rating,
            it.description,
            it.title,
            it.category,
            it.id.toString(),

        )
    }
