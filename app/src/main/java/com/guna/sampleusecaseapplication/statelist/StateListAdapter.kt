package com.guna.sampleusecaseapplication.statelist

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.guna.sampleusecaseapplication.common.BaseRecyclerViewItemState
import com.guna.sampleusecaseapplication.common.BaseViewHolder
import com.guna.sampleusecaseapplication.common.getGenericDiffConfig

class StateListAdapter(private val viewModel: StateListViewModel) :ListAdapter<BaseRecyclerViewItemState<StateListSectionType>,BaseViewHolder<BaseRecyclerViewItemState<StateListSectionType>>>(
    getGenericDiffConfig()
) {

     val pool: RecyclerView.RecycledViewPool by lazy {   RecyclerView.RecycledViewPool()  }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<BaseRecyclerViewItemState<StateListSectionType>> {

        return StateListSectionType.values()[viewType].createViewHolder(parent, viewModel, viewPool = pool)
    }



    override fun onBindViewHolder(
        holder: BaseViewHolder<BaseRecyclerViewItemState<StateListSectionType>>,
        position: Int
    ) {
        holder.bindData(getItem(position))
    }

    override fun getItemViewType(position: Int): Int {
        return getItem(position).viewType.ordinal
    }
}