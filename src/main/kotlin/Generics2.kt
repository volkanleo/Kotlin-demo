fun main() {
    val chef1 = Chef<Applee>()
    chef1.cook(Applee())

    val chef2 = Chef<Banana>()
    chef2.cook(Banana())

    val printer1 = Printer<Set<String>>()
    printer1.iterate(hashSetOf("Alice", "Volkan", "XXX"))

    val printers = Printer<List<String>>()
    printers.iterate(listOf("Alice", "Volkan", "XXX"))
}

abstract class Fruitt {
    abstract fun peel()
}

class Applee : Fruitt() {
    override fun peel() {
        println("Peeling the apple")
    }
}

class Banana : Fruitt() {
    override fun peel() {
        println("Peeling the banana")
    }
}

class Chef<T : Fruitt> {
    fun cook(item: T) {
        item.peel()
    }
}

class Printer<T : Collection<String>> {
    fun iterate(collection: T) {
        collection.forEach({ println(it.toString()) })
    }
}
