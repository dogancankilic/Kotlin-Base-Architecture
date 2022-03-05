package com.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a?\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\n\u001a$\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a8\u0006\r"}, d2 = {"getOrAwaitValue", "T", "Landroidx/lifecycle/LiveData;", "time", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "afterObserve", "Lkotlin/Function0;", "", "(Landroidx/lifecycle/LiveData;JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "observeForTesting", "block", "app_debug"})
public final class LiveDataTestUtilKt {
    
    /**
     * Gets the value of a [LiveData] or waits for it to have one, with a timeout.
     *
     * Use this extension from host-side (JVM) tests. It's recommended to use it alongside
     * `InstantTaskExecutorRule` or a similar mechanism to execute tasks synchronously.
     */
    public static final <T extends java.lang.Object>T getOrAwaitValue(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$getOrAwaitValue, long time, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit timeUnit, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> afterObserve) {
        return null;
    }
    
    /**
     * Observes a [LiveData] until the `block` is done executing.
     */
    public static final <T extends java.lang.Object>void observeForTesting(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observeForTesting, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
}