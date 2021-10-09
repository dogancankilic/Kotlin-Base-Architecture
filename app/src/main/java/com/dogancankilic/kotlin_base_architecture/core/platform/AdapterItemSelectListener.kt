package com.dogancankilic.kotlin_base_architecture.core.platform
/**
 * This interface will be used to pass onItemSelected action to outside of adapter
 */
interface AdapterItemSelectListener<T> {

    /**
     * This method will be called when user select adapter item
     */
    fun onAdapterItemSelected(listItem: T)
}