package com.util;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J7\u0010\f\u001a\u00020\r2\'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f\u00a2\u0006\u0002\b\u0012\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/util/TestCoroutineRule;", "Lorg/junit/rules/TestRule;", "()V", "testCoroutineDispatcher", "Lkotlinx/coroutines/test/TestCoroutineDispatcher;", "testCoroutineScope", "Lkotlinx/coroutines/test/TestCoroutineScope;", "apply", "Lorg/junit/runners/model/Statement;", "base", "description", "Lorg/junit/runner/Description;", "runBlockingTest", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)V", "app_debug"})
public final class TestCoroutineRule implements org.junit.rules.TestRule {
    private final kotlinx.coroutines.test.TestCoroutineDispatcher testCoroutineDispatcher = null;
    private final kotlinx.coroutines.test.TestCoroutineScope testCoroutineScope = null;
    
    public TestCoroutineRule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.junit.runners.model.Statement apply(@org.jetbrains.annotations.NotNull()
    org.junit.runners.model.Statement base, @org.jetbrains.annotations.Nullable()
    org.junit.runner.Description description) {
        return null;
    }
    
    public final void runBlockingTest(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.test.TestCoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
    }
}