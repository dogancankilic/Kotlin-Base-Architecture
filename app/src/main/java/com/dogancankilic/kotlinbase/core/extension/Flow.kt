package com.dogancankilic.kotlinbase.core.extension

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlin.coroutines.cancellation.CancellationException

fun <T> Flow<T>.doOnError(onError: (Throwable) -> Unit): Flow<T> {
    return flow {
        try {
            collect { value ->
                emit(value)
            }
        } catch (e: Exception) {
            onError(e)
            throw e
        }
    }
}

public inline fun <T, R> T.runCatchingCancellable(block: T.() -> R): Result<R> {
    return try {
        Result.success(block())
    } catch (e: Throwable) {
        if (e is CancellationException) {
            throw e
        }
        Result.failure(e)
    }
}
