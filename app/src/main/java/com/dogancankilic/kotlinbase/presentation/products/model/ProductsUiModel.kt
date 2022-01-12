package com.dogancankilic.kotlinbase.presentation.products.model

import com.dogancankilic.kotlinbase.core.platform.ListAdapterItem
import com.dogancankilic.kotlinbase.data.products.model.Rating

/**
 * Products UI Model
 */
data class ProductsUiModel(
    val image: String,
    val price: String,
    val rating: Rating,
    val description: String,
    val title: String,
    val category: String,
    override var id: String
) : ListAdapterItem()
