// 리스트의 숫자를 뒤집어서 반환하는 solution을 만드세요


fun main() {

    val arr1 = arrayListOf(1,2,3,4,5)
    val result1 = solution4(arr1)
    println(result1)

    val arr2 = arrayListOf(2, 4, 6, 8)
    val result2 = solution4(arr2)
    println(result2)


}

fun solution4(arr : ArrayList<Int>) : ArrayList <String> {

    val length = arr.size
    var result = ArrayList<String>()
    for (i in 0..length-1) {
        result.add(arr[length-1-i].toString())
        println(arr[length-1-i].toString())
    }

    return result

}