package org.example.section07.lecture07

data class Coordinates(var x: Int, var y: Int) {

    operator fun plus(other: Coordinates) : Coordinates {
        return Coordinates(x + other.x, y + other.y)
    }

    operator fun minus(other: Coordinates) : Coordinates {
        return Coordinates(x - other.x, y - other.y)
    }

}
