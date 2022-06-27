// 제네릭(Generic)

fun main() {

    val box1 = Box1(10)
    println(box1.value)

    val box2 = Box2("10")
    println(box2.value)

    val box1_1 = Box1("10".toInt())
    println(box1_1.value) // -> 귀찮

    val box3 = Box3(10)
    println(box3.value)
    val box4 = Box3("asdf")
    println(box4.value)

    testFun1("abc")

    testFun2("a")
    testFun2(123)
    testFun2(2.2)

    testFun3("A")
}


fun <A> testFun3(a : A) {
    println(a)
}

fun <T> testFun2(a : T) {
    println(a)
}

fun testFun1(a : String) {
    println(a)
}

class Box1(test : Int) {
    var value = test
}

class Box2(test : String) {
    var value = test
}

class Box3<T>(test : T) {
    var value = test
}