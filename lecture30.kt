// infix function


fun main() {

    println(aSum(1, 2))
    println(10 bsum 20)
    println(20 bminus 10)
    println(10 multi1 10)
    println(10 sumThree 20)
    println("ab" sum4 "c")
    println("apple" sum5 " pott")
    println(10 showList 20)
}

infix fun Int.showList(num : Int) : List<Int> {

    val list = mutableListOf<Int>()
    for (i in this..num) {
        list.add(i)
    }
    println(this)
    return list
}

infix fun Int.bsum(num : Int) : Int = this + num
infix fun Int.bminus(num : Int) : Int = this - num
infix fun Int.multi1(num : Int) : Int = this * num
infix fun Int.sumThree(num : Int) : Int {
    return this + num
}
infix fun String.sum4(str : String) : String = this + str
fun aSum(a: Int, b: Int) : Int {
    return a + b
}
infix fun String.sum5(str : String) : String {
    return this + str
}