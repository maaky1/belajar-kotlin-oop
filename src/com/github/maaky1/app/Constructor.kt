package com.github.maaky1.app

import com.github.maaky1.data.Car

fun main() {
    val wuling = Car("Wuling")
    wuling.year = 2023
    val bmw = Car("BMW", 2005)

    println(wuling.brand)
    println(wuling.year)
    println(bmw.brand)
    println(bmw.year)
}