package com.dogancankilic.kotlinbase.core.extension

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

/**
 * Binding adapters
 */
@BindingAdapter("imageUrl")
fun ImageView.loadImage(url: String) {
    Glide.with(this).load(url).into(this)
}
