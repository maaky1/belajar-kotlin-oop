package com.github.maaky1.app

import com.github.maaky1.data.Action

fun fireAction(action: Action) {
    action.action()
}

class SampleAction : Action {
    override fun action() {
        println("This is sample action")
    }
}

fun main() {
    fireAction(object : Action {
        override fun action() = println("Action One")
    })

    fireAction(object : Action {
        override fun action() = println("Action Two")
    })
}