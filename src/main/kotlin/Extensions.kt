fun main() {
    val name = "Volkan"
    println(name.slim())

    println(name.betterLength)
}

// Extension function
fun String.slim() = this.substring(1, length - 1)

// Extension properties

val String.betterLength: Int
    get() {
        println("Getting the better length")
        return 200
    }
