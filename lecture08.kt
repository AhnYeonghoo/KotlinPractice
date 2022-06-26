// while
// List, Map
// Iterator


fun main() {

    // while
    var count : Int = 0
    while (count < 100) {
        count++
        println(count)
    }

    val testList1 = mutableListOf("a" , "b", "c")
    println(testList1)
    for (i in testList1) {
        println(i)
    }

    val testMap1 = mutableMapOf<Int, String>()
    testMap1.put(5, "유리1")
    testMap1.put(10, "유리2")
    testMap1.put(25, "유리3")
    testMap1.put(35, "유리4")
    println(testMap1)

    var a : Int = 0
    for (i in testMap1) {
        println(i)
    }

    val testMap2 = mutableMapOf<Int, String>()
    testMap2[5] = "유리1"
    testMap2[15] = "유리2"
    testMap2[25] = "유리3"
    testMap2[35] = "유리4"
    println(testMap2[35])
    for (i in testMap2) {
        println(i)
    }

    val testList2 = mutableListOf("a", "b", "c")

    val testIterator = testList2.listIterator()

    println(testIterator.next())
    println(testIterator.next())
    println(testIterator.next())
    println(testIterator.hasNext())
    println(testIterator.previous())
    println(testIterator.previous())
    println(testIterator.previous())

    while (testIterator.hasNext()) {
        println(testIterator.next())
    }

}

