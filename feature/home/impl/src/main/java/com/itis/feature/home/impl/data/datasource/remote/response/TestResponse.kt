package com.itis.feature.home.impl.data.datasource.remote.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class TestResponse(
    @SerialName("name")
    val name: String?
)