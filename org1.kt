import kotlin.*
import kotlinx.coroutines.*

suspend fun main() {

    val name : String = "Stranger"
    println("Hi, $name!")
    print("Current count:")
    for (i in 0..10) {
        print(" $i")
    }



//    var start = System.currentTimeMillis()
//    coroutineScope {
//        for (i in 1..10) {
//            launch {
//                delay(3000L - i * 300)
//                log(start, "Countdonw: $i")
//            }
//        }
//    }
//    log(start, "Liftoff!")

    val sam = RestaurantCustomer("Sam", "Mixed salad")
    sam.greet()
    sam.order()
    sam.eat()
    sam.pay(10)

    println()
    println()

    val frequentSender = messages
        .groupBy(Message::sender)
        .maxByOrNull { (_, messages) -> messages.size}
        ?.key
    println(frequentSender)

    val senders = messages
        .asSequence()
        .filter { it.body.isNotBlank() && !it.isRead }
        .map(Message::sender)
        .distinct()
        .sorted()
        .toList()
    println(senders)
}

fun log(start : Long, msg : String) {
    println("${msg} " + "(on ${Thread.currentThread().name})" +
    "after ${(System.currentTimeMillis() - start)/1000F}s")

}

abstract class Person3(val name: String) {
    abstract fun greet()
}

interface FoodConsumer {
    fun eat()
    fun pay(amount: Int) = println("Delicious! Here's ${amount} bucks!")
}

class RestaurantCustomer(name : String, val dish: String) : Person3(name), FoodConsumer {
    fun order() = println("$dish, please!")
    override fun eat() = println("*Eats $dish*")
    override fun greet() = println("It`s me, $name")
}

data class Message (
    val sender: String,
    val body: String,
    val isRead : Boolean = false,
)

val messages = listOf(
    Message("Ma", "Hey! Where are you!"),
    Message("Adma", "Everything going according to plan today" ),
    Message("Ma", "Please reply. I`ve lost you!")
)

