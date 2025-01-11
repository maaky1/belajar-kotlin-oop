package com.github.maaky1.app

import com.github.maaky1.data.Company

fun main() {
    val company1 = Company("Agus")
    val company2 = Company("Agus")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)
}