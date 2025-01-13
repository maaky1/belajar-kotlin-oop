package com.github.maaky1.app

import com.github.maaky1.data.Student
import com.github.maaky1.data.gedeinLah
import com.github.maaky1.data.sayHello

fun main() {
    val student = Student("Agus", 20)
    student.sayHello("Budi")
    println(student.gedeinLah)
}