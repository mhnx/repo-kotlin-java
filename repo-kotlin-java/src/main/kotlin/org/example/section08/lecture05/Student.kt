package org.example.section08.lecture05

data class Student(val name: String, var age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Ada", 144),
        Student("Margaret", 23),
        Student("Grace", 53),
        Student("Joan", 42)
    )
}
