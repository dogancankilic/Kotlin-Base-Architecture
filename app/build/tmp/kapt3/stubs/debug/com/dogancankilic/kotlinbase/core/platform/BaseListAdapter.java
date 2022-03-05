package com.dogancankilic.kotlinbase.core.platform;

import java.lang.System;

/**
 * Base List Adapter
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0005B\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0002\u0010\tJ%\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000fH$\u00a2\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH&\u00a8\u0006\u0018"}, d2 = {"Lcom/dogancankilic/kotlinbase/core/platform/BaseListAdapter;", "T", "Lcom/dogancankilic/kotlinbase/core/platform/ListAdapterItem;", "VB", "Landroidx/databinding/ViewDataBinding;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/dogancankilic/kotlinbase/core/platform/BaseViewHolder;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "bind", "", "binding", "item", "itemPosition", "", "(Landroidx/databinding/ViewDataBinding;Lcom/dogancankilic/kotlinbase/core/platform/ListAdapterItem;I)V", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public abstract class BaseListAdapter<T extends com.dogancankilic.kotlinbase.core.platform.ListAdapterItem, VB extends androidx.databinding.ViewDataBinding> extends androidx.recyclerview.widget.ListAdapter<T, com.dogancankilic.kotlinbase.core.platform.BaseViewHolder<VB>> {
    
    public BaseListAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffCallback) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract com.dogancankilic.kotlinbase.core.platform.BaseViewHolder<VB> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType);
    
    protected abstract void bind(@org.jetbrains.annotations.NotNull()
    VB binding, @org.jetbrains.annotations.NotNull()
    T item, int itemPosition);
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dogancankilic.kotlinbase.core.platform.BaseViewHolder<VB> holder, int position) {
    }
}