package com.dogancankilic.kotlinbase.products;

import java.lang.System;

/**
 * Integration test with [MockWebServer]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0007J\b\u0010\u0013\u001a\u00020\u0011H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u00020\u00078G\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/dogancankilic/kotlinbase/products/ProductDetailApiTest;", "", "()V", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "instantExecutorRule", "Landroidx/arch/core/executor/testing/InstantTaskExecutorRule;", "getInstantExecutorRule", "()Landroidx/arch/core/executor/testing/InstantTaskExecutorRule;", "productsDataSourceImpl", "Lcom/dogancankilic/kotlinbase/data/products/ProductsDataSourceImpl;", "server", "Lokhttp3/mockwebserver/MockWebServer;", "service", "Lcom/dogancankilic/kotlinbase/data/products/ProductsService;", "setUp", "", "tearDown", "testApiSuccess", "app_debug"})
@org.junit.runner.RunWith(value = org.junit.runners.JUnit4.class)
public final class ProductDetailApiTest {
    @org.jetbrains.annotations.NotNull()
    private final androidx.arch.core.executor.testing.InstantTaskExecutorRule instantExecutorRule = null;
    private final okhttp3.mockwebserver.MockWebServer server = null;
    private com.dogancankilic.kotlinbase.data.products.ProductsDataSourceImpl productsDataSourceImpl;
    private com.dogancankilic.kotlinbase.data.products.ProductsService service;
    private final com.google.gson.Gson gson = null;
    
    public ProductDetailApiTest() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public final androidx.arch.core.executor.testing.InstantTaskExecutorRule getInstantExecutorRule() {
        return null;
    }
    
    @org.junit.Before()
    public final void setUp() {
    }
    
    @org.junit.Test()
    public final void testApiSuccess() {
    }
    
    @org.junit.After()
    public final void tearDown() {
    }
}