package com.dogancankilic.kotlinbase.data.products

import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

/**
 * Calls for network services
 */
class ProductsDataSourceImpl @Inject constructor(
    private val productsService: ProductsService,
    private val ioDispatcher: CoroutineContext
) : ProductsDataSource {
    override suspend fun products(): MutableList<ProductsResponseModel> {
        return productsService.getProducts()
    }

    override suspend fun productDetail(id: Int): Flow<ProductsResponseModel> {
        return flow {
            emit(productsService.getProduct(id))
        }.flowOn(ioDispatcher)
    }
}
