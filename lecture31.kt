// Kotlin Scope function
// let / with / run / apply / also

// let -> non null 일 때 실행
// with -> 컨텍스트 내부에서 함수를 호출
// run -> 객체 초기화와 return 값 계산이 필요할 때 주로 사용
// apply -> 값을 반환하지 않고, 객체 구성에 대해 주로 사용
// also -> 객체에 대해 추가적인 작업

fun main() {

    //let
    val str : String? = "hi"

    println(str?.length)
    val length = str?.let {
        println(it)
        it.length
    }
    println(length)

    val str2 : String? = null

    val length2 = str2?.let {
        println(it)
        it.length
    }
    println(length2)
    println()
    println()

    // with
    val numbers = mutableListOf("a", "b", "c", "d")
    println(numbers.first())
    println(numbers.last())

    val firstAndLast = with(numbers) {
        "${first()} ${last()}"
    }
    println(firstAndLast)
    println()
    println()

    // run
    val service = MultiPortService("www.naver.com", 80)
    val result1 = service.query(service.prepareRequest() + " to port ${service.port}")
    println(result1)

    val result2 = service.run {
        port = 8080
        query(prepareRequest() + " to port $port")
    }
    println(result2)

    // apply

    var tester1 = Personn("Tester1")
    println(tester1)

    tester1.age = 20
    tester1.city = "seoul"
    println(tester1)

    val tester2 = Personn("Tester2").apply {
        age = 21
        city = "Busan"
    }
    println(tester2)
    println()
    println()

    // also

    var numbers2 = mutableListOf(1, 2, 3, 4)
    println("$numbers2 here add 5")
    numbers2.add(5)
    println(numbers2)

    val numbers3 = mutableListOf(1,2,3,4)
    numbers3.also {
        println("$numbers3 here add 5")
    }.add(5)
    println(numbers)


}

data class Personn(
    var name : String,
    var age : Int = 0,
    var city : String = ""
)

class MultiPortService(var url : String, var port : Int) {
    fun prepareRequest() : String = "default request url ${url}"
    fun query(request : String) = "return query ${request}"
}


