package com.dogancankilic.kotlin_base_architecture.di

import android.provider.SyncStateContract
import com.dogancankilic.kotlin_base_architecture.BuildConfig
import com.dogancankilic.kotlin_base_architecture.core.Constants
import com.dogancankilic.kotlin_base_architecture.data.products.ProductsDataSource
import com.dogancankilic.kotlin_base_architecture.data.products.ProductsRemoteDataSource
import com.dogancankilic.kotlin_base_architecture.data.products.ProductsRepository
import com.dogancankilic.kotlin_base_architecture.data.products.ProductsService
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
    fun provideApiService(retrofit: Retrofit): ProductsService = retrofit.create(ProductsService::class.java)

    @Singleton
    @Provides
    fun provideProductRepository(
        @RemoteDataSource remoteDataSource: ProductsDataSource
    ):
            ProductsRepository = ProductsRepository(remoteDataSource)



}
/**
 * Provide data source implementations for repositories
 */
@InstallIn(SingletonComponent::class)
@Module
@SuppressWarnings("UndocumentedPublicFunction", "TooManyFunctions")
abstract class DataSourceModule {
    @Repository
    @Singleton
    @Binds
    abstract fun provideProductRepository(productsRepository: ProductsRepository): ProductsDataSource

    @RemoteDataSource
    @Singleton
    @Binds
    abstract fun provideProductRemoteDataSource(productsRemoteDataSource: ProductsRemoteDataSource):
            ProductsDataSource

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
