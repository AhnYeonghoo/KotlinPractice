
// 리스트에 있는 숫자들을 모두 더한 후
// 리스트의 갯수로 나눈 값을 출력하는 solution을 만드세요.

fun main() {

    val arr1 = arrayListOf<String>("1", "2")
    val result1 = solution3(arr1)
    println(result1)
    //1.5

    val arr2 = arrayListOf<String>("1", "2", "3", "4", "5")
    val result2 = solution3(arr2)
    println(result2)
}

fun solution3(arr: ArrayList<String>) : Double {

    var sum : Double = 0.0
    var result : Double = 0.0
    for (i in arr) {
        sum += i.toDouble()
    }
    result = sum / arr.size.toDouble()
    return result
}