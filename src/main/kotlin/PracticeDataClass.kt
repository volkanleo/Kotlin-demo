fun main() {
    val customers = arrayListOf<Customer>()

    customers.add(Customer("Volkan", "Volkan@gmail.com,", 50))
    customers.add(Customer("Caylan", "Caylan@gmail.com", 20))
    customers.add(Customer("Java", "java@gmail.com", 5))
    println(customers)
    val newCustomer = customers[1].copy(email = "test@trst.comm")
    customers.add(newCustomer)
    println(customers)
    sendEmail(customers)
}

fun sendEmail(customer: ArrayList<Customer>) {
    customer.forEach { println("Sending an email to ${it.email}") }

    println(Colors.YELLOW.ordinal)
    println(Colors.YELLOW.name)
    println(Colors.YELLOW.timesUsed)
}

data class Customer(
    val name: String,
    val email: String,
    val productBought: Int,
)

enum class Colors(val timesUsed: Int) {
    RED(30),
    BLUE(500),
    YELLOW(40),
}
