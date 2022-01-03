package com.dogancankilic.kotlinbase.presentation.products.productdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dogancankilic.kotlinbase.R
import com.dogancankilic.kotlinbase.databinding.ProductDetailFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductDetailFragment : Fragment(R.layout.product_detail_fragment) {
    private lateinit var binding: ProductDetailFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ProductDetailFragmentBinding.inflate(layoutInflater)
        return binding.root
    }
}
