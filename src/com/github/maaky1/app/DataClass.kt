package com.github.maaky1.app

import com.github.maaky1.data.Product

fun main() {
    val product = Product("Indomie", 2_500, "Food")
    println(product)

    val product2 = product.copy(name = "Supermie", price = 3_500)
    println(product2)
}