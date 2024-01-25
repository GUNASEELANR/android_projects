package com.guna.sampleusecaseapplication.remoteRepository

import com.guna.sampleusecaseapplication.remoteRepository.responsemdel.SupportStateResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("getlocations")
    suspend fun getEmployees(): Response<SupportStateResponse>
}