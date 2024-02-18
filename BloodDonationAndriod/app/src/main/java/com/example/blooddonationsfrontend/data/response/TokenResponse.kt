package com.example.blooddonationsfrontend.data.response

data class TokenResponse(var token: String?) {
    fun getBearerToken(): String {
        return "Bearer $token"
    }
}

