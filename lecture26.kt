// 고차함수(High-order Function)

fun main() {
    println(testSum(3, 4))
    println(testLambdaSum(3, 4))
    sum5(1, 2, {a: Int, b: Int -> a + b})
    sum5(1, 2) { a: Int, b: Int -> a - b}
    sum5(1, 2, ::testSum)
    println()
    printTest("abcd")
    highPrintTest(::printTest)
    test3()


}

fun testSum(a: Int, b: Int) : Int {
    return a + b
}

val testLambdaSum = {a: Int, b: Int -> a + b}

fun sum5(a: Int, b: Int, operation: (Int, Int) -> Int) {
    println("a: ${a}, b: ${b}")
    println(operation(a, b))
}

fun printTest(str: String) {
    println(str)
}

fun highPrintTest(operation: (String) -> Unit) {
    operation("bbb")
}

fun test3() : Unit {
    println("not return")
}

fun test2() : Unit {
    println("abc")
    return
}

fun test1(): Unit {
    println("abc")
    return Unit
}