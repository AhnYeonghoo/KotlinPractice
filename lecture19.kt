// 상속


fun main() {
    val j = Job1()
    val j2 = Job2()
    val j3 = Job3()
}

open class AllJobs() {
    init {
        println("Im Worker")
    }
}
class Job1() : AllJobs() {
    init {
        println("coder")
    }
}

class Job2() : AllJobs() {
    init {
        println("designer")
    }
}

class Job3() : AllJobs() {
    init {
        println("im baksu")
    }
}