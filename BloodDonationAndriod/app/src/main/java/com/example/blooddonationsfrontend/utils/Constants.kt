package com.example.blooddonationsfrontend.utils

class Constants {
    companion object {

        const val baseUrl = "http://10.0.2.2:8080/api/v1/"
        const val authBase = "auth"
        const val signupEndpoint = "${authBase}/signup"
        const val signinEndpoint = "${authBase}/login"
        const val accountEndpoint = "{id}"//needs checking
        const val updateEndpoints = "{id}/updateProfile"
        const val requestEndpoint = "donation/create"
        const val getDonationsEndpoint="getAllRequests"
//        const val deleteRequestEndpoint="/{id}/delete"


        // Don't touch please this is used for the token name in the header
        const val authorization = "Authorization"

        //create logout

    }
}