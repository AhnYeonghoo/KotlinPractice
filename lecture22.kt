// Interface

fun main() {

    Kia().wheel()
    Kia().engine()
    Kia2().autoDriving()
    Benz2().autoDriving()
    Benz2().autoParking()
}

interface Behicle {

    fun wheel()
    fun engine()
}

class Kia() : Behicle {

    override fun wheel() {
        println("kia wheel")
    }

    override fun engine() {
        println("kia engine")
    }

}

interface CarAutoDriving {
    fun autoDriving()
}

interface CarAutoParking {
    fun autoParking()
}

abstract class Behicle2() {

    abstract fun wheel()
    abstract fun engine()

}

class Kia2() : Behicle2(), CarAutoDriving, CarAutoParking {

    override fun wheel() {
        println("kia2 wheel")
    }

    override fun engine() {
        println("kia2 engine")
    }
    override fun autoDriving() {
        println("kia2 autoDriving")
    }

    override fun autoParking() {
        println("kia2 autoParking")
    }
}

class Benz2() : Behicle2(), CarAutoDriving, CarAutoParking {

    override fun wheel() {
        println("benz2 wheel")
    }
    override fun engine() {
        println("benz2 engine")
    }
    override fun autoParking() {
        println("benz2 parking")
    }
    override fun autoDriving() {
        println("benz2 autoDriving")
    }
}