package org.example.section05.lecture03

fun main() {
    val location = object {
        var xCoordinate = 200
        var yCoordinate = 300
    }

    println("x = ${location.xCoordinate}, y = ${location.yCoordinate}")

    val location2 = object {
        var xCoordinate = 450
        var yCoordinate = 550
        fun printIt() {
            println("Coordinates = ($xCoordinate, $yCoordinate)")
        }
    }

    location2.printIt()

    location2.xCoordinate = 3000
    location2.yCoordinate = 6000

    location2.printIt()

    // uso do object declarado fora da função main
    val temperature = MySingleton.getLastTemperature()
    println("Last temperature measured is $temperature degrees")
}

// Declaração de um objeto (object declaration)
object MySingleton {
    var temperatures = arrayOf(18, 22, 26)
    fun getLastTemperature() = temperatures.last()
}