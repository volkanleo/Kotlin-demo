fun main() {
    letFunction()
    val name = readlnOrNull()
    name?.let { println("Your name is $name") }
}

private fun letFunction() {
    val animals = listOf("cat", "dog", "mouse", "bear")
    animals.map { it.length }
        .filter { it > 3 }
        .let {
            println(it)
            println("Size of list is ${it.size}")
        }
    // .let(::println)
}
