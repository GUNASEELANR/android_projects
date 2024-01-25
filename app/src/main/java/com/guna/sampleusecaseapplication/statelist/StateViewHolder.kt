package com.guna.sampleusecaseapplication.statelist

import com.guna.sampleusecaseapplication.BR
import com.guna.sampleusecaseapplication.common.BaseRecyclerViewItemState
import com.guna.sampleusecaseapplication.common.BaseViewHolder
import com.guna.sampleusecaseapplication.databinding.StateListItemBinding

class StateViewHolder(private val binding: StateListItemBinding, viewModel: StateListViewModel): BaseViewHolder<BaseRecyclerViewItemState<StateListSectionType>>(binding) {
    init {
        binding.setVariable(BR.viewModel, viewModel)
    }


    override fun bindData(dataModel: BaseRecyclerViewItemState<StateListSectionType>) {
        binding.setVariable(BR.viewState, dataModel)
    }
}