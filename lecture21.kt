
// abstract class

fun main() {

    Bike().wheel()
    Bike().engine()
    Bmw().wheel()
    Bmw().engine()
    Benz().wheel()
    Benz().engine()
}

open class Car() {

    open fun wheel() {
        println("wheel")
    }
    open fun engine() {
        println("engine")
    }
}

class Bike() : Car() {

    override fun wheel() {
        println("bike")
    }

    override fun engine() {
        println("bike not have engine")
    }
}

abstract class Car2() {

    abstract fun wheel()
    abstract fun engine()
}

class Bmw() : Car2() {

    override fun wheel() {
        println("Bmw")
    }

    override fun engine() {
        println("Bmw Engine")
    }
}

class Benz() : Car2() {

    override fun wheel() {
        println("benz")
    }

    override fun engine() {
        println("benz Engine")
    }
}