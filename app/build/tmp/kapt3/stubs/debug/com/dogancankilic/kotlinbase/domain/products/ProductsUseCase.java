package com.dogancankilic.kotlinbase.domain.products;

import java.lang.System;

/**
 * Get products
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H\u0002J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/dogancankilic/kotlinbase/domain/products/ProductsUseCase;", "Lcom/dogancankilic/kotlinbase/core/interactor/BaseUseCaseWithoutParams;", "", "Lcom/dogancankilic/kotlinbase/presentation/products/model/ProductsUiModel;", "remoteDataSource", "Lcom/dogancankilic/kotlinbase/data/products/ProductsDataSourceImpl;", "(Lcom/dogancankilic/kotlinbase/data/products/ProductsDataSourceImpl;)V", "mapResponseModelToUiModel", "responseList", "Lcom/dogancankilic/kotlinbase/data/products/model/ProductsResponseModel;", "run", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProductsUseCase extends com.dogancankilic.kotlinbase.core.interactor.BaseUseCaseWithoutParams<java.util.List<com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel>> {
    private final com.dogancankilic.kotlinbase.data.products.ProductsDataSourceImpl remoteDataSource = null;
    
    @javax.inject.Inject()
    public ProductsUseCase(@org.jetbrains.annotations.NotNull()
    com.dogancankilic.kotlinbase.data.products.ProductsDataSourceImpl remoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object run(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel>> continuation) {
        return null;
    }
    
    private final java.util.List<com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel> mapResponseModelToUiModel(java.util.List<com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel> responseList) {
        return null;
    }
}