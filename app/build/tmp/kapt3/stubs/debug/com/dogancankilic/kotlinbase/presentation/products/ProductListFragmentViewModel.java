package com.dogancankilic.kotlinbase.presentation.products;

import java.lang.System;

/**
 * ViewModel for [ProductListFragment]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\u000eR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/dogancankilic/kotlinbase/presentation/products/ProductListFragmentViewModel;", "Lcom/dogancankilic/kotlinbase/core/platform/BaseViewModel;", "productsUseCase", "Lcom/dogancankilic/kotlinbase/domain/products/ProductsUseCase;", "(Lcom/dogancankilic/kotlinbase/domain/products/ProductsUseCase;)V", "_products", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dogancankilic/kotlinbase/core/util/Resource;", "", "Lcom/dogancankilic/kotlinbase/presentation/products/model/ProductsUiModel;", "products", "Landroidx/lifecycle/LiveData;", "getProducts", "()Landroidx/lifecycle/LiveData;", "", "app_debug"})
public final class ProductListFragmentViewModel extends com.dogancankilic.kotlinbase.core.platform.BaseViewModel {
    private final com.dogancankilic.kotlinbase.domain.products.ProductsUseCase productsUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.dogancankilic.kotlinbase.core.util.Resource<java.util.List<com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel>>> _products = null;
    
    @javax.inject.Inject()
    public ProductListFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.dogancankilic.kotlinbase.domain.products.ProductsUseCase productsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.dogancankilic.kotlinbase.core.util.Resource<java.util.List<com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel>>> getProducts() {
        return null;
    }
    
    public final void getProducts() {
    }
}