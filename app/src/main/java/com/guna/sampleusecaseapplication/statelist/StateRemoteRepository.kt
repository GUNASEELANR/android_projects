package com.guna.sampleusecaseapplication.statelist

import com.guna.sampleusecaseapplication.remoteRepository.responsemdel.SupportStateResponse
import retrofit2.Response

interface StateRemoteRepository {
    suspend fun getStateList():Response<SupportStateResponse>
}