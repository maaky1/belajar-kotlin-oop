package com.github.maaky1.app

import com.github.maaky1.data.Minus
import com.github.maaky1.data.Modulo
import com.github.maaky1.data.Operation
import com.github.maaky1.data.Plus

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when(operation){
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}

fun main() {
    println(operation(10, 10, Plus()))
    println(operation(10, 5, Minus()))
    println(operation(10, 3, Modulo()))
}