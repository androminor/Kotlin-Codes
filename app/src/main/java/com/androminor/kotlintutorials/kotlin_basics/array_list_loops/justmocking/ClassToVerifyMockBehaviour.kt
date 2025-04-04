package com.androminor.kotlintutorials.kotlin_basics.array_list_loops.justmocking
/**
 * Created by Varun Singh
 */
/*Ye ek aisi class hai jiske paas methods hain jo:

List / Array lete hain
Unka kuch processing karte hain (ya karne ka naatak karte hain 😄)
Aur kuch result return karte hain*/

class ClassToVerifyMockBehaviour {

    fun processSchoolList(schoolList: List<String>): List<String> {
        // 👶 Bacchon jaisa logic - just return modified list
        return schoolList.map { it.uppercase() }
    }

    fun processSchoolArray(schoolArray: Array<String>): String {
        // 🐬 Combine all sea creatures into one string
        return schoolArray.joinToString(separator = ", ")
    }

    fun processCollegeOneList(collegeOneList: ArrayList<String>): ArrayList<String> {
        // 🏫 Return only names with length > 8
        return ArrayList(collegeOneList.filter { it.length > 8 })
    }

    fun processCollegeTwoList(collegeTwoList: MutableList<String>): MutableList<String> {
        // 🏙️ Remove duplicates (just for fun)
        return collegeTwoList.toMutableSet().toMutableList()
    }

    fun calculateFoo2(numbers1: IntArray, numbers2: IntArray): Int {
        // ➕ Sum of all numbers
        return (numbers1.sum()) + (numbers2.sum())
    }
}
class ArrayListsLoopVerify(private val listProcessors: ClassToVerifyMockBehaviour) {
//2. Instead call by runArrayListAndLoops to make it enacpsulated,abstracted, controlled access, testable and following separation of concern

    fun runArrayListAndLoops(): Int {
        return problemsOnArrayListAndLoops()
    }

    // 1. if you try to directly call problemsOnArrayListAndLoops then make it public but not a good practice
    private fun problemsOnArrayListAndLoops(): Int {

        val school: List<String> = listOf("Cod", "Sardine", "Mackerel", "Tuna", "Salmon")
        println(listProcessors.processSchoolList(school))

        val collegeOne: ArrayList<String> =
            arrayListOf("Bedfordshire", "Cardiff", "Manchester", "Liverpool")
        println(listProcessors.processCollegeOneList(collegeOne))

        val collegeTwo: MutableList<String> =
            mutableListOf("Bedfordshire", "Cardiff", "Manchester", "Liverpool", "London")
        println(listProcessors.processCollegeTwoList(collegeTwo))

        val schoolArray: Array<String> = arrayOf("shark", "whale", "dolphin")
        println(listProcessors.processSchoolArray(schoolArray))

        val numbers = intArrayOf(1, 2, 3)
        val numbers3 = intArrayOf(4, 5, 6)
        val result = listProcessors.calculateFoo2(numbers, numbers3)
        println(result)

        return result
    }
}

