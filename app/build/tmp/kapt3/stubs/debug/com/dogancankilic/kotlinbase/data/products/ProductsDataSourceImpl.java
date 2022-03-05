package com.dogancankilic.kotlinbase.data.products;

import java.lang.System;

/**
 * Calls for network services
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/dogancankilic/kotlinbase/data/products/ProductsDataSourceImpl;", "Lcom/dogancankilic/kotlinbase/data/products/ProductsDataSource;", "productsService", "Lcom/dogancankilic/kotlinbase/data/products/ProductsService;", "(Lcom/dogancankilic/kotlinbase/data/products/ProductsService;)V", "productDetail", "Lcom/dogancankilic/kotlinbase/data/products/model/ProductsResponseModel;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "products", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProductsDataSourceImpl implements com.dogancankilic.kotlinbase.data.products.ProductsDataSource {
    private final com.dogancankilic.kotlinbase.data.products.ProductsService productsService = null;
    
    @javax.inject.Inject()
    public ProductsDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.dogancankilic.kotlinbase.data.products.ProductsService productsService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object products(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object productDetail(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel> continuation) {
        return null;
    }
}