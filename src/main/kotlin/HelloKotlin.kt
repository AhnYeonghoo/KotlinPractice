class HelloKotlin {
}


open class Human constructor(name : String = "Anonymous") {

    constructor(name : String, age : Int) : this(name) {
        println("my name is ${this.name}, ${age}years old")
    }

    val name : String = name

    init {
        println("Now human has been born!")
    }

    open fun eatingCake() {

        println("this is so yummy!!")
    }
}

class Korean : Human() {

    override fun eatingCake() {
        super.eatingCake()
        println("this is so hot")
    }
}

fun main(args: Array<String>) {
    // 3. String Template

    val name : String = "Ahn"
    val lastName : String = "Yeonghoo"
    println("my name is ${name + lastName}231")

    println("this is 2\$doller")
    println("잔디밭 심기^^")
    val human = Human("minsu")
    val stranger  = Human()
    val human2 = Human("Kurl", 23)
    println()
    val korean = Korean()
    korean.eatingCake()
    human.eatingCake()
    println("this stranger name is ${stranger.name}")
    println("this human name is ${human.name}")
    // 5. Array and List

    // Array -> 메모리가 컴파일될 떄 결정
    // List 1. immutablelist, 2. mutablelist
    val array : Array<Int> = arrayOf(1, 2, 3)
    val list : List<Int> = listOf(1, 2, 3)
    val array2 : Array<Any> = arrayOf(1, "d", 3.4f)
    val list2 : List<Any> = listOf(1, "d", 11L)

    val arrayList : ArrayList<Int> = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    array[0] = 3
    var result = list[0]
    println(result)
    println(array.get(0))
    println(arrayList)

    forAndWhile()

    // 4. comment
    // basic comment
    /*
        여러줄 주석
    */

    checkNum(1)


}

// 1. 함수
// 리턴 형식이 Unit이면 void와 동일
fun helloWorld() : Unit {
    println("Hello World")

}

fun add(a : Int, b : Int) : Int {
    return a + b
}

// 2. val & var
// val = value(값) -> const인듯?
// var = variable -> 변수
fun hi() {

    val a : Int = 10
    var b : Int = 9
    b = 100
    // a = 20 -> 불가능

    val auto = 20 // 자동으로 형식 지정해줌 Int로
    var d = 100

    var name : String = "Ahn Yeonghoo"
    println(name)

}

// 5. condition expression

fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

// maxBy와 동일한 함수식
fun maxBy2(a: Int, b: Int) : Int = if(a > b) a else b




fun checkNum(score : Int) {
    // switch expression과 동일
    when (score) {
        0 -> println("this is zeor")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("I dont No")
    }

    var b: Int = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b: ${b}")

    when (score) {

        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

fun forAndWhile() {

    val students : ArrayList<String> = arrayListOf("ahnyong", "jany", "kim", "jenny")

    for (name: String in students) {
        println("${name}")
    }

    var sum : Int = 0
    for (i : Int in 1..10 step 2) {
        sum += i
    }

    for ((index, name) in students.withIndex()) {
        println("${index+1}번째 학생: ${name}")
    }
    println("sum is ${sum}")
    var sum2 : Int = 0
    for (i : Int in 10 downTo 1) {
        sum2 += i
    }
    println("sum2 is ${sum2}")

    var index: Int = 0
    while(index < 10) {
        println("current index: ${index}")
        index++
    }

}