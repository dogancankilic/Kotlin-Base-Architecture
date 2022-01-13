package com.dogancankilic.kotlinbase.domain.productdetail

import com.dogancankilic.kotlinbase.core.interactor.BaseUseCase
import com.dogancankilic.kotlinbase.data.products.ProductsDataSourceImpl
import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel
import com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel
import javax.inject.Inject

/**
 * Get product detail by id
 */
class ProductDetailUseCase @Inject constructor(private val remoteDataSource: ProductsDataSourceImpl) :
    BaseUseCase<ProductsUiModel, Int>() {
    override suspend fun run(params: Int): ProductsUiModel {
        return mapResponseModelToUiModel(remoteDataSource.productDetail(params))
    }

    private fun mapResponseModelToUiModel(responseModel: ProductsResponseModel) =
        ProductsUiModel(
            responseModel.image,
            responseModel.price.toString(),
            responseModel.rating,
            responseModel.description,
            responseModel.title,
            responseModel.category,
            responseModel.id.toString()
        )
}
