// 리스트의 가장 작은 숫자를 찾아 제거
// 남은 숫자를 모두 더해 값 출력

fun main() {

    val input1 = arrayListOf(1,2,3,4,5)
    val result1 = solution7(input1)
    println(result1)

    val input2 = arrayListOf(10, 8, 6, 4, 2)
    val result2 = solution7(input2)
    println(result2)

    val input3 = arrayListOf(6, 3 ,9)
    val result3 = solution7(input3)
    println(result3)
}

fun solution7(arr : ArrayList<Int>) : Int {

    var result : Int = 0
    val min = arr.minOrNull()
    arr.remove(min)

    for (i in arr) {
        result += i
    }


    return result

}