package com.androminor.kotlintutorials.kotlin_basics.array_list_loops

/**
 * Created by Varun Singh
 * These are some random methods i created however you can ignore them
 * and follow methods from -
 * https://developer.android.com/codelabs/kotlin-bootcamp-basics#0
 */
class ArrayListsLoopsClass {
    fun runArrayListAndLoops() {
        //problemsOnArrayListAndLoops()
        println(usingListOfString())
        println(usingArayList())
        println(usingArray().contentToString())
        println(usingMutableList())
        println(usingIntArray())
        println(usingIntArrayWithList())
        println(usingSimpleArrayMulti().joinToString())
        println(usingSimpleArrayMutliEven().contentToString())
        println(usingLoops())
        println(usingIndexElementsLoops())

        for (i in 1 until 5) {
            println(i)
        }
        for (i in 5 downTo 1) {
            println(i)
        }
        /*✅ Full Flow:
Start with 3
Next: 3 + 2 = 5
Next: 5 + 2 = 7 ❌ but 7 > 6 so loop ends
*/
        for (i in 3..6 step 3) {
            print(i)
        }
        for (i in 'd'..'g') {
            print(i)
        }
    }
}

/*private fun problemsOnArrayListAndLoops() {


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

    *//*    ❌ Directly println(schoolArray) likhne se array ka memory reference print hota hai.
        ✅ Properly print karne ke liye .contentToString() ya joinToString()  ya java.util.Arrays.toString(schoolArray) use karo.
        ✅ Loop se bhi har element alag-alag print ho sakta hai.*//*
    val schoolArray: Array<String> = arrayOf("shark", "whale", "dolphin")
    println(schoolArray.contentToString())

    val numbers = intArrayOf(1, 2, 3)
    val numbers3 = intArrayOf(4, 5, 6)
    val foo2 = numbers3 + numbers // means -> (4,5,6,1,2,3)
    println(foo2[2])

}*/

private fun usingListOfString(): List<String> {
    return listOf("Cod", "Sardine", "Mackerel", "Tuna", "Salmon")
}

private fun usingArayList(): ArrayList<String> {
    val college = arrayListOf("Cod", "Sardine", "Mackerel", "Tuna", "Salmon")
    college.add("Seal")
    return college
}

private fun usingArray(): Array<String> {
    return arrayOf("DOla", "LOla", "GOla")
}

private fun usingMutableList(): MutableList<String> {
    val collegeTwo = mutableListOf("Bedfordshire", "Cardiff", "Manchester", "Liverpool", "London")
    collegeTwo.remove("Cardiff")
    collegeTwo.removeAt(2)
    return collegeTwo


}

private fun usingIntArray(): Int {
    val numbers = intArrayOf(1, 2, 3)
    val numbers3 = intArrayOf(4, 5, 6)
    val foo2 = numbers3 + numbers
    return foo2[3]
}

private fun usingIntArrayWithList(): List<Any> {
    val num = intArrayOf(83, 23, 18, 1, 4)
    val oceans = listOf("Pacific", "Atlantic", "Indian")
    val thirdNum = num[3]// it will check 3rd index which is 1
    val output = listOf(thirdNum, oceans)
    return output

}

private fun usingSimpleArrayMulti(): Array<Int> {
    val mult = Array(15) { it * 3 }
    for ((index, value) in mult.withIndex()) {
        println("Index $index = $value")
    }
    return mult
}

private fun usingSimpleArrayMutliEven(): Array<Int> {
    val multi = Array(15) { it * 3 }
    val onlyEven = multi.filter { it % 2 == 0 }.toTypedArray()
    for ((index, value) in onlyEven.withIndex()) {
        println("Index $index = $value")
    }
    return onlyEven
}

/*//loops
fun usingLoops(): String {
    val sea = listOf("shark", "salmon", "whale")
    var result = ""

    for (element in sea) {
         result += element
    }
    return result
}*/


/*🧠 Step-by-Step Hinglish Explanation:
✅ Step 1:

val sea = arrayOf("shark", "salmon", "whale")
👉 Yeh ek array banaya gaya hai jismein 3 strings hain: "shark", "salmon", "whale"

✅ Step 2:

var result = ""
👉 result naam ki ek khaali string banayi gayi hai.
Isme hum baad mein sab elements ko jodenge.

✅ Step 3:

for ((index, element) in sea.withIndex()) {
👉 Yeh loop chal raha hai sea array par.

element har baar "shark", "salmon", "whale" banega.
index uss element ka number hoga: 0, 1, 2
✅ Step 4:

result += element
👉 Har element ko result string ke andar jod diya jaa raha hai.

Pehli baar: result = "shark"
Dusri baar: result = "sharksalmon"
Tisri baar: result = "sharksalmonwhale"

✅ Step 5:

if (index != sea.lastIndex) {
    result += " "
}
👉 Agar current element last nahi hai, toh ek space " " bhi jod do.

0 → not last → add " "
1 → not last → add " "
2 → last → no space
⚠️ Isse last element ke baad extra space nahi aata.

*/
/*fun usingLoops(): String {
    val sea = arrayOf("shark", "salmon", "whale")
    var result = ""

    for ((index, element) in sea.withIndex()) {
        result += element
        if (index != sea.lastIndex) {
            result += " " // Beech mein space daalna hai
        }
    }
return result
}*/

fun usingLoops(): String {
    val sea = arrayOf("shark", "salmon", "whale")
    return sea.joinToString(" ")
}
//In Kotlin, you can loop through the elements and the indexes at the same time.
fun usingIndexElementsLoops():String{
    val school = arrayOf("shark", "salmon", "whale")
    var result = ""
    for((index,element)in school.withIndex()){
        result += "item $index = $element"
    }
    return result
}


fun main() {
    val arrayListsLoops = ArrayListsLoopsClass()
    arrayListsLoops.runArrayListAndLoops()

}