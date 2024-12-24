package com.github.maaky1.app

import com.github.maaky1.data.Person

fun main() {
    val org = Person()
    org.firstName = "M"
    org.middleName = "Agus"
    org.lastName = "F"

    org.sayHello("Tes")
    org.run()
    println(org.getFullName())
}