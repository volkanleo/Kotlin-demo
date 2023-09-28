fun main() {
    // letFunction()
    // withFunction()
    runFunction()
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

private fun withFunction() {
    with(Account()) {
        name = "Volkan"
        amount = 5F
        insert(34534534, "Volkann", 666F)
        println("Account info")
    }
}

private fun runFunction() {
    Account().run {
        name = "Tom"
        insert(99999, "Vol", 999F)
        this
    }
    run {
        val account = Account()
        account.name = "Sam"
        account.amount = 555F
        account.insert(1111, "Cay", 11F)
    }
}
