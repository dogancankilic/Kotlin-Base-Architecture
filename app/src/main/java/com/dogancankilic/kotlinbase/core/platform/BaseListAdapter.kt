package com.dogancankilic.kotlinbase.core.platform

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

abstract class BaseListAdapter<T : ListAdapterItem, VB : ViewDataBinding>(diffCallback: DiffUtil.ItemCallback<T>) :
    ListAdapter<T, BaseViewHolder<VB>>(diffCallback) {

    abstract override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<VB>

    protected abstract fun bind(binding: VB, item: T, itemPosition: Int)

    override fun onBindViewHolder(holder: BaseViewHolder<VB>, position: Int) {
        bind(holder.binding, getItem(position), position)
    }
}
