package com.github.maaky1.data

class Note(title: String) {
    var title: String = title
        get() {
            println("Execute Getter Function")
            return field
        }
        set(value) {
            println("Execute Setter Function")
            if (value.isNotBlank()) {
                field = value
            } else {
                println("Invalid title")
            }
        }
}

class BigNote(val title: String) {
    val bigTitle: String
        get() = title.uppercase()
}