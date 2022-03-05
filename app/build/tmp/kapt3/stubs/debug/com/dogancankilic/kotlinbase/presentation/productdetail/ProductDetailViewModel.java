package com.dogancankilic.kotlinbase.presentation.productdetail;

import java.lang.System;

/**
 * Product Detail ViewModel
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/dogancankilic/kotlinbase/presentation/productdetail/ProductDetailViewModel;", "Lcom/dogancankilic/kotlinbase/core/platform/BaseViewModel;", "productDetailUseCase", "Lcom/dogancankilic/kotlinbase/domain/productdetail/ProductDetailUseCase;", "(Lcom/dogancankilic/kotlinbase/domain/productdetail/ProductDetailUseCase;)V", "_product", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dogancankilic/kotlinbase/presentation/products/model/ProductsUiModel;", "product", "Landroidx/lifecycle/LiveData;", "getProduct", "()Landroidx/lifecycle/LiveData;", "", "id", "", "app_debug"})
public final class ProductDetailViewModel extends com.dogancankilic.kotlinbase.core.platform.BaseViewModel {
    private final com.dogancankilic.kotlinbase.domain.productdetail.ProductDetailUseCase productDetailUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel> _product = null;
    
    @javax.inject.Inject()
    public ProductDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.dogancankilic.kotlinbase.domain.productdetail.ProductDetailUseCase productDetailUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel> getProduct() {
        return null;
    }
    
    public final void getProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
}