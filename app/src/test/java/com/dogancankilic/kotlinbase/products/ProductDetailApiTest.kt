package com.dogancankilic.kotlinbase.products

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.dogancankilic.kotlinbase.data.products.ProductsDataSourceImpl
import com.dogancankilic.kotlinbase.data.products.ProductsService
import com.dogancankilic.kotlinbase.data.products.model.ProductsResponseModel
import com.google.gson.GsonBuilder
import kotlinx.coroutines.ExperimentalCoroutinesApi
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

/**
 * Integration test with [MockWebServer]
 */
@ExperimentalCoroutinesApi
@RunWith(JUnit4::class)
class ProductDetailApiTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()
    private val server = MockWebServer()
    private lateinit var productsDataSourceImpl: ProductsDataSourceImpl

    // private lateinit var mockedResponse: String

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

        // Github actions on ubuntu and macOS throws java.io.FileNotFoundException on this line.
        /*mockedResponse =
            File("src\\test\\java\\com\\resources\\products\\product_detail_response.json").bufferedReader()
                .use { it.readText() }*/

        val mockedResponse = "{\n" +
            "  \"id\": 1,\n" +
            "  \"title\": \"Fjallraven - Foldsack No. " +
            "1 Backpack, Fits 15 Laptops\",\n" +
            "  \"price\": 109.95,\n" +
            "  \"description\": \"Your perfect" +
            " pack for everyday use and walks in the" +
            " forest. Stash your laptop (up to 15 inches)" +
            " in the padded sleeve, your everyday\",\n" +
            "  \"category\": \"men's clothing\",\n" +
            "  \"image\": \"https://fakestoreapi.com/img/" +
            "81fPKd-2AYL._AC_SL1500_.jpg\",\n" +
            "  \"rating\": {\n" +
            "    \"rate\": 3.9,\n" +
            "    \"count\": 120\n" +
            "  }\n" +
            "}"

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
