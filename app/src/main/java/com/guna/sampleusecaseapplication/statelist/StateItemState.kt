package com.guna.sampleusecaseapplication.statelist

import com.guna.sampleusecaseapplication.common.BaseRecyclerViewItemState

data class StateItemState(val stateValue: String?, val capital: String?) :
    BaseRecyclerViewItemState<StateListSectionType> {
    override val viewType: StateListSectionType = StateListSectionType.ITEM_OBJ
}
