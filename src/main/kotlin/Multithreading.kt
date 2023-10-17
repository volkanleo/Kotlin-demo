
import kotlinx.coroutines.*

fun main() {
    /* GlobalScope.launch {
        delay(2000L)
        println("World!")
    }
    print("Hello, ")
    Thread.sleep(3000L)
}
*/

    println("Program execution will now block")

    runBlocking {
        launch {
            delay(1000L)
            println("Task from runBlocking")
        }

        GlobalScope.launch {
            delay(500L)
            println("Task from GlobalScope")
        }

        coroutineScope {
            launch {
                delay(1500L)
                println("Task from coroutineScope")
            }
        }
    }
    println("Program execution will now continue")
}
// A thread is a sequence of execution
// Sequential programming - all instructions are executed in order
// Parallel programming - sets of instructions are executed in parallel
