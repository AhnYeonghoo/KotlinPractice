// 논리연산

fun main() {

    var a: String = "남자"
    var b: Int = 20

    // And
    if (a == "남자" && b == 20) {
        println("he is man, 20")
    } else {
        println("he not and")
    }

    val c : String = "남자"
    val d: Int = 30
    if (c == "남자" || d >= 30) {
        println("or")
    } else {
        println("not or")
    }

    val student = mutableMapOf<Int, String>()
    student[99] = "ddd"
    student[20] = "철수"
    student[35] = "민수"
    student[48] = "가영"
    student[100] = "ccd"
    student[22] = "수"
    student[45] = "민"
    student[88] = "dd"
    student[91] = "ww"
    student[87] = "aa"
    student[54] = "ff"
    student[42] = "하빵"

    // 학생중에 점수 50점 이상이면서, 학생의 이름길이가 3 이상인 친구들
    for (i in student) {
        if (i.key >= 50 && i.value.length == 3) {
            println(i.value)
        }
    }




}