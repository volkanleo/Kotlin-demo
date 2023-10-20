import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val job1 = launch {
            delay(3000L)
            println("Job1 launched")
        }

        delay(500L)
        job1.invokeOnCompletion { println("Job1 completed") }
        println("Job1 will be canceled")
        job1.cancel()
    }
}
