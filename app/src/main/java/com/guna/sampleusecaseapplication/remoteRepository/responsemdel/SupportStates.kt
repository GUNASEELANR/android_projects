package com.guna.sampleusecaseapplication.remoteRepository.responsemdel

import com.google.gson.annotations.SerializedName

data class SupportStates(
    @SerializedName("primaryText"   ) var primaryText   : String? = null,
    @SerializedName("secondaryText" ) var secondaryText : String? = null,
    @SerializedName("icon"          ) var icon          : String? = null

)
