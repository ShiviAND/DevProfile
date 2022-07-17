package com.example.devprofile.api

import com.example.devprofile.model.Users
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/users")
    suspend fun getUsers(): Response<Users>
}