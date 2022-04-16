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
import org.amshove.kluent.shouldNotBeEmpty
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Integration test with [MockWebServer]
 */
@RunWith(JUnit4::class)
@SuppressWarnings("LongMethod", "MaxLineLength")
class ProductsListApiTest {
    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()
    private val server = MockWebServer()
    private lateinit var productsDataSourceImpl: ProductsDataSourceImpl

    private lateinit var mockedResponse: String

    private val gson = GsonBuilder()
        .setLenient()
        .create()

    @Before
    fun setUp() {

        val okHttpClient = OkHttpClient
            .Builder()
            .build()

        val service = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(server.url("/"))
            .client(okHttpClient)
            .build().create(ProductsService::class.java)

        productsDataSourceImpl = ProductsDataSourceImpl(service)
    }

    @Test
    fun testApiSuccess() {
        // Given
        val content = "[\n" +
            "            {\n" +
            "                \"id\": 1,\n" +
            "                \"title\": \"Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops\",\n" +
            "                \"price\": 109.95,\n" +
            "                \"description\": \"Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday\",\n" +
            "                \"category\": \"men's clothing\",\n" +
            "                \"image\": \"https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg\",\n" +
            "                \"rating\": {\n" +
            "                \"rate\": 3.9,\n" +
            "                \"count\": 120\n" +
            "            }\n" +
            "            }\n" +
            "        ]"

        server.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(content)
        )
        // When
        val response = runBlocking { productsDataSourceImpl.products() }

        val expectedResponse =
            gson?.fromJson(content, Array<ProductsResponseModel>::class.java)
                ?.toList()

        // Then
        response.shouldNotBeEmpty()

        response shouldBeEqualTo expectedResponse

        response.size shouldBeEqualTo 1
    }

    @After
    fun tearDown() {
        server.shutdown()
    }
}
