
// 리스트와 filter
// 물음표와 느낌표\
// 반복문

fun main() {

    val testList1 = ArrayList<String>()
    testList1.add("a")
    testList1.add("b")
    testList1.add("c")
    for (a in testList1) {
        println(a)
    }
    println(testList1)

    val testList2 = listOf("a", "b", "c")
    println(testList2)

    val testList3 = mutableListOf<String>("a", "b", "c")
    println(testList3)
    testList3.add("d")
    println(testList3)

    println()

    val testList4 = listOf("student1", "student2", "student3", "student4", "teacher1", "student5")
    println(testList4)
    println(testList4.filter { it.startsWith("s") })

    val testList5 = listOf("student1", "student2", "student3", "student4", "teacher1", "student5", null)
    println(testList5)
    //println(testList5.filter { it.startsWith("s")} )
    println(testList5.filterNotNull().filter { it.startsWith("s") })

    var test1 : String = "a"
    var test2 : String = "b"
    test1 = test2
    println(test1)

    var test3 : String = "c"
    var test4 : String? = "d" // -> 널일 수도 있다.
    test3 = test4!! // -> 널이 아니다를 강조
    println(test3)

    println()
    val testList6 = listOf("a", "b", "c", "d", "e", "f")
    for (i in testList6) {
        println(i)
    }
    for (i in 1..10) {
        print(i)
    }
    println()
    for (i in 1..10 step 2) {
        print(i)
    }
    println()
    for (i in 1..10 step 3) {
        print(i)
    }
    println()
    for (i in 1..3) {
        println("i is value: ${i}" )
    }

    for (i in 1..3) {
        for (j in 1..3) {
            println("i is ${i}, j is ${j}")
        }
    }


}