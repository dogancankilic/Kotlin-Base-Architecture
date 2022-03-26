package com.dogancankilic.kotlinbase.core.interactor

import com.dogancankilic.kotlinbase.core.util.RequestInvoker

/**
 * Every UseCase must inherit [BaseUseCase] or [BaseUseCaseWithoutParams]
 */
abstract class BaseUseCase<out Type, in Params> where Type : Any {

    abstract suspend fun run(params: Params): Type

    suspend fun execute(params: Params):
        Result<Type> = RequestInvoker.apiRequest { run(params) }
}
