package com.dogancankilic.kotlinbase.core.functional

object RequestInvoker {
    suspend fun <T> apiRequest(call: suspend () -> T): Result<T> =

        kotlin.runCatching {
            Result.success(call.invoke())
        }.getOrElse {
            Result.failure(it)
        }
}
