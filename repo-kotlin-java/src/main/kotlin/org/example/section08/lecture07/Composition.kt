package org.example.section08.lecture07

import org.funktionale.composition.compose
import org.funktionale.composition.forwardCompose

fun main() {

    val add5 = { i: Int -> i + 5 }
    val multiplyBy2 = { i: Int -> i * 2 }
    val multiplyBy2AndAdd5 = add5 compose multiplyBy2

    val composeResult = multiplyBy2AndAdd5(10)
    println("multiplyBy2AndAdd5(10) = $composeResult")

    val add5AndMultiplyBy2 = add5 forwardCompose multiplyBy2

    val forwardComposeResult = add5AndMultiplyBy2(10)
    println("add5AndMultiplyBy2(10) = $forwardComposeResult")
}