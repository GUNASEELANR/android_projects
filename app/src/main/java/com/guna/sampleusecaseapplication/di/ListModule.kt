package com.guna.sampleusecaseapplication.di

import androidx.lifecycle.ViewModel
import com.guna.sampleusecaseapplication.statelist.StateListUseCase
import com.guna.sampleusecaseapplication.statelist.StateListUseCaseImpl
import com.guna.sampleusecaseapplication.statelist.StateListViewModel
import com.guna.sampleusecaseapplication.statelist.StateRemoteRepository
import com.guna.sampleusecaseapplication.statelist.StateRemoteRepositoryImpl
import com.guna.sampleusecaseapplication.common.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Provider

@Module(includes = [AppModule::class,NetworkModule::class])
abstract class ListModule {
    companion object {
        @Provides
        fun providesViewModelFactory(viewModels: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>):ViewModelFactory {
            return ViewModelFactory.create(viewModels)
        }
        @Provides
        @IntoMap
        @ViewModelKey(StateListViewModel::class)
        fun provideStateListViewModel(stateListUseCase: StateListUseCase) : ViewModel {
            return StateListViewModel(stateListUseCase)
        }


    }
    @Binds
    abstract fun bindStateRemoteRepository(stateRemoteRepositoryImpl: StateRemoteRepositoryImpl): StateRemoteRepository

    @Binds
    abstract fun bindStateUseCase(stateListUseCaseImpl: StateListUseCaseImpl) : StateListUseCase
}