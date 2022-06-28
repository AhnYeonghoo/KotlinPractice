// 문자열의 숫자와 짝수(true)와 홀수(false)를 알려주는 solution을 만드세요.

fun main() {

    val result1 = solution1("abcd")
    println(result1)
    // [4, true]
    val result2 = solution1("abcde")
    println(result2)
    // [5, false]
}

fun solution1(str : String) : ArrayList<String> {

    val length = str.length
    /*
    var isEven = true
    if (length % 2 == 0) {
        isEven = true
    } else {
        isEven = false
    }*/

    val isEven = length % 2 == 0

    val result = arrayListOf<String>(length.toString(), isEven.toString())
    return result
}