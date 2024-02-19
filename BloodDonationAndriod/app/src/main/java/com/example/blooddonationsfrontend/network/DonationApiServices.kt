package com.example.blooddonationsfrontend.network

import com.example.blooddonationsfrontend.data.User
import com.example.blooddonationsfrontend.data.response.TokenResponse
import com.example.blooddonationsfrontend.utils.Constants
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface DonationApiServices {
    @POST(Constants.signupEndpoint)
    suspend fun signup(@Body user: User): Response<TokenResponse>

    @POST(Constants.signinEndpoint)
    suspend fun signin(@Body user: User): Response<TokenResponse>

    @GET(Constants.accountEndpoint)
    suspend fun getAccount(@Header(Constants.authorization) token: String?): Response<User>





}