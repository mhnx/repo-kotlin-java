package org.example.section04.lecture12

fun fizzBuzz(n: Int): List<String> {
    val myList = mutableListOf<String>()

    for (item in 1..n) {
        if (item % 5 == 0 && item % 3 == 0) myList.add("FizzBuzz")
        else if (item % 5 == 0) myList.add("Buzz")
        else if (item % 3 == 0) myList.add("Fizz")
        else myList.add(item.toString())
    }

    return myList
}