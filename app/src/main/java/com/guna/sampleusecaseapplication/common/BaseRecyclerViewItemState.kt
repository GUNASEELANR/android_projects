package com.guna.sampleusecaseapplication.common

interface BaseRecyclerViewItemState<T> {
    val viewType:T

    override fun equals(other: Any?):Boolean
    override fun hashCode():Int
}