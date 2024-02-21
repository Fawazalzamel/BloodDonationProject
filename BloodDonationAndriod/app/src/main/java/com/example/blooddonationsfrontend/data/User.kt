package com.example.blooddonationsfrontend.data

import com.example.blooddonationsfrontend.utils.enums.BloodTypes
import com.example.blooddonationsfrontend.utils.enums.Gender

data class User(
    var username: String,
    var password: String,
    var fullName: String,
    var email: String,
    var phoneNumber: String,
    var bloodType: BloodTypes,
    var civilId: String,
    var age: Int,
    var gender: Gender,
    var id: Long?,
)
