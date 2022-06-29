data class Personnn(val name : String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Personnn("yeong"), Personnn("dqwe", age = 29))

    val oldset = persons.maxOf { it.age ?: 0 }
    println("oldset: ${oldset}")

    val message : String
    if (true) {
        message = "Success"
    } else {
        message = "Failed"
    }

    val languages = arrayListOf("Java")
    languages.add("kotlin")

    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello $name!")

    println("Hello, ${if (args.isNotEmpty()) args[0] else "Someone"}")



}

fun renderPersonList(persons: Collection<Personnn>) =
    createHTML().table {
        for (person in persons) {
            tr {
                td { person.name }
                td { person.age }
            }
        }
    }

verticalLayout {
    val name = editText()
    button("Say Hello") {
        onClick { toast("Hello , ${name.text}! ") }
    }
}


