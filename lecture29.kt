// 지연초기화
// lateinit / lazy

fun main() {

    var justString : String = "anything"
    println(justString)

    justString = "change"
    println(justString)

    lateinit var lateString : String // -> 서버에서 데이터를 받아와야 할 때 자주 사용
    lateString = "change2"
    println(lateString)

    val lazyString : String by lazy {
        println("ddd")
        "lazyTestString"
    }

    println(lazyString)
    //println(lazyString)





}