package com.dogancankilic.kotlinbase.di

import com.dogancankilic.kotlinbase.BuildConfig
import com.dogancankilic.kotlinbase.core.Constants
import com.dogancankilic.kotlinbase.data.products.ProductsDataSource
import com.dogancankilic.kotlinbase.data.products.ProductsRemoteDataSource
import com.dogancankilic.kotlinbase.data.products.ProductsRepository
import com.dogancankilic.kotlinbase.data.products.ProductsService
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Qualifier
import javax.inject.Singleton

/**
 * Provide retrofit and services
 */
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun provideBaseUrl() = Constants.BASE_URL

    @Provides
    @Singleton
    fun provideOkHttpClient() = if (BuildConfig.DEBUG) {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    } else OkHttpClient
        .Builder()
        .build()

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, BASE_URL: String): Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .build()

    @Provides
    @Singleton
    fun provideProductApiService(retrofit: Retrofit): ProductsService =
        retrofit.create(ProductsService::class.java)
}

/**
 * Provide data source implementations for repositories
 */
@InstallIn(SingletonComponent::class)
@Module
abstract class DataSourceModule {

    @RemoteDataSource
    @Singleton
    @Binds
    abstract fun provideProductRemoteDataSource(productsRemoteDataSource: ProductsRemoteDataSource):
        ProductsDataSource
}

/**
 * Provide repositories for use case layer
 */
@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {

    @Repository
    @Singleton
    @Binds
    abstract fun provideProductRepository(productsRepository: ProductsRepository): ProductsDataSource
}

/**
 * Indicates Data Source is Remote Data Source
 */
@Qualifier
annotation class RemoteDataSource

/**
 * Indicates Data Source is Repository
 */
@Qualifier
annotation class Repository
