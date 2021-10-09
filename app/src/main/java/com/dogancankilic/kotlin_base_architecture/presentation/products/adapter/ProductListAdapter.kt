package com.dogancankilic.kotlin_base_architecture.presentation.products.adapter

import android.view.View
import com.dogancankilic.kotlin_base_architecture.R
import com.dogancankilic.kotlin_base_architecture.core.platform.BaseListAdapter
import com.dogancankilic.kotlin_base_architecture.databinding.ProductListItemBinding
import com.dogancankilic.kotlin_base_architecture.presentation.products.model.ProductsUiModel

class ProductListAdapter : BaseListAdapter<ProductListItemBinding, ProductsUiModel>() {
    override fun getLayoutResId(): Int = R.layout.product_list_item

    override fun bind(binding: ProductListItemBinding, item: ProductsUiModel, itemPosition: Int) {
        binding.tvProductDesc.text = item.description
    }

}