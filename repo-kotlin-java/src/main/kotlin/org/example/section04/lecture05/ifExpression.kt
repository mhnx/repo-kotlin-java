package org.example.section04.lecture05

fun main() {

    val myInt = 199
    val anInt: Int = 7

    // Em Java seria algo assim:
    // int lowest = (myInt < anInt) ? myInt : anInt;

    // Em Kotlin
    val lowest = if (myInt < anInt) myInt else anInt
    // Quando usar o if dessa forma, como uma expressão
    // lembre que é necessário ter a cláusula else com um valor

    val temperature = 26
    val isAirConditionerOn = if (temperature >= 26) {
        println("It's warm")
        true
    } else {
        println("It's not so warm")
        false
    }

    println("Is the air conditioner on: $isAirConditionerOn")

}