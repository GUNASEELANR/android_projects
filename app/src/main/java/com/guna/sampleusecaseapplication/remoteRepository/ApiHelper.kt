package com.guna.sampleusecaseapplication.remoteRepository

import com.guna.sampleusecaseapplication.remoteRepository.responsemdel.SupportStateResponse
import retrofit2.Response

interface ApiHelper {
    suspend fun getEmployee(): Response<SupportStateResponse>
}