package org.example.section08.lecture06

import org.funktionale.collections.destructured

fun main() {
    val (head, tail) = listOf(1, 2, 3).destructured()

    println("Head = $head and tail $tail")
}