package org.example.section05.lecture04

fun main() {

    val myCar = Car()
    myCar.start()
    println("My car's manufacturer is ${myCar.automakerName}.")
    println("My car makes ${myCar.getKmPerLiter()} km per liter.")
    println("My car has ${myCar.getDoors()} doors.")
    myCar.stop()
}