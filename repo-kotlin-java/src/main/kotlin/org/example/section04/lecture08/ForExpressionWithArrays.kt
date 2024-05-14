package org.example.section04.lecture08

fun main() {

    var index = 0

    // Exemplo #1 de for
    for (item in 10.rangeTo(20).step(2)) {
        println("${++index}) $item, ")
    }

    println()

    // Exemplo #2 de for, com índice do for
    for ((ind, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("${ind + 1}) $item, ")
    }

    println()

    // Exemplo de iteração em array, usando a propriedade indices
    val  myArray = arrayOf(10, 20, 30, 40, 50)

    for (item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }

}