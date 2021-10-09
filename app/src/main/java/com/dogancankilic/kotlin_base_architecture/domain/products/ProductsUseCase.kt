package com.dogancankilic.kotlin_base_architecture.domain.products

import com.dogancankilic.kotlin_base_architecture.data.products.ProductsDataSource
import com.dogancankilic.kotlin_base_architecture.data.products.model.ProductsResponseModel
import com.dogancankilic.kotlin_base_architecture.di.Repository
import com.dogancankilic.kotlin_base_architecture.presentation.products.model.ProductsUiModel
import javax.inject.Inject


class ProductsUseCase @Inject constructor(@Repository private val remoteDataSource: ProductsDataSource) {


    fun mapResponseModelToUiModel(responseList: List<ProductsResponseModel>):
            List<ProductsUiModel> = responseList.map {
        ProductsUiModel(
                it.image,
                it.price,
                it.id.toString(),
                it.rating,
                it.description,
                it.title,
                it.category

        )
    }

    suspend fun execute(): List<ProductsUiModel> {
        return mapResponseModelToUiModel(remoteDataSource.movies())
        /*     val productsDto = remoteDataSource.movies()
             val products = ArrayList<ProductsUiModel>()
             productsDto?.forEach { productResults ->
                 val product = ProductsUiModel(
                     productResults.image,
                     productResults.price
                 )
                 products.add(product)
             }
             return products*/
    }
}
