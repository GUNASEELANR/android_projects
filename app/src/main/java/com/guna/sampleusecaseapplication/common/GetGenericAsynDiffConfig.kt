package com.guna.sampleusecaseapplication.common

import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.DiffUtil

fun <T> getGenericDiffConfig():AsyncDifferConfig<BaseRecyclerViewItemState<T>> {
    return AsyncDifferConfig.Builder(object : DiffUtil.ItemCallback<BaseRecyclerViewItemState<T>>() {
        override fun areItemsTheSame(
            oldItem: BaseRecyclerViewItemState<T>,
            newItem: BaseRecyclerViewItemState<T>
        ): Boolean {
            return oldItem.viewType == newItem.viewType
        }

        override fun areContentsTheSame(
            oldItem: BaseRecyclerViewItemState<T>,
            newItem: BaseRecyclerViewItemState<T>
        ): Boolean {
            return oldItem == newItem
        }

    }).build()
}