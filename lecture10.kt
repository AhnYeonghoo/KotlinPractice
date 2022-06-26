// function

fun main() {
    testFun()
    abc()
    sum5(10, 20)
    println(sum6(30, 60))
}

fun sum5(num1: Int, num2: Int) {
    println(num1 + num2)

}

fun sum6(num1: Int, num2: Int) : Int {
    val result: Int = num1 + num2
    return result
}

fun abc() {
    val a = 10
    val b = 20
    val c = a + b
    println(c)
}
fun testFun() {

    println("a")
    println("b")
    println("c")
    println("d")

}