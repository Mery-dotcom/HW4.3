package com.geeks.hw43.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InstagramResponse(
    @SerialName("username")
    var username: Username? = null,
    @SerialName("current")
    var current: Current? = null
) {
    @Serializable
    data class Username(
        @SerialName("user")
        var user: String? = null,
        @SerialName("profile_pic_url")
        var profilePicUrl: String? = null,
        @SerialName("bio")
        var bio: String? = null
    )
@Serializable
    data class Current (
    @SerialName("country")
    var country: String? = null,
    @SerialName("region")
    var region: String? = null
    )
}
