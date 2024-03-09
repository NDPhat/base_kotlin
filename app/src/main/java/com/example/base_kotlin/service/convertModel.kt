package com.example.base_kotlin.service

import com.example.base_kotlin.mock.EnergyUsage
import com.example.base_kotlin.mock.JSONStore
import com.example.base_kotlin.mock.RecentChargeSession
import com.example.base_kotlin.mock.UpcomingEnergyBill
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json

// Parsing the JSON strings
val upcomingEnergyBill = Json.decodeFromString<UpcomingEnergyBill>(JSONStore.upcomingEnergyBill)
val energyUsage = Json.decodeFromString<EnergyUsage>(JSONStore.energyUsage)
val recentChargeSessions = Json.decodeFromString<List<RecentChargeSession>>(JSONStore.recentChargeSessions)