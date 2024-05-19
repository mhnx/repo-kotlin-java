package org.example.section04.lecture09

fun main() {
    println("10 + 20 = ${myMathFunction(10, 20)}")
    println("55 + 45 = ${myExpressionBodyFunction(55, 45)}")
    println("7 + 7 = ${myFunctionWithDefaultValues(7, 7)}")

    // Chamada passando apenas o argumento message, named argument
    println("Chamada com valores default = ${myFunctionWithDefaultValues(message = "Hello World")}")
}

fun myMathFunction(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun myExpressionBodyFunction(n1: Int, n2: Int): Int = n1 + n2

fun myFunctionWithDefaultValues(n1: Int = 1, n2: Int = 5, message: String = "Hi"): Int {
    val result = n1 + n2
    println(message)

    return result
}