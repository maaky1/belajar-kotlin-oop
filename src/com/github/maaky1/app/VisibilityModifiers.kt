package com.github.maaky1.app

import com.github.maaky1.data.SuperTeacher
import com.github.maaky1.data.Teacher

fun main() {
    val teacher = SuperTeacher("Sodia")
    println(teacher.name)
//    teacher.teach() // Error
    teacher.test()
}