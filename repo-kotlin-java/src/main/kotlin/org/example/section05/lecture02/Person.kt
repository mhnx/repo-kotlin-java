package org.example.section05.lecture02

class Person internal constructor(firstName: String, lastName: String) {

    init {
        println("Created a person named $firstName $lastName.")
    }

    constructor(firstName: String, lastName: String, middleName: String):
            this(firstName, lastName)
}