import kotlin.random.Random

fun main() {
    for (i in 1..3) {
        println("$i.")
        val service = getNetworkService()
        (service as? FTPService)?.transferFile()
    }

    lateinit var networkService: String
    networkService = getNetworkServices()
    println(networkService)

    val myCountry = Country().apply { setName("Turkey") }

    println("Hello $myCountry !")

    val someLargeVariable: String by lazy { "A Large value" }

    if (Random.nextInt() % 2 == 0) {
        println(someLargeVariable)
    }
}

open class NetworkService

class FTPService : NetworkService() {
    fun transferFile() {
        println("Transferin a file via FTP")
    }
}

fun getNetworkService(): NetworkService {
    return if (Random.nextInt() % 2 == 0) {
        NetworkService()
    } else {
        FTPService()
    }
}

fun getNetworkServices() = "Network service"

class Country {
    private lateinit var name: String
    fun setName(name: String) {
        this.name = name
    }
    fun getName() = name
}
