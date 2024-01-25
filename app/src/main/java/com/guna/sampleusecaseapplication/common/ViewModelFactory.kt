package com.guna.sampleusecaseapplication.common

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Provider


class ViewModelFactory private constructor(private val viewModels: Map<Class<out ViewModel>, Provider<ViewModel>>) :
    ViewModelProvider.Factory {

    companion object {
        fun create (viewModels: Map<Class<out ViewModel>, Provider<ViewModel>>) : ViewModelFactory {
            return ViewModelFactory(viewModels)
        }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModels[modelClass]?.get() as T
    }
}