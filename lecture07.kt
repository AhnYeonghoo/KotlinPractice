// List
// Map
// Set

fun main() {

    val testList1 = listOf("a", "b", "c")
    println(testList1)
    println(testList1[0]) // indexing
    // testList1.add("d") -> error!
    val testList2 = mutableListOf("a", "b", "c")
    testList2.add("d")
    println(testList2)
    testList2.remove("a")
    println(testList2)

    val mutableList1 = mutableListOf<Int>()
    mutableList1.add(5)
    mutableList1.add(10)
    mutableList1.add(15)
    mutableList1.add(20)
    val mutableList2 = mutableListOf<String>()
    mutableList2.add("유리")
    mutableList2.add("철수")
    mutableList2.add("짱구")
    mutableList2.add("훈이")

    val findIndex = mutableList1.indexOf(10)
    println(findIndex)
    println(mutableList2[findIndex]) // -> 불편

    // Map은 파이썬의 딕셔너리..?

    val testMap1 = mutableMapOf<Int, String>()
    testMap1.put(5, "유리")
    testMap1.put(10,"철수")
    testMap1.put(15,"짱구")
    testMap1.put(22,"훈이")

    println(testMap1[15])
    println(testMap1[5])

    val testSet1 =  mutableSetOf("a", "b", "c")
    println(testSet1)

    testSet1.add("d")
    testSet1.add("e")
    println(testSet1)
    testSet1.add("a")
    testSet1.add("a")
    testSet1.add("a")
    println(testSet1) // -> set은 중복을 허용하지 않는다.
    testSet1.remove("a")
    println(testSet1)



}