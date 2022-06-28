// 문자열의 개수 카운트

fun main() {

    val result1 = solution6("aabbaabccbb")
    println(result1)
    // {b=5, a=4, c=2}

    val result2 = solution6("ccddcddaaq")
    println(result2)
}

fun solution6( str: String) : Map<String, Int> {

    val result = mutableMapOf<String, Int>()
    val resultArr = mutableListOf<String>()

    for (i in str) {
        resultArr.add(i.toString())
    }
    val distinctList = resultArr.distinct()
    val countList = mutableListOf<Int>()
    for (i in distinctList) {
        val count = resultArr.filter { it == i }.count()
        countList.add(count)
    }

    for (i in 0..distinctList.count() - 1) {
        result[distinctList[i]] = countList[i]
    }


    return result.toList().sortedBy { it.second}.reversed().toMap()

}