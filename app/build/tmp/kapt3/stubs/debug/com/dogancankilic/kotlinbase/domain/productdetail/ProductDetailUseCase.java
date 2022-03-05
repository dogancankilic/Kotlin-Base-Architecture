package com.dogancankilic.kotlinbase.domain.productdetail;

import java.lang.System;

/**
 * Get product detail by id
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0002J\u0019\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/dogancankilic/kotlinbase/domain/productdetail/ProductDetailUseCase;", "Lcom/dogancankilic/kotlinbase/core/interactor/BaseUseCase;", "Lcom/dogancankilic/kotlinbase/presentation/products/model/ProductsUiModel;", "", "remoteDataSource", "Lcom/dogancankilic/kotlinbase/data/products/ProductsDataSourceImpl;", "(Lcom/dogancankilic/kotlinbase/data/products/ProductsDataSourceImpl;)V", "mapResponseModelToUiModel", "responseModel", "Lcom/dogancankilic/kotlinbase/data/products/model/ProductsResponseModel;", "run", "params", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProductDetailUseCase extends com.dogancankilic.kotlinbase.core.interactor.BaseUseCase<com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel, java.lang.Integer> {
    private final com.dogancankilic.kotlinbase.data.products.ProductsDataSourceImpl remoteDataSource = null;
    
    @javax.inject.Inject()
    public ProductDetailUseCase(@org.jetbrains.annotations.NotNull()
    com.dogancankilic.kotlinbase.data.products.ProductsDataSourceImpl remoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object run(int params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel> continuation) {
        return null;
    }
    
    private final com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel mapResponseModelToUiModel(com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel responseModel) {
        return null;
    }
}