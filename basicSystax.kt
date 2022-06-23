import kotlin.text.*

var x = 0
fun main() {
    println("Hello world")
    println(sum(3, 5))
    println("sum2 is ${sum2(19, 23)}")
    printSum(-1, 8)
    var a: Int = 1
    val b = 2
    val c: Int
    c = 3
    var x : Int = 5
    incrementX()
    println(x)
    /*
    여러줄 주석
     */
    val s1 = "a is ${a}"
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
    println("\n\n")
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")

    println("\n\n")
    fun printLength(obj: Any) {
        println("'${obj}' string is length ${getStringLength(obj)?: "... error not a stream"}")
    }
    printLength("아무스트링")
    printLength(1000)
    printLength(listOf(Any()))

    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("index ${index} count is ${items[index]}")
    }

    val items2 = listOf("apple", "banana", "kiwifruit")
    var index2 = 0
    while (index2 < items.size) {
        println("item at ${index2} is ${items[index2]}")
        index2++
    }

    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

    val x2 = 10
    val y = 9
    if (x2 in 1..y+1) {
        println("this is in range")
    }

    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of index")
    }

    if (list.size !in list.indices) {
        println("list size is out of index range")
    }

    for (x in 1..5) {
        print(x)
    }
    for (x: Int in 9 downTo 0 step 3) {
        print(x)
    }

    val items3 = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
    println()

    val items4 = setOf("apple", "banana", "kiwifruit")
    when {
        "orange" in items4 -> println("juicy")
        "apple" in items4 -> println("apple is fine too")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")

    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }

    val person1 = Person("John")
    val person2 = Person("John")

    person1.age = 10
    person2.age = 20

    println("person1 == person2: ${person1 == person2}")
    println("person1 with age ${person1.age}: ${person1}")
    println("person2 with age ${person2.age}: ${person2}")

    val jack = User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)
    val jane = User("Jane", 35)
    val (name, age) = jane
    println("${name}, ${age}세")


}

data class User(val name: String="", val age: Int = 0)
data class Person(val name: String) {
    var age: Int = 0
}

fun incrementX() {
    x += 1
}


fun sum(a : Int, b : Int) : Int {
    return a + b
}
fun sum2(a : Int, b : Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("printSum is ${a} and ${b} is ${a + b}")
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {

    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x + y)
    } else {
        println("'${arg1}' or '${arg2}' is not a number")
    }
}

fun getStringLength(obj: Any): Int? {

    if (obj is String) {
        return obj.length
    }

    return null
}

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unknown"
    }