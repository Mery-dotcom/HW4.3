package com.geeks.hw43.models

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface InstagramApi {

    @GET("search")
    suspend fun getCurrentUser(
        @Header("x-rapidapi-key") rapidapiKey: String,
        @Header("x-rapidapi-host") rapidapiHost: String,
        @Query("search_query") searchQuery: String
    ) : InstagramResponse
}