package com.guna.sampleusecaseapplication.statelist

import com.guna.sampleusecaseapplication.common.BaseRecyclerViewItemState
import com.guna.sampleusecaseapplication.common.viewmodel.BaseViewState

data class StatesViewState(val isLoading: Boolean ,
    val sections:List<BaseRecyclerViewItemState<StateListSectionType>>
    ) : BaseViewState
