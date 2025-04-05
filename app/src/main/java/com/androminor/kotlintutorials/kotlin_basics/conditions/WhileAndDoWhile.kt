package com.androminor.kotlintutorials.kotlin_basics.conditions

fun main() {
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
        println(bubbles)
    }
    println("$bubbles Bubbles in the water\n")
    do {
        bubbles--
        println(bubbles)
    } while (bubbles > 10)
    println("$bubbles Bubbles in the water\n")
    repeat(2) {
        println("A fish is swimming")
    }
}