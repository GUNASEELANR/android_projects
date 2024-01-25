package com.guna.sampleusecaseapplication.remoteRepository.responsemdel

import com.google.gson.annotations.SerializedName

data class SupportStateResponse(
    @SerializedName("supportLocation")
    val data: List<SupportStates>?=null,
                                val status: String?="")
