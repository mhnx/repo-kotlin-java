package org.example.section05.lecture07

fun isPalindrome(word: String): Boolean {
    val reversed = word.reversed()
    return word == reversed
}