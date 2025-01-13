package com.github.maaky1.app

import com.github.maaky1.data.City
import com.github.maaky1.data.Country
import com.github.maaky1.data.Location

fun main() {
    val city = City("Bandung")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}