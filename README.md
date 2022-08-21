# Kotlin-Base-Architecture - Railway Oriented Programming with Kotlin
This repository consists of 3 layers(data-domain-ui) and practices railway oriented programming with Kotlin  [Result](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-result/ "Result").

### What is Railway Oriented Programming
Railway oriented programming ensures us to track happy and unhappy path with functional programming technique. In this repo every api call has a Result of Success or Failure path.

<h3>Testing </h3>

```kotlin
@ExperimentalCoroutinesApi
class ProductDetailViewModelTest {

    @get:Rule
    val coroutineTestRule = TestCoroutineRule()

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    private val productDetailUseCase = mockk<ProductDetailUseCase>()

    private lateinit var viewModel: ProductDetailViewModel

    @Before
    fun setUp() {
        viewModel = ProductDetailViewModel(productDetailUseCase)
    }

    @Test
    fun `success state testing case`() {
        coroutineTestRule.runBlockingTest {

            // Given
            val expectedResponse = mockk<ProductsUiModel>()
            coEvery { productDetailUseCase.execute(2) } returns Result.success(expectedResponse)

            // When
            viewModel.getProduct("2")
            val response = viewModel.product.value

            // Then
            coVerify(exactly = 1) { productDetailUseCase.execute(2) }
            response shouldBeEqualTo expectedResponse
        }
    }
}
```

### Note
In Kotlin 1.3 till 1.5 this Result could not be used directly as a return type of Kotlin functions. This restriction was lifted in Kotlin 1.5 according to [documentation](http://https://github.com/Kotlin/KEEP/blob/master/proposals/stdlib/result.md#limitations "documentation")

Resources :

 - If you would like to get more information about railway oriented programming in Kotlin please check out [this](http://https://naveenkumarmuguda.medium.com/railway-oriented-programming-a-powerful-functional-programming-pattern-ab454e467f31 "this") and [that](http://https://proandroiddev.com/railway-oriented-programming-in-kotlin-f1bceed399e5 "that") articles



