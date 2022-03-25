package com.dogancankilic.kotlinbase.domain.productdetail

import com.dogancankilic.kotlinbase.core.interactor.BaseUseCase
import com.dogancankilic.kotlinbase.data.products.ProductsDataSourceImpl
import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel
import com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

/**
 * Get product detail by id
 */
class ProductDetailUseCase @Inject constructor(private val remoteDataSource: ProductsDataSourceImpl) :
    BaseUseCase<Flow<ProductsUiModel>, Int>() {
    override suspend fun run(params: Int): Flow<ProductsUiModel> {
        return mapResponseModelToUiModel(remoteDataSource.productDetail(params))
    }

    private fun mapResponseModelToUiModel(responseModel: Flow<ProductsResponseModel>): Flow<ProductsUiModel> {

        return responseModel.map { responseModel ->
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
    }
}
