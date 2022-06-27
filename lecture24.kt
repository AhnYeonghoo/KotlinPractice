// Nested class
// Inner class

// 중첩클래스 -> 객체지향 / 캡슐화
// 내부 클래스 -> RecylerView

fun main() {
    val test1 = Test1.TestNestedClass()
    test1.testFun1()

    val test22 = Test22().Test2InnerClass()
    test22.testFun2()

}

class Test1 {
    val tempText1 = "tempText1"
    class TestNestedClass {
        fun testFun1() {
            println("TestFun1")
        }
    }
}

class Test22 {
    val tempText2 = "tempText2"
    inner class Test2InnerClass {
        fun testFun2() {
            println("TestFun2")
            println(tempText2)
        }
    }
}