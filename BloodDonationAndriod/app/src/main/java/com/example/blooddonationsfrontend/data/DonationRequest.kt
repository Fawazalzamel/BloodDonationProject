package com.example.blooddonationsfrontend.data

import com.example.blooddonationsfrontend.utils.enums.BloodTypes
import com.example.blooddonationsfrontend.utils.enums.DonationTypes
import com.example.blooddonationsfrontend.utils.enums.Status

data class DonationRequest(
    var id: String,
    var fileNumber: String,
    var bloodTypes: BloodTypes,
    var donationTypes: DonationTypes,
    var status: Status
)
