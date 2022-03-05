package com.dogancankilic.kotlinbase.data.products;

import java.lang.System;

/**
 * Products endpoints
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/dogancankilic/kotlinbase/data/products/ProductsService;", "", "getProduct", "Lcom/dogancankilic/kotlinbase/data/products/model/ProductsResponseModel;", "productId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ProductsService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "products")
    public abstract java.lang.Object getProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "products/{id}")
    public abstract java.lang.Object getProduct(@retrofit2.http.Path(value = "id")
    int productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel> continuation);
}