package com.androminor.kotlintutorials.kotlin_basics.array_list_loops

import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.kotlin.whenever

class AnotherWayUsingClassTest {

    private lateinit var listProcessor: AnotherWayUsingClass
    private lateinit var arrayListLoopers: ArrayListsLoopss

    @Before
    fun setup() {
        listProcessor = mock(AnotherWayUsingClass::class.java)
        arrayListLoopers = ArrayListsLoopss(listProcessor)

        // 🔧 Mock the return values for each method
        whenever(listProcessor.processSchoolList(org.mockito.kotlin.any())).thenReturn(
            listOf(
                "a",
                "b"
            )
        )
        whenever(listProcessor.processSchoolArray(org.mockito.kotlin.any())).thenReturn(arrayOf("Shark").toString())
        whenever(listProcessor.processCollegeOneList(org.mockito.kotlin.any())).thenReturn(
            arrayListOf("X", "Y")
        )
        whenever(listProcessor.processCollegeTwoList(org.mockito.kotlin.any())).thenReturn(
            mutableListOf("London")
        )
        whenever(
            listProcessor.calculateFoo2(
                org.mockito.kotlin.any(),
                org.mockito.kotlin.any()
            )
        ).thenReturn(6)
    }

    @Test
    fun `test all function inside runArrayListAndLoops`() {
        //  given or arrange
        val school = listOf("Cod", "Sardine", "Mackerel", "Tuna", "Salmon")
        val collegeOne = arrayListOf("Bedfordshire", "Cardiff", "Manchester", "Liverpool")
        val collegeTwo =
            mutableListOf("Bedfordshire", "Cardiff", "Manchester", "Liverpool", "London")
        val schoolArray = arrayOf("shark", "whale", "dolphin")
        val numbers = intArrayOf(1, 2, 3)
        val numbers3 = intArrayOf(4, 5, 6)
        val expectedResult = 6

        //act or when
        val result = arrayListLoopers.runArrayListAndLoops()

        //assert or then
        Assertions.assertEquals(expectedResult, result)
        verify(listProcessor).processSchoolList(school)
        verify(listProcessor).processSchoolArray(schoolArray)
        verify(listProcessor).processCollegeOneList(collegeOne)
        verify(listProcessor).processCollegeTwoList(collegeTwo)
        verify(listProcessor).calculateFoo2(numbers, numbers3)


    }
}
/*🎯📚 Yeh sab useful tools import kiye hain:

@Before: Test se pehle koi setup karna ho toh.
@Test: Actual test batata hai.
Assertions: Check karne ke liye ki expected vs actual same hai ya nahi.
mock(): Kisi class ka nakli version banane ke liye.
verify(): Dekhne ke liye ki koi method call hua ya nahi.
whenever(): Jab koi method call ho toh kya return karna hai — yeh set karta hai.

import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.kotlin.whenever

🧪 Test class start ho rahi hai.
class AnotherWayUsingClassTest {

🔧 Yahan do variables declare kiye hain:
private lateinit var listProcessor: AnotherWayUsingClass
private lateinit var arrayListLoopers: ArrayListsLoopss

listProcessor — is class ke methods ko mock karenge.
arrayListLoopers — jiska test karna hai.

🧼 setup() function test se pehle chalta hai — yeh test ke liye preparation karta hai.
@Before
fun setup() {

listProcessor = mock(AnotherWayUsingClass::class.java)
🤖 AnotherWayUsingClass ka ek nakli (mock) version bana rahe hain,
jisme methods original logic se nahi, hum jo bolenge wo hi karenge.

arrayListLoopers = ArrayListsLoopss(listProcessor)
🧩 Ab real class ArrayListsLoopss banayi, lekin usme listProcessor ka mock diya —
taaki wo test mein humare control mein ho.

✅ Ab har method ke liye whenever ka use:
whenever(listProcessor.processSchoolList(org.mockito.kotlin.any())).thenReturn(listOf("a", "b"))
📋 Jab bhi processSchoolList() kisi bhi input ke saath call ho, toh list of "a", "b" return kare.

whenever(listProcessor.processSchoolArray(org.mockito.kotlin.any())).thenReturn(arrayOf("Shark").toString())
🐟 Isme school array wala method call ho toh "Shark" return ho.

whenever(listProcessor.processCollegeOneList(org.mockito.kotlin.any())).thenReturn(arrayListOf("X", "Y"))
🏫 College One ke list ke liye "X", "Y" return kare.

whenever(listProcessor.processCollegeTwoList(org.mockito.kotlin.any())).thenReturn(mutableListOf("London"))
🌍 College Two ke list pe "London" return kare.

whenever(listProcessor.calculateFoo2(org.mockito.kotlin.any(), org.mockito.kotlin.any())).thenReturn(6)
🔢 Dono number arrays dene par 6 return kare.

✅ Test Function:

@Test
fun `test all function inside runArrayListAndLoops`() {
🧪 Yeh actual test function hai jiska naam batata hai ki hum kya test kar rahe hain.

🎁 Arrange / Given:🎒 Sab inputs ready kar liye hain jo function use karega.
val school = listOf("Cod", "Sardine", "Mackerel", "Tuna", "Salmon")
val collegeOne = arrayListOf("Bedfordshire", "Cardiff", "Manchester", "Liverpool")
val collegeTwo = mutableListOf("Bedfordshire", "Cardiff", "Manchester", "Liverpool", "London")
val schoolArray = arrayOf("shark", "whale", "dolphin")
val numbers = intArrayOf(1, 2, 3)
val numbers3 = intArrayOf(4, 5, 6)
val expectedResult = 6


⚙️ Act / When:🧠 Yeh actual method call kar rahe hain jo hum test kar rahe hain.
val result = arrayListLoopers.runArrayListAndLoops()


✅ Assert / Then:✅ Check kar rahe hain ki output jo mila (result) wo expectedResult (6) ke barabar hai ya nahi.
Assertions.assertEquals(expectedResult, result)

✅ Verify calls:🕵️‍♂️ Yeh check karta hai ki sab methods actual mein call huye the ya nahi with proper inputs.
verify(listProcessor).processSchoolList(school)
verify(listProcessor).processSchoolArray(schoolArray)
verify(listProcessor).processCollegeOneList(collegeOne)
verify(listProcessor).processCollegeTwoList(collegeTwo)
verify(listProcessor).calculateFoo2(numbers, numbers3)

✅ Final Summary (Jaisa baccha sunta hai):
Humne ek class banayi jiska test likhna tha.
Uske andar jo doosri class use ho rahi thi, uska dummy version banaya.
Har method ka fixed result diya.
Fir actual method call kiya aur dekha ki result sahi hai.
Fir ye bhi dekha ki sab methods sahi input ke saath call huye ya nahi.
*/