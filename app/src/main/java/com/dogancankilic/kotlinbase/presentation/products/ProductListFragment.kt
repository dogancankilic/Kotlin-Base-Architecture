package com.dogancankilic.kotlinbase.presentation.products

import androidx.navigation.fragment.findNavController
import com.dogancankilic.kotlinbase.R
import com.dogancankilic.kotlinbase.core.extension.observe
import com.dogancankilic.kotlinbase.core.platform.BaseFragment
import com.dogancankilic.kotlinbase.core.util.CountingIdlingResourceSingleton
import com.dogancankilic.kotlinbase.databinding.ProductListFragmentBinding
import com.dogancankilic.kotlinbase.presentation.products.adapter.ProductListAdapter
import dagger.hilt.android.AndroidEntryPoint

/**
 * ProductList Fragment
 */
@AndroidEntryPoint
class ProductListFragment :
    BaseFragment<ProductListFragmentBinding, ProductListFragmentViewModel>() {

    private lateinit var adapter: ProductListAdapter

    override fun initView() {
        adapter = ProductListAdapter()

        binding.rvProducts.adapter = adapter

        if (viewModel.products.value == null) {
            CountingIdlingResourceSingleton.increment()
            viewModel.getProducts()
        }

        observeViewState()
    }

    private fun observeViewState() {
        // val adapter = binding.rvProducts.adapter as ProductListAdapter

        val jobOnComplete = Runnable {
            CountingIdlingResourceSingleton.decrement()
        }
        observe(viewModel.products) {
            adapter.submitList(it.data, jobOnComplete)
        }
        if (1>10) {
            adapter.itemClickListener = { item ->
                onItemClick(item.id)
            }
        }

    }

    fun onItemClick(id: String) {
        val action = ProductListFragmentDirections.navigateToProductDetail(id)
        findNavController().navigate(action)
    }

    override fun layoutRes(): Int = R.layout.product_list_fragment
}
