// 람다(lambda)

fun main() {
    println(a())
    println(b())
    println(summ(1, 2))
    println(lamSum(5, 5))
    println(sumTypeNumber(5, 5))
    println()
    println(sumTypeNumberNull(1, 2))
    println(sumString("1", "2"))
    println(sumString2("a","bcd"))
    println(sumString3("bb", "Cc"))
}

fun summ(a : Int, b: Int) : Int {
    return a + b
}
// lambda
val sumTypeNumber : (Int, Int) -> Int = {a, b -> a + b}
val lamSum = { a: Int, b: Int -> a + b}
val sumTypeNumberNull : (Int, Int) -> Int? = {_, _ -> null}

fun sumString(a : String, b: String) : String {
    return "String1: ${a}, String2: ${b}"
}
val sumString2 = {a: String, b: String  -> "string1: ${a}, string2: ${b}"}
val sumString3 : (String, String) -> String = {a, b -> "string1: ${a}, string2: ${b}"}
fun a() : String {
    return "text"
}

fun b() : String = "text"