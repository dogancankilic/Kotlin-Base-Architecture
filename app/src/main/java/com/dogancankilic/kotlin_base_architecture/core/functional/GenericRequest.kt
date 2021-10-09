package com.dogancankilic.kotlin_base_architecture.core.functional

import com.dogancankilic.kotlin_base_architecture.core.functional.MovieError.SERVER_ERROR
import com.dogancankilic.kotlin_base_architecture.core.functional.MovieError.UNKNOWN_ERROR
import retrofit2.Response

abstract class GenericRequest {
    suspend fun <T> apiRequest(call: suspend () -> Response<T>): T {
        val response = call.invoke()
        var error = ""
        if (response.isSuccessful) {
            return response.body()!!
        } else {
            error = when {
                response.code() == 500 -> {
                    SERVER_ERROR
                }
                else -> {
                    UNKNOWN_ERROR
                }
            }
        }
        throw ApiExceptions.ApiException(error)
    }
}
