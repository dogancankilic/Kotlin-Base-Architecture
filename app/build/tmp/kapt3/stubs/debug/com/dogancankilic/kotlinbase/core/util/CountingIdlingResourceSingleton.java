package com.dogancankilic.kotlinbase.core.util;

import java.lang.System;

/**
 * Idling resource for espresso tests
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/dogancankilic/kotlinbase/core/util/CountingIdlingResourceSingleton;", "", "()V", "RESOURCE", "", "countingIdlingResource", "Landroidx/test/espresso/idling/CountingIdlingResource;", "decrement", "", "increment", "app_debug"})
public final class CountingIdlingResourceSingleton {
    @org.jetbrains.annotations.NotNull()
    public static final com.dogancankilic.kotlinbase.core.util.CountingIdlingResourceSingleton INSTANCE = null;
    private static final java.lang.String RESOURCE = "GLOBAL";
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final androidx.test.espresso.idling.CountingIdlingResource countingIdlingResource = null;
    
    private CountingIdlingResourceSingleton() {
        super();
    }
    
    public final void increment() {
    }
    
    public final void decrement() {
    }
}