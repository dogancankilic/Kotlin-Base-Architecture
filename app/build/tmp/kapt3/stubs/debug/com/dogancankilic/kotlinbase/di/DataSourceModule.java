package com.dogancankilic.kotlinbase.di;

import java.lang.System;

/**
 * Provide data source implementations
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/dogancankilic/kotlinbase/di/DataSourceModule;", "", "()V", "provideProductRemoteDataSource", "Lcom/dogancankilic/kotlinbase/data/products/ProductsDataSource;", "productsRemoteDataSource", "Lcom/dogancankilic/kotlinbase/data/products/ProductsDataSourceImpl;", "app_debug"})
@dagger.Module()
public abstract class DataSourceModule {
    
    public DataSourceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @javax.inject.Singleton()
    public abstract com.dogancankilic.kotlinbase.data.products.ProductsDataSource provideProductRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.dogancankilic.kotlinbase.data.products.ProductsDataSourceImpl productsRemoteDataSource);
}