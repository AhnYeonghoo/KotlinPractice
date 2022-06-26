fun main() {
    sumTwo(3, 5)
    sumThree(3, 5, 5)
    minus(10, 5)
    division(15.0, 5.0)
    remainder(15.0, 5.0)
}

fun sumTwo(num1: Int, num2: Int) {
    println(num1 + num2)
}

fun sumThree(num1: Int, num2: Int, num3: Int) {
    println(num1 + num2 + num3)
}

fun minus(num1: Int, num2: Int ) {
    println(num1 - num2)
}

fun division(num1: Double, num2: Double) {
    println(num1 / num2)
}

fun remainder(num1: Double, num2: Double) {
    println(num1 % num2)
}