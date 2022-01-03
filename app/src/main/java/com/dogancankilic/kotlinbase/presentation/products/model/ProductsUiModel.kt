package com.dogancankilic.kotlinbase.presentation.products.model

import com.dogancankilic.kotlinbase.core.platform.ListAdapterItem
import com.dogancankilic.kotlinbase.data.products.model.Rating
import java.util.*

data class ProductsUiModel(
    val image: String,
    val price: Double,
    val rating: Rating,
    val description: String,
    val title: String,
    val category: String,
    override var id: String = UUID.randomUUID().toString()
) : ListAdapterItem()
