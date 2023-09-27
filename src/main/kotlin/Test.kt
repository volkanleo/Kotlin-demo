
fun main() {
    println("Please enter the distance you ran in km ")

    val input = readln()

    try {
        val distanceKm = input?.toDouble()

        println("$distanceKm km is ${distanceKm?.times(0.62)} miles")
        if (distanceKm != null) {
            println(distanceKm * 0.62)
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
