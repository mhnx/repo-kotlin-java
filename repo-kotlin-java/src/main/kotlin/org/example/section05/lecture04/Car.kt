package org.example.section05.lecture04

class Car : Vehicle {

    override val automakerName = "Honda"

    override fun getDoors(): Int {
        return 5
    }

    /* Para a função acima, poderíamos usar a inferência
    override fun getDoors() = 5
     */
}