package com.dogancankilic.kotlinbase.core.platform

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavDirections
import com.dogancankilic.kotlinbase.core.interactor.BaseUseCase
import com.dogancankilic.kotlinbase.core.interactor.BaseUseCaseWithoutParams
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.supervisorScope
import retrofit2.HttpException

/**
 * Base ViewModel
 */
abstract class BaseViewModel : ViewModel() {

    private val _onNavigateState = MutableLiveData<Event<NavDirections>>()

    val onNavigateState: LiveData<Event<NavDirections>>
        get() = _onNavigateState

    protected fun navigate(directions: NavDirections) {
        _onNavigateState.value = Event(directions)
    }

    protected fun <T : Any, P> executeUseCase(
        useCase: BaseUseCase<T, P>,
        params: P,
        onDataReady: (T) -> (Unit)
    ) {
        viewModelScope.launch {
            supervisorScope {
                val backgroundJob = async { useCase.execute(params) }
                val result = (backgroundJob.await())

                result
                    .onSuccess(onDataReady)
                    .onFailure { handleHttpError(it) }
            }
        }
    }

    protected fun <T : Any> executeUseCase(
        useCase: BaseUseCaseWithoutParams<T>,
        onDataReady: (T) -> (Unit)
    ) {
        viewModelScope.launch {
            supervisorScope {
                val backgroundJob = async { useCase.execute() }
                val result = (backgroundJob.await())

                result
                    .onSuccess(onDataReady)
                    .onFailure { handleHttpError(it) }
            }
        }
    }

    protected open fun handleHttpError(throwable: Throwable) {
        if (throwable is HttpException) {
            println(throwable.code())
            println(throwable.message())
        } else {
            println(throwable.cause)
            println(throwable.message)
            println(throwable.localizedMessage)
        }
    }
}
