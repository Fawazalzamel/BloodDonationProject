package com.example.blooddonationsfrontend.network

import com.example.blooddonationsfrontend.data.AccountPage
import com.example.blooddonationsfrontend.data.DonationRequest
import com.example.blooddonationsfrontend.data.SigninRequest
import com.example.blooddonationsfrontend.data.UpdateDonationRequest
import com.example.blooddonationsfrontend.data.model.User
import com.example.blooddonationsfrontend.data.response.TokenResponse
import com.example.blooddonationsfrontend.utils.Constants
import com.example.blooddonationsfrontend.utils.enums.BloodTypes
import com.example.blooddonationsfrontend.utils.enums.Status
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT

import retrofit2.http.Path
import retrofit2.http.Query


interface DonationApiServices {
    @POST(Constants.signupEndpoint)
    suspend fun signup(@Body user: User): Response<TokenResponse>

    @POST(Constants.signinEndpoint)
    suspend fun signin(@Body signinRequest: SigninRequest): Response<TokenResponse>
    @POST(Constants.donationRequestEndpoint)
    suspend fun donationRequest(@Body donationRequest: DonationRequest):Response<DonationRequest>

    @PUT(Constants.updateEndpoints)
    suspend fun updateAccount(
        @Header(Constants.authorization) token: String?,
        @Body accountPage: AccountPage
    ): Response<Unit>

//    @DELETE(Constants.deleteRequestEndpoint)
//    suspend fun deleteRequest(@Path("deleteId")deleteId:Int):Response<Unit>

    @GET(Constants.getDonationsEndpoint)
    suspend fun getDonations():List<DonationRequest>

    @GET(Constants.accountEndpoint)
    suspend fun getAccount(@Header(Constants.authorization) token: String?): Response<User>

    @GET(Constants.filterEndpoint)
    suspend fun filter(
        @Query("bloodType") bloodType:String?,
        @Query("donationType") donationType:String?,
        @Query("donationStatus") donationStatus:String?,

        ):ResponseBody

    @PATCH(Constants.statusUpdateEndpoint)
    suspend fun statusUpdate(
        @Header(Constants.authorization) token: String?,
        @Path("id") status: UpdateDonationRequest): Response<String>

}