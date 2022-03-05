package com.dogancankilic.kotlinbase.core.platform;

import java.lang.System;

/**
 * Every List Adapter Model must implement this interface
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/dogancankilic/kotlinbase/core/platform/ListAdapterItem;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "app_debug"})
public abstract class ListAdapterItem {
    
    public ListAdapterItem() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getId();
    
    public abstract void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
}