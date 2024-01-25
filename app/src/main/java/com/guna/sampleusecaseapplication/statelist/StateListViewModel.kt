package com.guna.sampleusecaseapplication.statelist

import androidx.lifecycle.viewModelScope
import com.guna.sampleusecaseapplication.common.BaseRecyclerViewItemState
import com.guna.sampleusecaseapplication.common.viewmodel.TypeBaseViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject

class StateListViewModel @Inject constructor(private val stateListUseCase: StateListUseCase) : TypeBaseViewModel<StatesViewState, StateViewEvents> (){

    init {
        mutableViewState.value = StatesViewState(true, emptyList())
        viewModelScope.launch {
            val defer = stateListUseCase.getStateList()
            val data = defer.body()
            val sectionList = data?.data?.let {
                val list = mutableListOf<BaseRecyclerViewItemState<StateListSectionType>>()
                it.forEach {
                    list.add(StateItemState(it.primaryText, it.secondaryText))
                }
                list
            } ?: emptyList()
            mutableViewState.value = StatesViewState(false, sectionList)

        }

    }

}