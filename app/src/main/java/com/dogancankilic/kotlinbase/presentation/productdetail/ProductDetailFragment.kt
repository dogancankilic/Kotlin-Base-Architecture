package com.dogancankilic.kotlinbase.presentation.productdetail

import androidx.navigation.fragment.navArgs
import com.dogancankilic.kotlinbase.R
import com.dogancankilic.kotlinbase.core.extension.observe
import com.dogancankilic.kotlinbase.core.platform.BaseFragment
import com.dogancankilic.kotlinbase.core.util.CountingIdlingResourceSingleton
import com.dogancankilic.kotlinbase.databinding.ProductDetailFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * Product detail fragment
 */
@AndroidEntryPoint
class ProductDetailFragment : BaseFragment<ProductDetailFragmentBinding, ProductDetailViewModel>() {
    override fun layoutRes() = R.layout.product_detail_fragment

    override fun initView() {
        navArgs<ProductDetailFragmentArgs>().value.run {

            viewModel.getProduct(stringProductId)
            CountingIdlingResourceSingleton.increment()

            observe(viewModel.product) {
                binding.tvName.text = it.title
                CountingIdlingResourceSingleton.decrement()
            }
        }
    }
}
