package com.dogancankilic.kotlinbase.core.platform

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import javax.inject.Inject

/**
 * Base fragment to standardize and simplify initialization for this component.
 *
 * @param layoutRes Layout resource reference identifier.
 * @see Fragment
 */

abstract class BaseFragment<T : ViewDataBinding, VM : BaseViewModel> : Fragment() {

    protected lateinit var fragmentContext: Context

    // Binding
    protected lateinit var binding: T

    @LayoutRes
    protected abstract fun layoutRes(): Int

    @Inject
    lateinit var viewModel: VM

    protected abstract fun initView()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        fragmentContext = context
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(fragmentContext),
            layoutRes(),
            container,
            false
        )
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
}
