

fun main() {
    val myBox = Box<String>()
    myBox.display("Contents")

    val carBox = Box<Test>()
    carBox.display(Test())

    val newBox = NewBox<String, Int>()
    newBox.display("Test", 2)
}

class Box<T> {
    fun display(item: T) {
        println(item)
    }
}

class Test

class NewBox<T, U> {
    fun display(item: T, item2: U) {
        println(item)
        println(item2)
    }
}

class Boxx<T>(val item: T)
val intBox = Boxx(42)
val stringBox = Boxx("Hello, Kotlin!")

fun <T : Comparable<T>> maxOf(a: T, b: T): T {
    return if (a > b) a else b
}
val maxInt = maxOf(5, 10)
val maxString = maxOf("apple", "banana")

fun printLengths(list: List<Any>) {
    for (item in list) {
        if (item is String) {
            println(item.length) // Smart cast to String
        }
    }
}


val mixedList = listOf(1, "two", 3, "four")
val strings = mixedList.filterIsInstance<String>() // Returns a list of strings

fun printLength(list: List<Any>) {
    for (item in list) {
        if (item is String) {
            println(item.length) // Smart cast to String
        }
    }
}

interface Producer<out T> {
    fun produce(): T
}


fun <T> findFirstMatching(list: List<T>, condition: (T) -> Boolean): T?
        where T : Comparable<T>, T : Number {
    return list.firstOrNull { condition(it) }
}
