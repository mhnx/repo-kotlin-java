package org.example.section06.lecture02

fun main() {

    val cat = Animal("Garfield", "cat", 12)
    println(cat.show())

    val dog = Animal("Odie", "dog", 9)
    println(dog.show())

    cat.weight = 18
    dog.weight = 13

    println(cat.show())
    println(dog.show())
}