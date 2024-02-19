package com.example.blooddonationsfrontend.data

import com.example.blooddonationsfrontend.utils.Status

data class RecordsOfBloodDonations(
    var id: String,
    var fileNumber: Long,
    var status: Status
)
