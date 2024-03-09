package com.example.base_kotlin.mock


object JSONStore {
    val upcomingEnergyBill = """
        {
            "startFrom": "2024-03-01",
            "dueDate": "2024-03-15",
            "balanceBroughtForward": 100,
            "newCharges": 50,
            "totalBillCost": 150,
            "totalOutstandingBalance": 150
        }
    """

    val energyUsage = """
        {
            "address": "123 Main St",
            "from": "2024-03-01",
            "to": "2024-03-07",
            "usageHistories": [
                {
                    "date": "2024-03-01",
                    "cost": 10.5,
                    "consumption": 20.0
                },
                {
                    "date": "2024-03-02",
                    "cost": 12.2,
                    "consumption": 22.5
                }
            ],
            "approxTotalCost": 50.0,
            "approxTotalElectricity": 100.0,
            "currentTotalCost": 25.0,
            "currentTotalElectricity": 50.0
        }
    """

    val recentChargeSessions = """
        [
            {
                "address": "456 Elm St",
                "chargedAt": "2024-03-05T13:30:00",
                "chargedDuration": 120,
                "chargedElectricity": 80,
                "cost": 15.5,
                "tax": 1.5,
                "start": "2024-03-05T11:30:00",
                "end": "2024-03-05T13:30:00",
                "taxInvoice": "INV-001",
                "totalCost": 17.0,
                "paymentInfo": {
                    "address": "456 Elm St",
                    "isConnected": true,
                    "cardNumber": "**** **** **** 1234",
                    "bankName": "Example Bank",
                    "cardName": "John Doe"
                }
            }
        ]
    """
}