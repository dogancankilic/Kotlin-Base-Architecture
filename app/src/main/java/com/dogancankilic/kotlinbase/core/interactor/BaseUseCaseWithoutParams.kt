package com.dogancankilic.kotlinbase.core.interactor

import com.dogancankilic.kotlinbase.core.util.RequestInvoker

/**
 * Every UseCase must inherit [BaseUseCase] or [BaseUseCaseWithoutParams]
 */
abstract class BaseUseCaseWithoutParams<out Type> where Type : Any {

    abstract suspend fun run(): Type

    suspend fun execute():
        Result<Type> = RequestInvoker.apiRequest { run() }
}
