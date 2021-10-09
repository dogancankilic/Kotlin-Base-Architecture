package com.dogancankilic.kotlin_base_architecture.core.functional

import java.io.IOException

class ApiExceptions {
    class ApiException(errorMessage: String): Exception(errorMessage)

    class NoInternetException(message: String): IOException(message)
}
