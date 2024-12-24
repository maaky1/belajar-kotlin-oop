package com.github.maaky1.app

import com.github.maaky1.data.SmartPhone

fun main() {
    val smartPhone = SmartPhone("Samsung S24", "Android")
    println(smartPhone.toString())
    println(smartPhone.hashCode())
}