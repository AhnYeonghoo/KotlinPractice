// object -> singleton pattern


fun main() {

    val test1 = TestClass()
    val test2 = TestClass()
    test1.count = 10
    println(test1.count)
    println(test2.count)

    val test3 = TestObject
    val test4 = TestObject

    test3.count = 10

    println(test3.count)
    println(test4.count)

    println()

    val test5 = TestObjectClass()
    val test6 = TestObjectClass()
    test5.plusBtn()
    println(TestObjectClass.number)
    test5.plusBtn()
    println(TestObjectClass.number)
    test6.minusBtn()
    println(TestObjectClass.number)

}

class TestObjectClass {

    companion object {
        var number = 0
    }

    fun plusBtn() {
        number++
    }

    fun minusBtn() {
        number--
    }
}


object TestObject {

    init {
        println("TestObject")
    }

    var count = 0
}

class TestClass {

    init {
        println("testClass")
    }
    var count = 0
}