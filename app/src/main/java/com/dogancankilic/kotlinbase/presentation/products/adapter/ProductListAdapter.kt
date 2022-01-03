package com.dogancankilic.kotlinbase.presentation.products.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.dogancankilic.kotlinbase.core.platform.BaseListAdapter
import com.dogancankilic.kotlinbase.core.platform.BaseViewHolder
import com.dogancankilic.kotlinbase.core.platform.ListAdapterItemDiffCallback
import com.dogancankilic.kotlinbase.databinding.ProductListItemBinding
import com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel

class ProductListAdapter :
    BaseListAdapter<ProductsUiModel, ProductListItemBinding>(
        ListAdapterItemDiffCallback()
    ) {

    var itemClickListener: ((item: ProductsUiModel) -> Unit)? = null

    override fun bind(binding: ProductListItemBinding, item: ProductsUiModel, itemPosition: Int) {
        binding.item = item
        binding.root.setOnClickListener {
            itemClickListener?.invoke(item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<ProductListItemBinding> {
        val binding =
            ProductListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BaseViewHolder(binding)
    }
}
