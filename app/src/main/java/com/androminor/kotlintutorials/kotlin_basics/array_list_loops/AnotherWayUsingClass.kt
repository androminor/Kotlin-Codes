package com.androminor.kotlintutorials.kotlin_basics.array_list_loops

class AnotherWayUsingClass {

    fun processSchoolList(school: List<String>): List<String> {
        return school
    }

    fun processCollegeOneList(collegeOne:ArrayList<String>): ArrayList<String> {
        collegeOne.add("London")
        return collegeOne
    }

    fun processCollegeTwoList(collegeTwo: MutableList<String>): MutableList<String> {
        collegeTwo.remove("Cardiff")
        collegeTwo.removeAt(2)
        return collegeTwo
    }

    fun processSchoolArray(schoolArray: Array<String>): String {
        return schoolArray.contentToString()
    }

    fun calculateFoo2(numbers: IntArray, numbers3: IntArray): Int {
        val foo2 = numbers3 + numbers
        return foo2[2]
    }
}


class ArrayListsLoopss(private val listProcessor: AnotherWayUsingClass) {
//2. Instead call by runArrayListAndLoops to make it enacpsulated,abstracted, controlled access, testable and following separation of concern

    fun runArrayListAndLoops(): Int {
        return problemsOnArrayListAndLoops()
    }

    // 1. if you try to directly call problemsOnArrayListAndLoops then make it public but not a good practice
    private fun problemsOnArrayListAndLoops(): Int {

        val school: List<String> = listOf("Cod", "Sardine", "Mackerel", "Tuna", "Salmon")
        println(listProcessor.processSchoolList(school))

        val collegeOne: ArrayList<String> =
            arrayListOf("Bedfordshire", "Cardiff", "Manchester", "Liverpool")
        println(listProcessor.processCollegeOneList(collegeOne))

        val collegeTwo: MutableList<String> =
            mutableListOf("Bedfordshire", "Cardiff", "Manchester", "Liverpool", "London")
        println(listProcessor.processCollegeTwoList(collegeTwo))

        val schoolArray: Array<String> = arrayOf("shark", "whale", "dolphin")
        println(listProcessor.processSchoolArray(schoolArray))

        val numbers = intArrayOf(1, 2, 3)
        val numbers3 = intArrayOf(4, 5, 6)
        val result = listProcessor.calculateFoo2(numbers, numbers3)
        println(result)

        return result
    }
}

fun main() {
    val listProcessor = AnotherWayUsingClass()
    val arrayListsLoops = ArrayListsLoopss(listProcessor)
    val result = arrayListsLoops.runArrayListAndLoops()
    println("Result from runArrayListAndLoops: $result") // Print the returned result
}