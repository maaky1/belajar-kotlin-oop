package com.github.maaky1.app

import com.github.maaky1.data.ExecutiveCustomer
import com.github.maaky1.data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Agus")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Agus", 1000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}