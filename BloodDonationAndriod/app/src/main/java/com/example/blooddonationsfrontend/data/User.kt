package com.example.blooddonationsfrontend.data

import com.example.blooddonationsfrontend.utils.BloodTypes
import com.example.blooddonationsfrontend.utils.Gender
import com.example.blooddonationsfrontend.utils.Urgency

data class User(
    var username: String,
    var password: String,
    var fullName: String?,
    var email: String?,
    var phoneNumber: Long?,
    var bloodType:BloodTypes?,
    var civilId: String?,
    var age: Int?,
    var gender: Gender?,
    var id: Long?,
    var urgency: Urgency?
)
