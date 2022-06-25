// 간단한 조건문을 이용한 문제풀이
// 학생의 A B C D F 점수를 출력

fun main() {

    val score = 80

    // 학생 점수가 100 초과면 A
    // 90점 초과면 B
    // 80점 초과면 C
    // 70점 초과면 D
    // 70이하 F

    if (score > 100) {
        println("A")
    } else if (score > 90) {
        println("B")
    } else if (score > 80) {
        println("C")
    } else if (score > 70) {
        println("D")
    } else {
        println("F")
    }

    
}