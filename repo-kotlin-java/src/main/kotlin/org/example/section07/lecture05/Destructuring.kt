package org.example.section07.lecture05

fun main() {

    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(1000, 2000)
    val c3 = c1 + c2

    println(c3)

    val (xCoordinate, yCoordinate) = c3

    println("x = $xCoordinate, y = $yCoordinate")

    println("x = ${c3.component1()}, y = ${c3.component2()}")

    showComponents()

}

fun showComponents() {

    val myPoint = Point(500, 600, 700)

    val (myX, myY, myZ) = myPoint

    println("x = $myX, y = $myY, z = $myZ")
}