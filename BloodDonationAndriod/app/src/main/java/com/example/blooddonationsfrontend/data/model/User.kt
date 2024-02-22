package com.example.blooddonationsfrontend.data.model

data class User(
    var username: String,
    var password: String,
    var fullName: String?,
    var email: String?,
    var phoneNumber: String?,
    var bloodType: String,
    var civilId: String?,
    var age: Int?,
    var gender: String,
    var id: Long?,
)
