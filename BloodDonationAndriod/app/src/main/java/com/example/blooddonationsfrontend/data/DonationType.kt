package com.example.blooddonationsfrontend.data

import com.example.blooddonationsfrontend.utils.enums.DonationTypes
import com.example.blooddonationsfrontend.utils.enums.ResearchPurposeDonation

data class DonationType(
    var id: String,
    var donationType: DonationTypes?,
    var researchPurposeDonation: ResearchPurposeDonation?
)
