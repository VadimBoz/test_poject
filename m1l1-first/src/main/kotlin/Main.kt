package ru.vadim.test_poject

fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "! JVM " + System.getProperty("java.version"))

    for (i in 1..5) {
        println("i = $i")
    }
}