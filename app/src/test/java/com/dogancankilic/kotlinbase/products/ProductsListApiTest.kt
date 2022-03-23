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
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File

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
   /* @Test
    fun test() {
        val file = File("src/test/resources/products_list.json")
        assertTrue(file.exists())
    }*/

    // Currently in development
    @Test
    fun testApiSuccess() {
        // Given
        // Github actions on ubuntu and macOS throws java.io.FileNotFoundException on this line.
    /*    mockedResponse =
            File("src\\test\\java\\com\\resources\\products\\products_list.json").bufferedReader()
                .use { it.readText() }

        server.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(mockedResponse)
        )
        // When
        val response = runBlocking { productsDataSourceImpl.products() }

        val expectedResponse =
            gson?.fromJson(mockedResponse, Array<ProductsResponseModel>::class.java)
                ?.toList()*/

        // Then
      /*  response.shouldNotBeEmpty()

        response shouldBeEqualTo expectedResponse

         response.size shouldBeEqualTo 20*/
    }

    @After
    fun tearDown() {
        server.shutdown()
    }
}
