package com.dogancankilic.kotlinbase.core.platform;

import java.lang.System;

/**
 * Base ViewModel
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JM\u0010\u000b\u001a\u00020\f\"\b\b\u0000\u0010\r*\u00020\u000e\"\u0004\b\u0001\u0010\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u000f0\u00112\u0006\u0010\u0012\u001a\u0002H\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\f0\u0014H\u0004\u00a2\u0006\u0002\u0010\u0015J4\u0010\u000b\u001a\u00020\f\"\b\b\u0000\u0010\r*\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\r0\u00162\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\f0\u0014H\u0004J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0006H\u0004R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/dogancankilic/kotlinbase/core/platform/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_onNavigateState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dogancankilic/kotlinbase/core/platform/Event;", "Landroidx/navigation/NavDirections;", "onNavigateState", "Landroidx/lifecycle/LiveData;", "getOnNavigateState", "()Landroidx/lifecycle/LiveData;", "executeUseCase", "", "T", "", "P", "useCase", "Lcom/dogancankilic/kotlinbase/core/interactor/BaseUseCase;", "params", "onDataReady", "Lkotlin/Function1;", "(Lcom/dogancankilic/kotlinbase/core/interactor/BaseUseCase;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lcom/dogancankilic/kotlinbase/core/interactor/BaseUseCaseWithoutParams;", "handleHttpError", "throwable", "", "navigate", "directions", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.dogancankilic.kotlinbase.core.platform.Event<androidx.navigation.NavDirections>> _onNavigateState = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.dogancankilic.kotlinbase.core.platform.Event<androidx.navigation.NavDirections>> getOnNavigateState() {
        return null;
    }
    
    protected final void navigate(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDirections directions) {
    }
    
    protected final <T extends java.lang.Object, P extends java.lang.Object>void executeUseCase(@org.jetbrains.annotations.NotNull()
    com.dogancankilic.kotlinbase.core.interactor.BaseUseCase<? extends T, ? super P> useCase, P params, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onDataReady) {
    }
    
    protected final <T extends java.lang.Object>void executeUseCase(@org.jetbrains.annotations.NotNull()
    com.dogancankilic.kotlinbase.core.interactor.BaseUseCaseWithoutParams<? extends T> useCase, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onDataReady) {
    }
    
    protected void handleHttpError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
}