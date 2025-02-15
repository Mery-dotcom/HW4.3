package com.geeks.hw43.models

class InstagramRepository {

    private val apiKey = "86787a1db4msh995d6247eb1cbaap13e6bdjsnfcbc54359542"
    private val host = "instagram-scraper-api2.p.rapidapi.com"

    suspend fun getCurrentUser(username: String): InstagramResponse {
        return RetrofitClient.retrofitService.getCurrentUser(apiKey, host, username)
    }
}