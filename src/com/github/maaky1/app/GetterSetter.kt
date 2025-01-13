package com.github.maaky1.app

import com.github.maaky1.data.BigNote
import com.github.maaky1.data.Note

fun main() {
    val note = Note("Belajar Kotlin")
    println(note.title)

    note.title = ""
    println(note.title)

    val bigNote = BigNote("Belajar kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)
}