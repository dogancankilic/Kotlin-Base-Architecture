package com.dogancankilic.kotlinbase.core.platform

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil

/**
 * Base Paging Adapter
 */
abstract class BasePagingAdapter<T : ListAdapterItem, VB : ViewDataBinding>(
    diffCallback: DiffUtil.ItemCallback<T>
) : PagingDataAdapter<T, BaseViewHolder<VB>>(diffCallback) {

    override fun onBindViewHolder(holder: BaseViewHolder<VB>, position: Int) {
        getItem(position)?.let { bind(holder.binding, it, position) }
    }

    abstract fun getItemLayoutId(): Int

    protected abstract fun bind(binding: VB, item: T, itemPosition: Int)

    abstract override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<VB>
}
