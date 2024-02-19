package com.example.blooddonationsfrontend.data

import com.example.blooddonationsfrontend.utils.DonationTypes
import com.example.blooddonationsfrontend.utils.ResearchPurposeDonation

data class DonationType(
    var id: String,
    var donationType: DonationTypes,
    var researchPurposeDonation: ResearchPurposeDonation
)
