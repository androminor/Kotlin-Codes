package com.androminor.kotlintutorials.conditions

/* Learning of conditions and loops
*  a) How to write boolean expressions and learning comparison operators.
*  b) How to write if/else statements.
*  c) How to write when statements.
*  d) How to write when expressions.
*  e) How to use commas to define common behaviour multiple branches in when
*  conditionals
*  f) How to use in keyword
*  g) How to use is keyword*/

// if (condition) { body } else { body }

// = assignment operator

/*  class number {
        int number = 1;
        double num = 2
        float num = 2.0f
                }
*
* */

fun main() {
    val number = 1
    1 == 1
    println(number)
    println(1 == 1)
    println(1 < 1)
    println("---------------")

    /*try other operators like: < , > , <= , >= , != */
    //one way to print When operation:
    println("Using When operation: ${When("Violet")}")
    println("---------------")

    println("Using If and else operation: ${ifAndElse(trafficLight = "Red")}")
    println("---------------")

    ifAndElseIf()
    println("---------------")



    complexWhen()
    println("---------------")

    useOfCommaWhen()
    println("---------------")

    inRangeWhen(3)
    println("---------------")

    isInWhen()

}

private fun ifAndElseIf() {
    //nested else if conditions
    val color = "Violet"
    /*
        if (parameter == condition) { body } else { body }
        or if(condition) { body }
    */

    if (color == "Blue") {
        println("Nice")
    } else if (color == "Violet") {
        println("Not bad")
    } else {
        print("I want it")
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

private fun When(color: String): String? {
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

private fun complexWhen() {
    val x = 3
    when (x) {
        2 -> println("x is a prime number between 1 and 10.")
        3 -> println("x is a prime number between 1 and 10.")
        5 -> println("x is a prime number between 1 and 10.")
        7 -> println("x is a prime number between 1 and 10.")
        else -> println("x isn't a prime number between 1 to 10")
    }
}

private fun useOfCommaWhen() {
    val x = 5
    /* when(parameter) {
    * (condition1,condition2,condition3,condition4) -> body1
    * (condition5) -> body2 */
    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        //you can remove below
        /*   3 -> println("x is a prime number between 1 and 10.")
             5 -> println("x is a prime number between 1 and 10.")
             7 -> println("x is a prime number between 1 and 10.")*/
        else -> println("x isn't a prime number between 1 and 10.")

    }
}

private fun inRangeWhen(x: Int) {
    when (x) {
        /*when(parameter)
        * in range start..range end -> body1
        * condition ->body2*/

        /*When the value of the parameter is equal
        to any value in the range between start of the
        range and the end of the range,
        the first body executes.*/
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
}

private fun isInWhen() {
    //You can use is keyword as a condition to check the data type of an evaluated value
    val x: Any = 3
    // to print is Int -> body
    //val y:Any = 20
    /*when(parameter) {
    * condition1,condition2 -> body1
    * in range start..range end -> body2
    * is type -> body3
    * }*/
    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't an integer number.")
    }
}

