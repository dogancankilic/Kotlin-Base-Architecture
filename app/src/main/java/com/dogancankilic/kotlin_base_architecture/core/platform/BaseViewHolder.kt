package com.dogancankilic.kotlin_base_architecture.core.platform

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

/**
 * BaseViewHolder For Recycler Adapter
 */
class BaseViewHolder<VB : ViewDataBinding>(val binding: VB) : RecyclerView.ViewHolder(binding.root)