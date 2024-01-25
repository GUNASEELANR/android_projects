package com.guna.sampleusecaseapplication.statelist

import com.guna.sampleusecaseapplication.remoteRepository.ApiHelper
import com.guna.sampleusecaseapplication.remoteRepository.responsemdel.SupportStateResponse
import retrofit2.Response
import javax.inject.Inject

class StateRemoteRepositoryImpl @Inject constructor(private val apiHelper: ApiHelper) :
    StateRemoteRepository {
    override suspend fun getStateList(): Response<SupportStateResponse> {
        return apiHelper.getEmployee()
    }
}