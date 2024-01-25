package com.guna.sampleusecaseapplication.di

import com.guna.sampleusecaseapplication.statelist.StateListActivity
import dagger.Component
import dagger.Module

@Component(modules = [AppModule::class,NetworkModule::class, ListModule::class])
@PerActivity
interface AppComponent {
    fun inject(stateListActivity: StateListActivity)
}