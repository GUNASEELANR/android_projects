package com.guna.sampleusecaseapplication.remoteRepository

import com.guna.sampleusecaseapplication.remoteRepository.responsemdel.SupportStateResponse
import retrofit2.Response
import javax.inject.Inject

class APIHelperImpl @Inject constructor(val apiService: ApiService) : ApiHelper {

    override suspend fun getEmployee(): Response<SupportStateResponse>  = apiService.getEmployees()
}