package org.example.section05.lecture04

interface Vehicle {

    val automakerName: String

    fun start() {
        println("Vroom")
    }

    fun stop() {
        println("Break noise")
    }

    fun getKmPerLiter(): Int {
        return 17
    }

    /* Como essa função não foi definida, ela deve ser implementada
     * Na classe que implementar essa interface */
    fun getDoors(): Int
}