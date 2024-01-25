package com.guna.sampleusecaseapplication.statelist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.guna.sampleusecaseapplication.common.BaseRecyclerViewItemState
import com.guna.sampleusecaseapplication.common.BaseViewHolder
import com.guna.sampleusecaseapplication.databinding.StateListItemBinding

enum class StateListSectionType {

    ITEM_OBJ {
        override fun createViewHolder(
            parent: ViewGroup,
            viewModel: StateListViewModel,
            viewPool: RecycledViewPool
        ): BaseViewHolder<BaseRecyclerViewItemState<StateListSectionType>> {
            val binding = StateListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return StateViewHolder(binding, viewModel)
        }

    };

    abstract fun createViewHolder(parent: ViewGroup, viewModel: StateListViewModel, viewPool: RecycledViewPool):BaseViewHolder<BaseRecyclerViewItemState<StateListSectionType>>

}