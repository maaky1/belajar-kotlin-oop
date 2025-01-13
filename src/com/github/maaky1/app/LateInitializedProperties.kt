package com.github.maaky1.app

import com.github.maaky1.data.Television

fun main() {
    val television = Television()
//    println(television.brand) // Error

    // Cara 1
    television.initTelevision("LG")
    println(television.brand) // Success

    // Cara 2
    television.brand = "Samsung"
    println(television.brand)
}