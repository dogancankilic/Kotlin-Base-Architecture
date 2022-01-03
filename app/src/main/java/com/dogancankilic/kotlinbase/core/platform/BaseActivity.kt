package com.dogancankilic.kotlinbase.core.platform

import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.dogancankilic.kotlinbase.R
import com.dogancankilic.kotlinbase.di.RemoteDataSource
import javax.inject.Inject

abstract class BaseActivity<VB : ViewBinding,VM : BaseViewModel> : AppCompatActivity() {

    protected lateinit var binding: VB
    @Inject
    protected lateinit var viewModel: VM

    protected abstract fun inflateVB(inflater: LayoutInflater): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateVB(layoutInflater)
        setContentView(binding.root)

        initView()

    }

    protected abstract fun initView()


}
