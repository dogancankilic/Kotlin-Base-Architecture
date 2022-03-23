package com.dogancankilic.kotlinbase.core.platform

import androidx.lifecycle.ViewModel
import retrofit2.HttpException

/**
 * Base ViewModel
 */
abstract class BaseViewModel : ViewModel() {

    protected open fun handleHttpError(throwable: Throwable) {
        if (throwable is HttpException) {
            println(throwable.code())
            println(throwable.message())
        } else {
            println(throwable.cause)
            println(throwable.message)
            println(throwable.localizedMessage)
        }
    }
}
