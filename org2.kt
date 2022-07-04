import TestObject.count
import java.io.File
import java.lang.ArithmeticException
import java.lang.IllegalArgumentException
import java.nio.file.Files
import java.nio.file.Paths

// org2

data class Customer(val name: String, val email: String)
// this class default provide get,setter, equals, hashcode... etc

fun foo(a: Int = 0, b: String = "") {

}

class Foo {

}

fun main() {

    val list = mutableListOf<Int>(1,2,3,4,5,6,7,-1,-3,-5)
    var positives = list.filter { x -> x > 0}
    println(positives)
    positives = list.filter { it > 0} // this is line 13 equals
    println(positives)

    val emailsList = mutableListOf<String>("John@example.com", "kim@example.com")
    if ("john@example.com" in emailsList) {
        println("emailsList good!")
    }
    val name = "ahnYeong"
    println("Hello $name")

    val x = Foo()

    when (x) {
        is Foo -> println("this is Foo instance")
        else -> println("??")
    }

    val list2 = listOf("a", "b", "c")
    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["key"])

    for ((k, v) in map) {
        println("$k -> $v")
    }

    for (i in 1..10) {
        print(i)
    }
    println()
    for (i in 1 until 10) {
        print(i)
    }
    println()
    for (x in 2..10 step 2) {
        print(x)
    }
    println()
    for (x in 10 downTo 1) {
        print(x)
    }
    println()
    (1..10).forEach {
        print(it)
    }

    println()
    println()
    val myObject = object : MyAbstractClass() {
        override fun doSomething() {
            println("doSomething Function")
        }
        override fun sleep() {
            println("zzzz")
        }
    }
    myObject.doSomething()
    myObject.sleep()

    val files = File("Test").listFiles()
    println(files?.size)
    println(files?.size ?: "empty")


    val filesSize = files?.size ?: run {
        return
    }
    println(filesSize)
    val values = null
    val email2 = map["email"] ?: throw IllegalStateException("Email is Missing!")
    val email3 = null
    println(email2)

    val emails = ""
    val mainEmails = emails.firstOrNull() ?: "123"
    println(mainEmails)
    val value = "balck"
    val defaultValue = "White"
    val mapped = value?.let { transformValue(it) } ?: defaultValue
    println(mapped)

    val stream = Files.newInputStream(Paths.get("/some/file.txt"))
    stream.buffered().reader().use { reader ->
        println(reader.readText())

    }

    inline fun <reified T: Any> Gson.fromJson(json: JsonElement) : T = this.fromJson(json, T:class.java)


    val myTurtle = Turtle()
    with(myTurtle) {
        penDown()
        for (i in 1..4) {
            println(forward(100.0))
            println(turn(90.0))
        }
        penUp()
    }
}

fun transformValue(color : String) : Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}

object Resource {
    val name = "name"
}

abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
}

fun test() {
    val result = try {
        count
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }
}

class Turtle {
    fun penDown() {
        println("pneDown")
    }
    fun penUp() {
        println("PenUp!")
    }
    fun turn(degress: Double) : Any{
        return degress
    }
    fun forward(pixels: Double) : Any {
        return pixels
    }
}