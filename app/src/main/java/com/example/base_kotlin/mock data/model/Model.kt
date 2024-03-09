package com.example.base_kotlin.mock




@Serializable
data class PaymentInfo(
    val address: String,
    val isConnected: Boolean,
    val cardNumber: String,
    val bankName: String,
    val cardName: String
)

@Serializable
data class UpcomingEnergyBill(
    val startFrom: String,
    val dueDate: String,
    val balanceBroughtForward: Int,
    val newCharges: Int,
    val totalBillCost: Int,
    val totalOutstandingBalance: Int
)

@Serializable
data class EnergyUsage(
    val address: String,
    val from: String,
    val to: String,
    val usageHistories: List<UsageHistory>,
    val approxTotalCost: Double,
    val approxTotalElectricity: Double,
    val currentTotalCost: Double,
    val currentTotalElectricity: Double
)

@Serializable
data class UsageHistory(
    val date: String,
    val cost: Double,
    val consumption: Double
)


@Serializable
data class RecentChargeSession(
    val address: String,
    val chargedAt: String,
    val chargedDuration: Int,
    val chargedElectricity: Int,
    val cost: Double,
    val tax: Double,
    val start: String,
    val end: String,
    val taxInvoice: String,
    val totalCost: Double,
    val paymentInfo: PaymentInfo
)