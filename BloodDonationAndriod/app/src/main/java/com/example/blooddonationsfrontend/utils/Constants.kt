package com.example.blooddonationsfrontend.utils

class Constants {
    companion object {

        const val baseUrl = "http://10.0.2.2:8080/api/v1/"
        const val authBase = "auth"
        const val signupEndpoint = "${authBase}/signup"
        const val signinEndpoint = "${authBase}/login"

        const val getDonationsEndpoint="donation/getAllRequests"
        const val donationRequestEndpoint = "donation/create"
        const val accountEndpoint = "/donation/{id}"
        const val updateEndpoints = "/donation/{id}/updateProfile"
        const val statusUpdateEndpoint="/donation/{id}/update-status" //added status endpoint
        const val filterEndpoint="/donation/filter" //added filter endpoint



        // Don't touch please this is used for the token name in the header
        const val authorization = "Authorization"


    }
}