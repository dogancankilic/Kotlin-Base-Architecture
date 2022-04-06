package com.dogancankilic.kotlinbase.domain.products

import com.dogancankilic.kotlinbase.core.interactor.BaseUseCase
import com.dogancankilic.kotlinbase.data.products.ProductsDataSourceImpl
import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel
import com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel
import javax.inject.Inject

/**
 * Get products
 */
class ProductsUseCase @Inject constructor(private val remoteDataSource: ProductsDataSourceImpl) :
    BaseUseCase<MutableList<ProductsUiModel>, Unit>() {
    override suspend fun run(params: Unit): MutableList<ProductsUiModel> {
        return mapResponseModelToUiModel(remoteDataSource.products())
    }

    private fun mapResponseModelToUiModel(responseList: MutableList<ProductsResponseModel>):
        MutableList<ProductsUiModel> = responseList.map {
        ProductsUiModel(
            it.image,
            it.price.toString(),
            it.rating,
            it.description,
            it.title,
            it.category,
            it.id.toString()

        )
    } as MutableList<ProductsUiModel>
}
