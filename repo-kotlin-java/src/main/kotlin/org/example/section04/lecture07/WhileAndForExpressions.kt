package org.example.section04.lecture07

fun main() {

    var x = 0

    // Exemplo de while
    while (x < 10) {
        println("x = $x")
        x += 3
    }

    // Exemplo de do-while
    do {
        println("x = $x")
        x -= 3
    } while (x > 0)

    // Exemplo do for
    for (item in 1 .. 10) {
        print("$item, ")
    }

    for (ch in "Exemplo") {
        println(ch)
    }
}