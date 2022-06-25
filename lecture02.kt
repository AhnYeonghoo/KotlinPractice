// 자료형 -> 숫자(Int, Long, double, Float), 문자(String), boolean(true, false)
// 형 변환
// null type

fun main() {

    val test1 = "1234"
    val test2 = 1234

    println(test1 + 1)
    println(test2 + 1)
    println(test1::class.java.simpleName)
    println(test2::class.java.simpleName)

    val test3 = 1234.1234
    println(test3::class.java.simpleName)

    val test4 : Int = 1234
    println(test4)

    val test5 : String = "1234"
    println(test5)

    val test6: Long = 1234123412341234 // -> Int not using out of range
    println(test6::class.java.simpleName)

    val test8 : Float = 1234.1234f
    print(test8)

    val test9 : Int = 1234
    val test10 = test9.toString()
    println(test9::class.java.simpleName)
    println(test10::class.java.simpleName)
    println()

    val test11 : String = "1234"
    val test12 = Integer.parseInt(test11)
    println(test12::class.java.simpleName)
    println(test11::class.java.simpleName)
    println()

    val test13 = ""
    val test14 = null
    println(test13==test14)
    println(test13)
    println(test14)

    val test15 : String = "as"
    val test16 : String? = "abcd"
    val test17 : String? = null
    println(test16)


}