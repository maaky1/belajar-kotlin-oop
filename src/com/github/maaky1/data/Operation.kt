package com.github.maaky1.data

sealed class Operation(val name: String)

class Plus : Operation("Add")

class Minus : Operation("Minus")

class Modulo : Operation("Modulo")