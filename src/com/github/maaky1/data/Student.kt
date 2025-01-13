package com.github.maaky1.data

class Student(val name: String, val age: Int)

fun Student?.sayHello(name: String) {
    if (this != null) {
        println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
    }
}

val Student.gedeinLah: String
    get() = this.name.uppercase()