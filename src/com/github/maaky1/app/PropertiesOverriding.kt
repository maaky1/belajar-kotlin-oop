package com.github.maaky1.app

import com.github.maaky1.data.Rectangle
import com.github.maaky1.data.Shape
import com.github.maaky1.data.Triangle

fun main() {
    val shape1 = Shape()
    println(shape1.corner)

    val shape2 = Rectangle()
    println(shape2.corner)

    val shape3 = Triangle()
    println(shape3.corner)
}