// enum(enumerations) Class

fun main() {

    println(Direction.NORTH)
    Direction.values().forEach {
        println(it)
    }

    CustomerType.values().forEach {
        println(it)
    }

    val direction = Direction.EAST

    when (direction) {
        Direction.NORTH -> {
            println("N")
        }
        Direction.SOUTH -> {
            println("S")
        }
        Direction.EAST -> {
            println("E")
        }
        Direction.WEST -> {
            println("W")
        }
    }

    val color = Color.RED
    when (color) {
        Color.RED -> {println(Color.RED.rgb)}
        Color.BLUE -> {println(Color.BLUE.rgb)}
        Color.GREEN -> {println(Color.GREEN.rgb)}
    }
    println(Device.DEVICE_ON.status)
    Device.DEVICE_ON.status = "OFF"
    println(Device.DEVICE_ON.status)
}

enum class Device(var status : String) {
    DEVICE_ON("ON"),
    NETWORK("OFF"),
    LOCATION("SEOUL"),
}

enum class Color(val rgb : Int) {
    RED(0xFF0000),
    GREEN(0x00FF),
    BLUE(0x0000FF),
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class CustomerType {
    A, B, C, D,VIP
}