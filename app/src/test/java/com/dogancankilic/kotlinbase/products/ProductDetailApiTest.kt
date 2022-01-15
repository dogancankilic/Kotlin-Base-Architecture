package com.dogancankilic.kotlinbase.products

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.dogancankilic.kotlinbase.data.products.ProductsDataSourceImpl
import com.dogancankilic.kotlinbase.data.products.ProductsService
import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel
import com.google.gson.GsonBuilder
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.amshove.kluent.shouldBeEqualTo
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File

@RunWith(JUnit4::class)
class ProductDetailApiTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()
    private val server = MockWebServer()
    private lateinit var productsDataSourceImpl: ProductsDataSourceImpl

    private lateinit var mockedResponse: String

    private lateinit var service: ProductsService

    private val gson = GsonBuilder()
        .setLenient()
        .create()

    @Before
    fun setUp() {
        val okHttpClient = OkHttpClient
            .Builder()
            .build()

        service = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(server.url("/"))
            .client(okHttpClient)
            .build().create(ProductsService::class.java)

        productsDataSourceImpl = ProductsDataSourceImpl(service)
    }

    @Test
    fun testApiSuccess() {
        // Given
        mockedResponse = File("src\\test\\java\\com\\resources\\products\\product_detail_response.json").bufferedReader().use { it.readText() }

        server.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(mockedResponse)
        )
        // When
        val response = runBlocking { productsDataSourceImpl.productDetail(1) }

        val expectedResponse = gson?.fromJson(mockedResponse, ProductsResponseModel::class.java)

        // Then
        response.id shouldBeEqualTo expectedResponse?.id

        response.title shouldBeEqualTo expectedResponse?.title
    }

    @After
    fun tearDown() {
        server.shutdown()
    }
}
