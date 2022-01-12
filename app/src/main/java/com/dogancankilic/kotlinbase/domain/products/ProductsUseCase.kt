package com.dogancankilic.kotlinbase.domain.products

import com.dogancankilic.kotlinbase.core.interactor.BaseUseCaseWithoutParams
import com.dogancankilic.kotlinbase.data.products.ProductsDataSource
import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel
import com.dogancankilic.kotlinbase.di.Repository
import com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel
import javax.inject.Inject

/**
 * Get products
 */
class ProductsUseCase @Inject constructor(@Repository private val remoteDataSource: ProductsDataSource) :
    BaseUseCaseWithoutParams<MutableList<ProductsUiModel>>() {
    override suspend fun run(): MutableList<ProductsUiModel> {
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
