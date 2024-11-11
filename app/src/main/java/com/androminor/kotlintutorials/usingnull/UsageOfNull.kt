package com.androminor.kotlintutorials

fun main() {
    val nameOfAnActor = null
    println(nameOfAnActor)

    var nameOfFilmstar = "Govinda"
    println(nameOfFilmstar)

    nameOfFilmstar = "Raj Kumar"
    println(nameOfFilmstar)

    println("showcase: ${showcaseNull()}")

    // var favoriteActor: String = "Sandra Oh"
    //you cant do below. null can not be a value of non-null type of String which is "Sandra Oh"
    //favoriteActor = null
    /* Nullable types are variables that can hold null.
       Non-null types are variables that can't hold null.
     */

    // if you want it make nullable , you should put ? after String: var favoriteActor:String? = "Sandra Oh"

    /*var name : type ? = value */
    var favoriteActor: String? = "Sandra Oh ".plus("Nicky")
    println(favoriteActor)
    favoriteActor = null
    println(favoriteActor)


}

private fun showcaseNull(): Int? {

    var n: Int? = 10
    println(n)
    n = null
    return n
}
