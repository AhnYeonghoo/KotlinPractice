
// 문자열 가공

fun main() {

    val testString: String = "he is man and woman"

    val newTestString = testString.split(" ")
    println(testString)
    println(newTestString)
    println(newTestString[0])
    println(newTestString[1])

    println(testString[0])
    println(testString[1])
    println(testString[2])
    val a: String = testString[1].toString()
    val b: String = testString[2].toString()
    println(a + b)

    val splitString: String = testString.substring(0, 2)
    println(splitString)

    val splitString2: String = testString.substring(0, testString.length-1)
    println(splitString2)

    val replaceValue: String = testString.replace("he", "she")
    println(replaceValue)

    val testList = ArrayList<String>()
    testList.add("abc1@naver.com")
    testList.add("abc2@google.com")
    testList.add("abc3@daum.com")
    testList.add("abc4@kakao.com")
    testList.add("abc5@naver.com")
    testList.add("abc6@kakao.com")
    testList.add("abc7@naver.com")
    // 5 ~ 8
    var count = ArrayList<String>()
    for (i in testList) {
        println(i.split("@")[1].split(".")[0])
        count.add(i.split("@")[1].split(".")[0])
    }

    var result: Int = 0
    for (i in count) {
        if (i == "naver") {
            result++
        }
    }
    println(result)

}