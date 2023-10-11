fun main() {
    val name = "Volkan"
    println(name.slim())

    println(name.betterLength)

    println("Test".getCustomName())
    println(3.getCustomName())
    println(3.5F.getCustomName())

    println("----------")

    val list = arrayListOf(3, 5, 6, 7, 3, 2, 7, 8)

    println(list.howMany())
    println("----------")

    Book.printMe()

    String.getClassType()

    Double.printClassName()
}

// Extension function
fun String.slim() = this.substring(1, length - 1)

// Extension properties

val String.betterLength: Int
    get() {
        println("Getting the better length")
        return 200
    }

fun String.getCustomName() = "A string of characters"

fun Int.getCustomName() = "A integer number"

fun Float.getCustomName() = "A floating point number"

fun ArrayList<Int>.howMany() = "This list contains $size elements"

class Book {
    companion object {}
}

fun Book.Companion.printMe() {
    println("Book has been printed")
}

fun String.Companion.getClassType() {
    println("This is a String class")
}

fun Double.Companion.printClassName() {
    println("this is a Dobule class")
}
