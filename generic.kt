open class Fruit
class Apple : Fruit()
class Banana : Fruit()

fun receiveFruits(fruits: List<Fruit>) {
    println("Number of fruits: ${fruits.size}")
}

fun copyFromTo(from: Array<out Fruit>, to: Array<Fruit>) {
    for (i in from.indices) {
        to[i] = from[i]
    }
}

fun copyFromTo2(from: Array<out Fruit>, to: Array<in Fruit>) {
    for (i in from.indices) {
        to[i] = from[i]
    }
}

fun <T: AutoCloseable> useAndClose(input: T) {
    input.close()
}

fun <T> useAndClose2(input: T) where T: AutoCloseable, T: Appendable {
    input.append("there")
    input.close()
}

fun printValues(values: Array<*>) {
    for (value in values) {
        println(value)
    }
    // values[0] = values[1] -> Error!
}

fun <T> findFirst(fruits: List<Fruit>, ofClass: Class<T>): T {
    val selected = fruits.filter { fruit -> ofClass.isInstance(fruit) }
    if (selected.isEmpty()) {
        throw RuntimeException("Not found")
    }
    return ofClass.cast(selected[0])
}

inline fun <reified T> findFirst2(fruits: List<Fruit>): T {
    val selected = fruits.filter { fruit -> fruit is T }
    if (selected.isEmpty()) {
        throw RuntimeException("Not Found")
    }
    return selected[0] as T
}
fun main() {
    //val fruits: Array<Apple> = arrayOf(Apple())
    //receiveFruits()
    val fruits: List<Apple> = listOf(Apple(), Apple())
    receiveFruits(fruits)

    val fruitsBasket1 = Array<Fruit>(3) { _ -> Fruit() }
    val fruitsBasket2 = Array<Fruit>(3) { _ -> Fruit() }
    copyFromTo(fruitsBasket1, fruitsBasket2)

    val fruitsBasket3 = Array<Apple>(3) { _ -> Apple() }
    val fruitsBasket4 = Array<Fruit>(3) { _ -> Fruit() }
    copyFromTo(fruitsBasket3, fruitsBasket4)

    val fruitsBasket5 = Array<Apple>(3) { _ -> Apple() }
    val fruitsBasket6 = Array<Any>(3) { _ -> Any() }
    copyFromTo2(fruitsBasket5, fruitsBasket6)

}

