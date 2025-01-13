package com.github.maaky1.data

interface Interaction {
    val name: String
    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

interface Go : Interaction {
    fun go() {
        println("Go ${this.name} !")
    }
}

interface MoveA {
    fun move() = println("Move A")
}

interface MoveB {
    fun move() = println("Move B")
}

// Hanya 1 class yang bisa di mix untuk inheritance
//open class Contoh

class Human(override val name: String) : Go, MoveA, MoveB {
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
        println("Move Human")
    }
}