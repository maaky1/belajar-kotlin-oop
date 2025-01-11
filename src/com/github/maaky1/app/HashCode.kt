package com.github.maaky1.app

import com.github.maaky1.data.Company

fun main() {
    val company1 = Company("Agus")
    val company2 = Company("Agus")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
}