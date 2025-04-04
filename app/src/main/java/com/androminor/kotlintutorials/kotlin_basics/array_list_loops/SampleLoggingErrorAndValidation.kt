/**
 * Created by Varun Singh
 */
package com.androminor.kotlintutorials.kotlin_basics.array_list_loops

class SampleLoggingErrorAndValidation {
    fun processSchoolList(school: List<String>): List<String> {
        return school
    }

    fun processCollegeOneList(collegeOne: ArrayList<String>): ArrayList<String> {
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
        //return if (foo2.isEmpty()) 0 else foo2[2] // Adjust this condition to simulate an error scenario
        return foo2[3]
    }
}

class ArrayListsLoopsSample(private val listProcessor: SampleLoggingErrorAndValidation) {

    fun runArrayListAndLoops(): Int {
        println("Processing started...") // Logging start

        // Validation
        if (validateInput()) {
            println("Error: Input validation failed.")
            return -1
        }

        val result = problemsOnArrayListAndLoops()

        // Error Handling
        if (result < 0) {
            println("Error: Invalid result from problemsOnArrayListAndLoops.")
            return -1
        }

        println("Processing finished.") // Logging end
        return result
    }
    /* if you need to print both error message validation and error handling us below
    * explaination end of the file main hai
    *
    *     fun runArrayListAndLoops(): Int {
        println("Processing started...") // Logging start

        // Validation
        var validationFailed = false

        if (validateInput()) {
            println("Error: Input validation failed.")
            validationFailed = true
        }

        val result = problemsOnArrayListAndLoops()

        // Error Handling
        if (result < 0) {
            println("Error: Invalid result from problemsOnArrayListAndLoops.")
            validationFailed = true
        }
        if (validationFailed) {
            return -1
        }
        println("Processing finished.") // Logging end
        return result
    }
*/

    // Updated validateInput method to accept dynamic inputs
    private fun validateInput(
        school: List<String> = listOf("Cod", "Sardine", "Mackerel", "Tuna", "Salmon"),
        collegeOne: ArrayList<String> = arrayListOf(
            "Bedfordshire",
            "Cardiff",
            "Manchester",
            "Liverpool"
        ),
        collegeTwo: MutableList<String> = mutableListOf(
            "Bedfordshire",
            "Cardiff",
            "Manchester",
            "Liverpool",
            "London"
        ),
        schoolArray: Array<String> = arrayOf("shark", "whale", "dolphin")
    ): Boolean {

        if (school.isEmpty()) {
            println("Validation failed: 'school' list is empty.")
            return false
        }

        if (collegeOne.isEmpty()) {
            println("Validation failed: 'collegeOne' list is empty.")
            return false
        }

        if (collegeTwo.isEmpty()) {
            println("Validation failed: 'collegeTwo' list is empty.")
            return false
        }

        if (schoolArray.isEmpty()) {
            println("Validation failed: 'schoolArray' is empty.")
            return false
        }

        if (collegeOne.contains("Bedfordshire").not()) {
            println("Validation failed: 'collegeOne' does not contain 'Bedfordshire'.")
            return false
        }

        if (collegeTwo.size < 5) {
            println("Validation failed: 'collegeTwo' does not contain at least 5 elements.")
            return false
        }

        if (schoolArray.size != 3) {
            println("Validation failed: 'schoolArray' does not contain exactly 3 elements.")
            return false
        }
        if (school.isNotEmpty()) {
            return true
        }

        println("Validation passed.")
        return true
    }

    private fun problemsOnArrayListAndLoops(): Int { // PRIVATE implementation

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

        // Introduce an error condition to return a negative value
        if (result > 0) { // Example condition, adjust as needed
            return -1
        }

        return result
    }
}

fun main() {
    val listProcessor = SampleLoggingErrorAndValidation()
    val arrayListsLoops = ArrayListsLoopsSample(listProcessor)
    val result = arrayListsLoops.runArrayListAndLoops()
    println("Result from runArrayListAndLoops: $result")
}
//----------------------------------------------------------------------------------------------------------
/*Bilkul, main aapko is code ko Hindi aur English mix (Hinglish) mein samjhata
hoon jaise aap ek bacche ko samjha rahe ho.

Kotlin
fun runArrayListAndLoops(): Int {
    println("Processing started...") // Logging start
Pehle line mein hum bol rahe hain "Processing started..." matlab kaam shuru ho gaya hai.

Kotlin
    // Validation
    var validationFailed = false
Phir hum ek variable validationFailed set kar rahe hain false pe, jo batayega ki validation fail hui ya nahi.

Kotlin
    if (validateInput()) {
        println("Error: Input validation failed.")
        validationFailed = true
    }
Yahan pe hum check kar rahe hain ki validateInput() function sahi hai ya nahi.
Agar woh function galat hai to "Error: Input validation failed."
print kar rahe hain aur validationFailed ko true set kar rahe hain.

Kotlin
    val result = problemsOnArrayListAndLoops()
Phir hum problemsOnArrayListAndLoops() function ko call kar rahe hain aur uska result
 result variable mein store kar rahe hain.

Kotlin
    // Error Handling
    if (result < 0) {
        println("Error: Invalid result from problemsOnArrayListAndLoops.")
        validationFailed = true
    }
Yahan pe hum check kar rahe hain ki agar result ka value 0 se kam hai, toh
"Error: Invalid result from problemsOnArrayListAndLoops."
 print kar rahe hain aur validationFailed ko true set kar rahe hain.

Kotlin
    if (validationFailed) {
        return -1
    }
Agar validationFailed true hai, toh hum -1 return kar rahe hain, matlab kuch galat ho gaya hai.

Kotlin
    println("Processing finished.") // Logging end
    return result
}
Agar sab kuch sahi raha, toh "Processing finished." print kar rahe hain aur result return kar rahe hain.

Yeh function basically do cheezein check karta hai:

Pehle validation function ko check karta hai ki sahi hai ya nahi.
Phir problemsOnArrayListAndLoops function ko check karta hai ki sahi result de raha hai ya nahi.
Agar dono cheezein sahi nahi hoti toh -1 return karta hai aur error messages print karta hai.
Agar sab kuch sahi hota hai toh result return karta hai.
humne ye kyon kiya :        validationFailed = true
inside :    if (validateInput()) {
        println("Error: Input validation failed.")
        validationFailed = true
    }

Humne validationFailed = true isliye kiya hai taaki hum track kar sakein ki validation fail hui ya nahi.

Chaliye, isse step-by-step samjhate hain:

Validation Check:

Kotlin
if (validateInput()) {
    println("Error: Input validation failed.")
    validationFailed = true
}
Jab hum validateInput() function ko call karte hain, hum check kar rahe hain ki inputs valid hain ya nahi. Agar validation fail ho jaati hai (matlab validateInput() function false return karta hai), toh hum error message print karte hain: "Error: Input validation failed.".

Tracking Validation Failure:

Kotlin
validationFailed = true
Uske baad hum validationFailed variable ko true set karte hain. Iska matlab hai ki validation fail ho gayi hai.

Later Error Handling:

Kotlin
if (validationFailed) {
    return -1
}
Baad mein, hum check karte hain ki agar validationFailed true hai, toh hum -1 return karte hain. Yeh indicate karta hai ki kuch galat hua hai.

Is tarah se, validationFailed = true set karne ka fayda yeh hota hai ki hum easily track kar sakte hain aur handle kar sakte hain ki koi validation fail hui hai ya nahi. Agar validation fail ho gayi ho, toh hum proper error message print karke aur function ko -1 return karke indicate kar sakte hain.*/