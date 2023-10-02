import kotlin.random.Random

fun main() {
    // letFunction()
    // withFunction()
    // runFunction()
    // applyFunction()
    // alsoFunction()
    takeIfFunction()
    // takeUnlessFunction()
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

private fun applyFunction() {
    val account = Account().apply {
        name = "User"
        amount = 66F
        acc_no = 23455
        insert(4, "Test", 66F)
    }
    println(account)
}

private fun alsoFunction() {
    Account().apply {
        name = "User"
        amount = 66F
        acc_no = 23455
        insert(4, "Test", 66F)
    }
        .also {
            println("The car object is created!")
            println("${it.name}")
        }
}

private fun takeIfFunction() {
    for (i in 1..10) {
        val number = Random.nextInt(100)
        number.takeIf { it % 2 == 0 }
            ?.let { println("Number is even $number") }
    }
}

private fun takeUnlessFunction() {
    val number = Random.nextInt(100)
    val oddOrNull = number.takeUnless { it % 2 == 0 }
    println(" Random number is $number")
    println(oddOrNull)
}
