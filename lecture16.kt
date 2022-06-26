// List 가공

fun main() {

    val testList1 = mutableListOf<Int>()
    testList1.add(1)
    testList1.add(2)
    testList1.add(3)
    testList1.add(4)
    testList1.add(10)
    testList1.add(10)
    testList1.add(11)
    testList1.add(11)



    println(testList1.distinct())
    println(testList1.maxOrNull())
    println(testList1.minOrNull())
    println(testList1.average())

    val testList2 = listOf("john", "jay", "minsu", "minji", "bokchi")
    val result = testList2.filter {
        it.startsWith("j")
    }

    println(result)

    val result2 = testList2.filter {
        it.startsWith("m")
    }
    println(result2)

    var testList3 = listOf(1, 2,3,4,5)
    val result3 = testList3.filter {
        it % 2 == 0
    }

    println(result3)


    val testList4 = listOf("a", "aa", "aaa", "aaaa")

    val result4 = testList4.groupBy {
        it.length > 2
    }
    println(result4)
    println(result4[true])



}