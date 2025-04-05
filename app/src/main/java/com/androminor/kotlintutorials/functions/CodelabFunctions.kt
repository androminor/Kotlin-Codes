package com.androminor.kotlintutorials.functions


fun main() {
    val isUnit = println("This is an expression")
    println(isUnit)
    val temp = 10
    val isHot = if (temp > 50) true else false
    println(isHot)
    feedFish()
}

fun feedFish() {
    val day = randomFish()
    val food = fishFood(day)
    println("Today is $day and fish eat $food")
    val foodNew = fishFoodNew(day)
    println("Newday is $day and fish eat $foodNew")
    val foodNewest = fishFoodNewest(day)
    println("Newest day is $day and fish eat $foodNewest")

}

fun randomFish(): String {

    val week = arrayOf(
        "Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"
    )
    val weekList = listOf(
        "Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"
    )
    //return week[Random.nextInt(week.size)]
    return weekList.random()

}
/* when automatically breaks at the end of each branch.
It also makes sure your code covers all
the branches if you are checking an enum.*/

fun fishFood(day: String): String {
    var food = ""
    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}
/*Having a default branch ensures that food gets a value before being returned,
so it doesn't need to be initialized anymore.
Because the code now assigns a string to food only once,
you can declare food with val instead of var.*/

fun fishFoodNew(day: String): String {
    val food: String = when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "Nothing"
    }
    return food
}

fun fishFoodNewest(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "Nothing"
    }
}

