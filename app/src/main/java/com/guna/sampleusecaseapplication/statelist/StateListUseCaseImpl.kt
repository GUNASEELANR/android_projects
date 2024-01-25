package com.guna.sampleusecaseapplication.statelist

import com.guna.sampleusecaseapplication.remoteRepository.responsemdel.SupportStateResponse
import retrofit2.Response
import javax.inject.Inject

class StateListUseCaseImpl @Inject constructor(private val stateRemoteRepository: StateRemoteRepository):
    StateListUseCase {
    override suspend fun getStateList(): Response<SupportStateResponse> {
        return stateRemoteRepository.getStateList()
    }
}