package com.github.maaky1.app

import com.github.maaky1.data.Address

fun main() {
    val address1 = Address("Jalan A", "Bandung")
    val address2 = Address("Jalan A", "Bandung", "Indonesia")
    println(address1.street)
    println(address2.street)
}