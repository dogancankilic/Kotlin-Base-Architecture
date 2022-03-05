package com.dogancankilic.kotlinbase.core.interactor;

import java.lang.System;

/**
 * Every UseCase must inherit [BaseUseCase] or [BaseUseCaseWithoutParams]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u00028\u0000H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\t"}, d2 = {"Lcom/dogancankilic/kotlinbase/core/interactor/BaseUseCaseWithoutParams;", "Type", "", "()V", "execute", "Lkotlin/Result;", "execute-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "run", "app_debug"})
public abstract class BaseUseCaseWithoutParams<Type extends java.lang.Object> {
    
    public BaseUseCaseWithoutParams() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object run(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super Type> continuation);
}