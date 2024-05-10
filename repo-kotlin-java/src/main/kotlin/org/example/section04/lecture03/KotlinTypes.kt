package org.example.section04.lecture03

fun main() {

    val myPhrase = "I'm a String"
    val myPi = 3.14
    val myAnswer = 42

    // Quando a variável não é inicializada, é necessário declarar seu tipo
    val aString: String
    val aDouble: Double
    val aInt: Int

    val myDouble = 1.999
    val myFloat = 1.9F
    val myLong = 9977989623232L
    val myInt = 199
    val myShort: Short = 12 // Short precisa ser declarado
    val myByte: Byte = 127 // Byte precisa ser declarado

    val aLongNumber = 123_456_789
    val theSameNumber = 123456789L

    val anInt: Int = 7
    val aLong: Long = anInt.toLong() // No Kotlin precisa explicar a conversão

}