package com.example.models.pharmacies

import kotlinx.serialization.Serializable

@Serializable
data class Pharmacy(
    val id: String,
    val namePharmacy: String,
    val rangeDate: String,
    val location: String,
    val phone: String,
    val day: String,
    val month: String,
    val createdAt: Long
)
