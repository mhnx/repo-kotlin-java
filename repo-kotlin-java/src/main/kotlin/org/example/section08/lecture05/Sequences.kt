package org.example.section08.lecture05

fun main() {

    var students = getStudents()

    val sequenceOfStudents = students.drop(1).take(3).toList()

    println("Sequenced students: $sequenceOfStudents")

    /* Podemos gerar sequences em tempo real, definindo o início
     * e um lamba que vai pegar os próximos elmentos */
    val numbers = generateSequence(100) { it + 1 }

    println("Numbers: ${numbers.drop(5).take(20).toList()}")

    /*  Outro exemplo */
    val squares = generateSequence(1) { it + 1 }.map { it * it }
    val evenSquares = squares.filter { it % 2 == 0 }

    println("Even squares: ${evenSquares.take(5).toList()}")

    /* Outro exemplo com Fibonacci */
    val fibonacci = generateSequence(1 to 1) { it.second to it.first + it.second }.map { it.first }

    println("Fibonacci: ${fibonacci.take(15).toList()}")
}