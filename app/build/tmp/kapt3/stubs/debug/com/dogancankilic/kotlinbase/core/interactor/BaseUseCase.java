package com.dogancankilic.kotlinbase.core.interactor;

import java.lang.System;

/**
 * Every UseCase must inherit [BaseUseCase] or [BaseUseCaseWithoutParams]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u0002*\u0006\b\u0001\u0010\u0003 \u00002\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001a\u00028\u0001H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/dogancankilic/kotlinbase/core/interactor/BaseUseCase;", "Type", "", "Params", "()V", "execute", "Lkotlin/Result;", "params", "execute-gIAlu-s", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "run", "app_debug"})
public abstract class BaseUseCase<Type extends java.lang.Object, Params extends java.lang.Object> {
    
    public BaseUseCase() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object run(Params params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super Type> continuation);
}