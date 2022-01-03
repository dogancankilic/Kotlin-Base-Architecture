package com.dogancankilic.kotlinbase.core.interactor

import com.dogancankilic.kotlinbase.core.functional.RequestInvoker

abstract class BaseUseCaseWithoutParams<out Type> where Type : Any {

    abstract suspend fun run(): Type

    suspend fun execute():
        Result<Type> = RequestInvoker.apiRequest { run() }
}
