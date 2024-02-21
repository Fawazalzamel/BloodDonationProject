package com.example.blooddonationsfrontend.utils

class Constants {
    companion object {

        const val baseUrl = "http://10.0.2.2:8080/api/v1"
        const val signupEndpoint = "/signup"
        const val signinEndpoint = "/login"
        const val accountEndpoint = "/{id}"//needs checking
        const val authorization = "/auth"
        const val updateEndpoints = "/{id}/updateProfile"
        const val requestEndpoint = "/donation/create"
        const val getDonationsEndpoint="getAllRequests"
//        const val deleteRequestEndpoint="/{id}/delete"
        //create logout
    }
}