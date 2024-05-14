package org.example.section04.lecture06

fun main() {

    val pizzasOrdered = 9

    // Exemplo #1
    when (pizzasOrdered) {
        0 -> println("Not hungry")
        1, 2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> println("Are you sure?")
    }

    // Exemplo #2
    when (pizzasOrdered) {
        Math.abs(pizzasOrdered) -> println("Ordered 0 or more pizzas")
        else -> println("Ordered less than 0")
    }

    // Exemplo #3 usando range
    when (pizzasOrdered) {
        0 -> println("We need orders")
        in 1 .. 4 -> println("Got some orders")
        in 5 .. 9 -> println("Business is up")
        else -> println("Are you sure?")
    }

    // Exemplo #4, sem argumentos
    when {
        pizzasOrdered <= 0 -> println("None ordered")
        pizzasOrdered % 2 == 1 -> println("Odd number ordered")
        pizzasOrdered % 2 == 0 -> println("Even number ordered")
    }
}