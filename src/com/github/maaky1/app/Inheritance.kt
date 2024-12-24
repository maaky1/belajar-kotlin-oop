package com.github.maaky1.app

import com.github.maaky1.data.Manager
import com.github.maaky1.data.VicePresident

fun main() {
    val manager = Manager("Budi")
    manager.sayHello("F")

    val vice = VicePresident("Ok")
    vice.sayHello("Tes")
}