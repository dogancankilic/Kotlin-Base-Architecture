package com.dogancankilic.kotlin_base_architecture.presentation.products.model

import com.dogancankilic.kotlin_base_architecture.core.platform.ListAdapterItem
import com.dogancankilic.kotlin_base_architecture.data.products.model.Rating

data class ProductsUiModel(
        val image: String,
        val price: Double,
        override val id: String = "",
        val rating: Rating,
        val description: String,
        val title: String,
        val category: String
) : ListAdapterItem
