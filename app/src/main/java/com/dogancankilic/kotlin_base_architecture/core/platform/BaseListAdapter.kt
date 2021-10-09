package com.dogancankilic.kotlin_base_architecture.core.platform

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

@Suppress("MemberVisibilityCanBePrivate", "unused")
abstract class BaseListAdapter<VB : ViewDataBinding, T : ListAdapterItem> :
    ListAdapter<T, BaseViewHolder<VB>> {

    /**
     * @param diffCallback used to compare two item in the list,
     * passed to super and default generation using [ListAdapterItemDiffCallback]
     */
    constructor(diffCallback: DiffUtil.ItemCallback<T> = ListAdapterItemDiffCallback()) :
        super(diffCallback)

    /**
     * @param diffCallback passed to super default generation using [ListAdapterItemDiffCallback]
     * @param callBack is [AdapterItemSelectListener] to be used to  pass on item click event to outside
     */
    constructor(
        diffCallback: DiffUtil.ItemCallback<T> = ListAdapterItemDiffCallback(),
        callBack: AdapterItemSelectListener<T>
    ) : super(diffCallback) {
        itemClickCallBack = callBack
    }

    /**
     * use this instance when u call onClick outside of adapter
     */
    protected var itemClickCallBack: AdapterItemSelectListener<T>? = null

    /**
     * this method used to get item layout resource id
     */
    @LayoutRes
    protected abstract fun getLayoutResId(): Int

    /**
     * this method used to bind [item] to [BaseViewHolder] instance
     */
    protected abstract fun bind(binding: VB, item: T, itemPosition: Int)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<VB> {
        val binding = DataBindingUtil.inflate<VB>(
            LayoutInflater.from(parent.context),
            getLayoutResId(),
            parent,
            false
        )

        return BaseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<VB>, position: Int) {
        bind(holder.binding, getItem(position), position)
    }
}