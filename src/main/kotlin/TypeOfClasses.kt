

fun main() {
    val myUser = User("Volkan", "Ozturk@gmail.com", "sdfsdfsdf")
    val myUser2 = User("Volkan", "Ozturk@gmail.com", "sdfsdfsdf")
    println(myUser == myUser2)
    println(myUser.toString())
    val myNewUser = myUser.copy(email = "volkan@gmail.com")
    println(myNewUser.toString())
    //
    val myRegularUser = RegularUser("Volkan", "Ozturk@gmail.com", "sdfsdfsdf")
    val myRegularUser2 = RegularUser("Volkan", "Ozturk@gmail.com", "sdfsdfsdf")
    println(myRegularUser == myRegularUser2)
    println(myRegularUser.toString())

}

data class User(
    val name: String,
    val email: String,
    val password: String,
)

class RegularUser(
    val name: String,
    val email: String,
    val password: String,
)
