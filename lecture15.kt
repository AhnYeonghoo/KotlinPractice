// Any
// Is
// As

fun main() {

    var str1 : String = "abc"
    println(str1)
    str1 = "cba"
    println(str1)

    var str2 : Any = "abc"
    println(str2)
    str2 = 123
    println(str2)

    var str3 : Any = "abc"

    if (str3 is String) {
        println("this is String")
    } else {
        println("this is not String")
    }

    var str4 : Any  = "abc"
    str4 = 3
    when (str4) {
        is Int -> { println("this is Int") }
        is String -> { println("this is String") }
        else -> {
            println("this is else")
        }
    }

    var str5 : String = "abc"
    var str6 : String = str5 as String
    println(str6)
    var str7 : Int = 1

    var str9 : String? = 1 as? String
    println(str9)



}