
// Data Class

fun main() {

    val justDog = JustDog("part", 21)
    println(justDog.name)
    println(justDog.age)
    println(justDog.toString())

    val dataDog = DataDog("partF", 15)
    println(dataDog.name)
    println(dataDog.age)
    println(dataDog.toString())

    val dataDog2 = dataDog.copy(name = "partG")
    println(dataDog2.toString())
}

class JustDog(var name : String, var age: Int)

data class DataDog(var name : String, var age : Int)

