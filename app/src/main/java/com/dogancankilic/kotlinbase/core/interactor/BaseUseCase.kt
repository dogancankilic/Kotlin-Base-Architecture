package com.dogancankilic.kotlinbase.core.interactor

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

/**
 * Every UseCase must inherit [BaseUseCase] or [BaseUseCaseWithoutParams]
 */
abstract class BaseUseCase<out Type, in Params> where Type : Any {

    abstract suspend fun run(params: Params): Type

    suspend fun execute(
        params: Params,
    ):
        Flow<Result<Type>> = flow {
        emit(Result.success(run(params)))
    }.catch { Result.failure<Throwable>(it) }
}