fun main() {
    val listProcessors = ClassToVerifyMockBehaviour()
    val arrayListsLoops = ArrayListsLoopVerify(listProcessors)
    val result = arrayListsLoops.runArrayListAndLoops()
    println("Result from runArrayListAndLoops: $result") // Print the returned result
}
/*🧠 Purpose of ClassToVerifyMockBehaviour:

Ye ek aisi class hai jiske paas methods hain jo:

List / Array lete hain
Unka kuch processing karte hain (ya karne ka naatak karte hain 😄)
Aur kuch result return karte hain
✅ Tera test aur ArrayListsLoopss kya expect karte hain?

// Required methods in AnotherWayUsingClass 👇
fun processSchoolList(schoolList: List<String>): List<String>
fun processSchoolArray(schoolArray: Array<String>): String
fun processCollegeOneList(collegeOneList: ArrayList<String>): ArrayList<String>
fun processCollegeTwoList(collegeTwoList: MutableList<String>): MutableList<String>
fun calculateFoo2(numbers1: IntArray, numbers2: IntArray): Int
💡 Toh chalo ek bacchon jaisa version likhte hain:

class AnotherWayUsingClass {

    fun processSchoolList(schoolList: List<String>): List<String> {
        // 👶 Bacchon jaisa logic - just return modified list
        return schoolList.map { it.uppercase() }
    }

    fun processSchoolArray(schoolArray: Array<String>): String {
        // 🐬 Combine all sea creatures into one string
        return schoolArray.joinToString(separator = ", ")
    }

    fun processCollegeOneList(collegeOneList: ArrayList<String>): ArrayList<String> {
        // 🏫 Return only names with length > 8
        return ArrayList(collegeOneList.filter { it.length > 8 })
    }

    fun processCollegeTwoList(collegeTwoList: MutableList<String>): MutableList<String> {
        // 🏙️ Remove duplicates (just for fun)
        return collegeTwoList.toMutableSet().toMutableList()
    }

    fun calculateFoo2(numbers1: IntArray, numbers2: IntArray): Int {
        // ➕ Sum of all numbers
        return (numbers1.sum()) + (numbers2.sum())
    }
}
🧪 Extra Tip:

Tu test me mock(...) use kar raha hai, toh iska real logic kabhi call nahi hota.
But agar tu AnotherWayUsingClass() ka real object pass kare, toh upar ka logic chalega.

🎯 Summary:

Method	Kaam kya kar raha hai?
processSchoolList()	List ko uppercase me convert kar raha hai
processSchoolArray()	Array ko ek comma-separated string bana raha hai
processCollegeOneList()	Sirf bade naam (length > 8) return kar raha hai
processCollegeTwoList()	Duplicate hata ke return kar raha hai
calculateFoo2()	Dono array ka sum return kar raha hai

🤔 Tera original wala AnotherWayUsingClass kya karta hai?

class AnotherWayUsingClass {

    fun processSchoolList(school: List<String>): List<String> {
        return school // 🔁 koi change nahi, jaisa aaya waisa gaya
    }

    fun processCollegeOneList(collegeOne:ArrayList<String>): ArrayList<String> {
        collegeOne.add("London") // 🏙️ naya element add
        return collegeOne
    }

    fun processCollegeTwoList(collegeTwo: MutableList<String>): MutableList<String> {
        collegeTwo.remove("Cardiff") // ❌ kuch items hata raha hai
        collegeTwo.removeAt(2)
        return collegeTwo
    }

    fun processSchoolArray(schoolArray: Array<String>): String {
        return schoolArray.contentToString() // 📜 array ko string banaya
    }

    fun calculateFoo2(numbers: IntArray, numbers3: IntArray): Int {
        val foo2 = numbers3 + numbers
        return foo2[2] // 🤯 sirf 3rd element return
    }
}
🧪 Lekin test me kya ho raha hai?

// mock(...) ke through, tu iske real logic ko **bypass** kar raha hai
whenever(listProcessor.processSchoolList(any())).thenReturn(listOf("a", "b"))
📌 Matlab:

Test me tu real method call hi nahi kar raha
Tu keh raha hai: "Jab bhi ye method call ho, bas ["a", "b"] return kar dena"
Isiliye test pass karne ke liye tujhe sirf function signatures chahiye
🧠 Toh fir dusra version banaya kyun?

Main jo dusra version diya tha:

fun processSchoolList(...) = schoolList.map { it.uppercase() }
// etc...
Ye sirf reference / learning purpose ke liye tha.
Taki agar tu kabhi mock() na kare aur real implementation chalana chahe,
 toh ek non-trivial (thoda kaam karta hua) version ho.

🎯 Final Samjhauta (deal 😄):

Situation	Real Class (Tera)	Dummy Class (Mera)
✅ Tu mock use kar raha hai	Bas function signature hona kaafi hai	No need
✅ Tu actual logic chalana chahta hai	Zaroori hai proper return values dena	Useful
📚 Tujhe examples aur learning chahiye	Already bana hua	Mera helpful for demo

*/
