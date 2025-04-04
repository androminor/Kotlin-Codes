package com.androminor.kotlintutorials.kotlin_basics.array_list_loops
/**
 * Created by Varun Singh
 */
class ArrayListsLoopsClass {
    fun runArrayListAndLoops() {
        problemsOnArrayListAndLoops()
        println(usingListOfString())
        println(usingArayList())

    }
}

private fun problemsOnArrayListAndLoops() {


    val collegeOne: ArrayList<String> =
        arrayListOf("Bedfordshire", "Cardiff", "Manchester", "Liverpool")
    collegeOne.add("London")
    println(collegeOne)

    val collegeTwo: MutableList<String> =
        mutableListOf("Bedfordshire", "Cardiff", "Manchester", "Liverpool", "London")
    collegeTwo.remove("Cardiff")
    println(collegeTwo)
    collegeTwo.removeAt(2)
    println(collegeTwo)

    /*    ❌ Directly println(schoolArray) likhne se array ka memory reference print hota hai.
        ✅ Properly print karne ke liye .contentToString() ya joinToString()  ya java.util.Arrays.toString(schoolArray) use karo.
        ✅ Loop se bhi har element alag-alag print ho sakta hai.*/
    val schoolArray: Array<String> = arrayOf("shark", "whale", "dolphin")
    println(schoolArray.contentToString())

    val numbers = intArrayOf(1, 2, 3)
    val numbers3 = intArrayOf(4, 5, 6)
    val foo2 = numbers3 + numbers // means -> (4,5,6,1,2,3)
    println(foo2[2])

}

private fun usingListOfString(): List<String> {
    return listOf("Cod", "Sardine", "Mackerel", "Tuna", "Salmon")
}
private fun usingArayList():ArrayList<String>{
    val college = arrayListOf("Cod", "Sardine", "Mackerel", "Tuna", "Salmon")
    college.add("Seal")
    return college
}

fun main() {
    val arrayListsLoops = ArrayListsLoopsClass()
    arrayListsLoops.runArrayListAndLoops()

}