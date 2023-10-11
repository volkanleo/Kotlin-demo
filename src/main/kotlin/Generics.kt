

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
