package org.example.section07.lecture03

@Deprecated("Use the Animal class instead", ReplaceWith("Animal"))
class Person internal constructor(var firstName: String, var lastName: String) {

    init {
        println("Created a person named $firstName $lastName.")
    }

    constructor(firstName: String, lastName: String, middleName: String):
            this(firstName, lastName)
}