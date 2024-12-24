package com.github.maaky1.app

import com.github.maaky1.data.User

fun main() {
    val user1 = User("Test", "Testing")

    user1.username = "tes"
    user1.password = "password"

    println(user1.username)
    println(user1.password)
}