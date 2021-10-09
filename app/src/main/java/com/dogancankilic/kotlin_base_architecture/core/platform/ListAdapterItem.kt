package com.dogancankilic.kotlin_base_architecture.core.platform

/**
 * The item model which will be used in BaseAdapters, must implement this interface
 */
interface ListAdapterItem {
    val id: String

    override fun equals(other: Any?): Boolean
}