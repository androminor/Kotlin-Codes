package com.androminor.kotlintutorials.kotlin_basics.conditions

fun main() {
    val trafficLightColor: Any = "Yellow"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Green" -> println("Go")
        "Yellow", "Amber" -> println("Slow")
        else -> println("Invalid traffic-light color")
    }
    useOfExpressionIf()
    useOfExpressionWhen()


}

private fun useOfExpressionIf() {

    //step 1
    /*val trafficLightColor = "Black"
    val message = if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else if (trafficLightColor == "Green"){
        println("Go")
    } else {
        println("Invalid traffic light color")
    }*/

    //step 2
    val trafficLightColor = "Black"
    val message = if (trafficLightColor == "Red") "Stop"
    else if (trafficLightColor == "Yellow") "Slow"
    else if (trafficLightColor == "Green") "Go"
    else "Invalid traffic-light color"
    println(message)
}

private fun useOfExpressionWhen() {
    val trafficLightColor: Any = "Brown"
    val message = when (trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid traffic light"
    }
    println(message)

}