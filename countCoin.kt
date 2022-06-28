// 여러개의 동전 중
// 가장 동전의 수를 적게 받을 수 있는 solution을 만드세요

// 1360 -> 500 * 2 / 100 * 3 / 50 * 1 / 10 * 1 = 7

fun main() {

    val coins1 = arrayListOf<Int>(500, 100, 50, 10)
    val money1 = 1360
    val result1 = solution9(coins1, money1)
    println(result1)

    val coins2 = arrayListOf<Int>(500, 100, 50, 10)
    val money2 = 1510
    val result2 = solution9(coins2, money2)
    println(result2)

}

fun solution9(coins : ArrayList<Int>, money : Int) : Int {

    // 1360 -> 500 x 2 -> 360
    // 360 -> 100 x 3 -> 60
    // 60 -> 50 x 1 -> 10
    // 10 -> 10 x 1 -> end

    var resultCount : Int = 0
    var currentMoney : Int = money

    for (coin in coins) {
        resultCount = resultCount + currentMoney / coin
        currentMoney = currentMoney % coin
        println(resultCount)
        println(currentMoney)
    }


    return resultCount
}