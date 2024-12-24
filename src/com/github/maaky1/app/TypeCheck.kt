package com.github.maaky1.app

import com.github.maaky1.data.HandPhone
import com.github.maaky1.data.Laptop

fun printObject(any: Any) {
    if (any is Laptop) {
        println("Laptop with name ${any.name}")
    } else if (any is HandPhone) {
        println("HandPhone with name ${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is HandPhone -> println("HandPhone with name ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any) {
    val value = any as String
    println(value)
}

fun printStringSafe(any: Any) {
    val value: String? = any as? String
    println(value)
}

fun main() {
    printObjectWithWhen("Test")
    printObjectWithWhen(1)
    printObjectWithWhen(true)
    printObjectWithWhen(Laptop("MSI"))
    printObjectWithWhen(HandPhone("Infinix"))

    printString("Testing")
//    printString(1) Error

    printStringSafe("Testing")
    printStringSafe(1) // null
}