package com.github.maaky1.app

import com.github.maaky1.data.Person

fun main() {
    val data = Person()
    data.firstName = "Agus"
    data.lastName = "F"

    println("Hello ${data.firstName} ${data.lastName}")
}