// 3! -> 3 * 2 * 1 = 6

fun main() {

    val result1 = solution5(3)
    println(result1)

    val result2 = solution5(4)
    println(result2)

    val result3 = solution5(5)
    println(result3)
}

fun solution5(number : Int) : Int {

    var result = 1
    for (i in 1..number) {
        result *= i
    }

    return result
}