// overLoading


fun main() {
    val c = Calculator()
    c.sumNumberTwo(2, 3)
    c.sumNumberThree(3, 4, 5)
    c.sumNumber(1, 2)
    c.sumNumber(1,2,3)
    c.sumNumber(1,2,3,4)
    c.sumNumber("im", "gruit")
}

class Calculator() {

    fun sumNumberTwo(a: Int, b : Int)  {
        println(a + b)
    }
    fun sumNumberThree(a: Int, b: Int, c: Int) {
        println(a + b + c)
    }
    fun sumNumber(a: Int, b: Int) {
        println(a + b)
    }

    fun sumNumber(a: Int, b: Int, c: Int) {
        println(a + b + c)
    }

    fun sumNumber(a: Int, b: Int, c: Int, d: Int) {
        println(a+b+c+d)
    }

    fun sumNumber(a: String, b: String) {
        println(a + b)
    }
}