
// class

fun main() {
    val test = Test()
    test.a
    println(Test().a)

    val test2 = Test2("abc")
    println(test2.b)

    val test3 = Test3()
    test3.test3Fun()

    val myinfo = MyInfo()
    println(myinfo.getMyAge())
    println(myinfo.getMyName())
    println(myinfo.getMyLocation())

    val dog = Dog("part", 20)
    val dog2 = Dog("partf", 22)
    println(dog.getMyDogInfo())
    println(dog2.getMyDogInfo())

    initTest().testInitFun()
    InitialValue("bak", 23)
    InitialValue("asd")
}

class Test{
    val a = "abc"
}

class Test2(str: String) {
    val b = str
}

class Test3() {

    fun test3Fun() {
        println("test3Fun")
    }
}

class MyInfo() {

    fun getMyAge() : Int {
        return 23
    }
    fun getMyName() : String {
        return "Ahdndosiad"
    }
    fun getMyLocation() : String {
        return "Ansan"
    }
}

class Dog(name : String, age : Int) {
    val dogName = name
    val dogAge = age

    fun getMyDogInfo() : String {
        return "${dogName} : ${dogAge}"
    }
}

class initTest() {

    init {
        println("contructor")
    }
    fun testInitFun() {
        println("testInitFun")
    }
}

class InitialValue (name : String, age : Int = 20) {

    init {
        println(name)
        println(age)
    }
}
