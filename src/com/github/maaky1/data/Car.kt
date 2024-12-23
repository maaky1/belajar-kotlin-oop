package com.github.maaky1.data

class Car(paramBrand: String, paramYear: Int = 2000) {

    init {
        println("Car $paramBrand dibuat")
    }

    var brand: String = paramBrand
    var year: Int = paramYear
}