fun main() {
    val value = "Test String"
    if (value is String) {
        println("The string havs ${value.length}  characters")
    }

    val myCar: Carr = getCar()

    if (myCar !is AUDI) {
        println("This is not my favorite brand")
    }
}

open class Carr
class AUDI : Carr()

fun getCar(): Carr = Carr()
