package com.dogancankilic.kotlin_base_architecture.core.platform

import androidx.recyclerview.widget.DiffUtil

/**
 * This class use for compare two [ListAdapterItem] instance
 */
class ListAdapterItemDiffCallback<T : ListAdapterItem> : DiffUtil.ItemCallback<T>() {

    override fun areItemsTheSame(oldItem: T, newItem: T):
        Boolean = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: T, newItem: T):
        Boolean = oldItem == newItem
}