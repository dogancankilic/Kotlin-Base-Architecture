package com.dogancankilic.kotlin_base_architecture.presentation.products

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.dogancankilic.kotlin_base_architecture.R
import com.dogancankilic.kotlin_base_architecture.databinding.ProductListFragmentBinding
import com.dogancankilic.kotlin_base_architecture.presentation.products.adapter.ProductListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductListFragment :  Fragment(R.layout.product_list_fragment) {
    private val viewModel by viewModels<ProductListFragmentViewModel>()

    private lateinit var adapter: ProductListAdapter
    private lateinit var binding: ProductListFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = ProductListAdapter()
        binding.rvProducts.adapter = adapter
        viewModel.getProducts()
        observeViewState()

    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = ProductListFragmentBinding.inflate(layoutInflater)
        return binding.root
    }
    private fun observeViewState() {
        viewModel.products.observe(viewLifecycleOwner) { viewState ->
            adapter.submitList(viewState)
            Toast.makeText(context,"${viewState[0].price}", Toast.LENGTH_SHORT).show()
        }
    }
}
