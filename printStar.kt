

fun main() {

    solution(3)
    // *
    // **
    // ****
    solution(5)
    // *
    // **
    // ****
    // *******
    // *************
}

fun solution(star : Int) {

    var count : Int = 1

    for (i in 1..star) {
        for (j in 1..count) {
            print("*")
        }
        println("")
        count = count * 2
    }
}