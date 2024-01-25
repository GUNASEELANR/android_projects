package com.guna.sampleusecaseapplication.common.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class TypeBaseViewModel<VIEW_STATE : BaseViewState, VIEW_EVENTS: BaseViewEvents> : ViewModel() {
    protected val mutableViewState : MutableLiveData<VIEW_STATE> = MutableLiveData()
    protected val mutableViewEvents : MutableLiveData<VIEW_EVENTS> = MutableLiveData()

    val viewState: LiveData<VIEW_STATE> = mutableViewState
    val viewEvents: LiveData<VIEW_EVENTS> = mutableViewEvents
}