package com.dogancankilic.kotlinbase.presentation.products.adapter;

import java.lang.System;

/**
 * Product list adapter
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J \u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012H\u0016R7\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/dogancankilic/kotlinbase/presentation/products/adapter/ProductListAdapter;", "Lcom/dogancankilic/kotlinbase/core/platform/BaseListAdapter;", "Lcom/dogancankilic/kotlinbase/presentation/products/model/ProductsUiModel;", "Lcom/dogancankilic/kotlinbase/databinding/ProductListItemBinding;", "()V", "itemClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "bind", "binding", "itemPosition", "", "onCreateViewHolder", "Lcom/dogancankilic/kotlinbase/core/platform/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class ProductListAdapter extends com.dogancankilic.kotlinbase.core.platform.BaseListAdapter<com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel, com.dogancankilic.kotlinbase.databinding.ProductListItemBinding> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel, kotlin.Unit> itemClickListener;
    
    public ProductListAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel, kotlin.Unit> getItemClickListener() {
        return null;
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    protected void bind(@org.jetbrains.annotations.NotNull()
    com.dogancankilic.kotlinbase.databinding.ProductListItemBinding binding, @org.jetbrains.annotations.NotNull()
    com.dogancankilic.kotlinbase.presentation.products.model.ProductsUiModel item, int itemPosition) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dogancankilic.kotlinbase.core.platform.BaseViewHolder<com.dogancankilic.kotlinbase.databinding.ProductListItemBinding> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
}