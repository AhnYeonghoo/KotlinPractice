
// 점수가 50점 이상인 사람들 출력

fun main() {

    val student = mutableMapOf<Int, String>()
    student[99] = "dd"
    student[20] = "철수"
    student[35] = "민수"
    student[48] = "가영"
    student[100] = "cc"
    student[22] = "수"
    student[45] = "민"
    student[88] = "dd"
    student[91] = "ww"
    student[87] = "aa"
    student[54] = "ff"
    student[42] = "하빵"
    val testList = ArrayList<String>()
    for (i in student) {
        if (i.key >= 50) {
            println(i.value)
            testList.add(i.value)
        }
    }
    println(testList)
}