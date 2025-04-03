package com.androminor.kotlintutorials.kotlin_basics.conditions

// if (condition) { body } else { body }

// = assignment operator

/*  class number {
        int number = 1;
        double num = 2
        float num = 2.0f
                }

*/
/*when main parameter ke against condition ko check karenge with the help of the body , else last main dena padega -exhaustive*/
fun main() {
    val number = 1
    1 == 1
    println(number)
    println(1 == 1)
    println(1 < 1)
    println("---------------")

    /*try other operators like: < , > , <= , >= , != */
    //one way to print When operation:
    println("Using When operation: ${whenCondition("Violet")}")
    println("---------------")

    println("Using If and else operation: ${ifAndElse(trafficLight = "Red")}")
    println("---------------")

    println("Using ifAndElseIf:${ifAndElseIf()}")
    println("---------------")



    println("Using complexWhen:${complexWhen()}")
    println("---------------")

    println("useOfCommaWhen:${useOfCommaWhen()}")
    println("---------------")

    println("Using inRangeWhen:${inRangeWhen(3)}")
    println("---------------")

    println("Using isInWhen:${isInWhen()}")

}

private fun ifAndElseIf(): String {
    val color = "Violet"

    return if (color == "Blue") {
        "Nice"
    } else if (color == "Violet") {
        "Not bad"
    } else {
        "I want it"
    }
}

private fun ifAndElse(trafficLight: String): String {
    // if and else
    return if (trafficLight == "Red") {
        "stop"
    } else {
        "go"
    }

}

private fun whenCondition(color: String): String {
    /* when ( parameter ) {
    *  condition -> body 1
    *  condition -> body 2
    *  condition -> body 3
    * } */
    //  val color = "Violet"

    return when (color) {
        "Blue" -> "Nice"
        "Violet" -> "Not bad"
        else -> "I want it"
    }

}

/*
private fun complexWhen() :String{
    val x = 3
   return when (x) {
        12 -> "x is a not a prime number between 1 and 10."
        15 -> "x is a not a prime number between 1 and 10."
        20 -> "x is not a prime number between 1 and 10."
        8 -> "x is not a prime number between 1 and 10."
        in 1..10 -> "x is a prime number between 1 to 10"
        else -> "x isn't a prime number between 1 to 10"
    }
}
*/
private fun complexWhen(): String {
    val x = 7
    return when (x) {
        12 -> "x is not a prime num between 1 to 10"
        15 -> "x is not a prime num between 1 to 10"
        20 -> "x is not a prime number between 1 to 10"
        is Int -> "x is an integer and is a prime between 1 to 10"
        in 1 until 6 -> "x is in range of 1 to 10"
        7, 8, 9 -> "x is a prime num"
        else -> "x is not a prime"
    }
}


private fun useOfCommaWhen(): String {
    val x = 5
    /* when(parameter) {
    * (condition1,condition2,condition3,condition4) -> body1
    * (condition5) -> body2 */
    return when (x) {
        2, 3, 5, 7 -> "x is a prime number between 1 and 10."
        //you can remove below
        /*   3 -> println("x is a prime number between 1 and 10.")
             5 -> println("x is a prime number between 1 and 10.")
             7 -> println("x is a prime number between 1 and 10.")*/
        else -> "x isn't a prime number between 1 and 10."

    }
}

private fun inRangeWhen(x: Int): String {
    return when (x) {
        /*when(parameter)
        * in range start..range end -> body1
        * condition ->body2*/

        /*When the value of the parameter is equal
        to any value in the range between start of the
        range and the end of the range,
        the first body executes.*/
        in 1..10 -> "x is a number between 1 and 10, but not a prime number."
        else -> "x isn't a prime number between 1 and 10."
    }
}

private fun isInWhen(): String {
    //You can use is keyword as a condition to check the data type of an evaluated value
    val x: Any = 3
    // to print is Int -> body
   // val y:Any = 20
    /*when(parameter) {
    * condition1,condition2 -> body1
    * in range start..range end -> body2
    * is type -> body3
    * }*/
    return when (x) {
        2, 3, 5, 7 -> "x is a prime odd number between 1 and 10"
        in 1..10 -> "x is a number between 1 and 10"
        is Int -> "x is an integer number, but not between 1 and 10."
        else -> "x isn't an integer number."
    }
}

