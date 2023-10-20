import kotlinx.coroutines.*
var functionCalls = 0

fun main() {
/*    runBlocking {
        launch(CoroutineName("myCoroutine")) {
            println("This is run from ${coroutineContext.get(CoroutineName.Key)}")
        }

        GlobalScope.launch {
        }
    }*/

    GlobalScope.launch { completeMessage() }
    GlobalScope.launch { imporoveMessage() }
    print("Hello, ")

    Thread.sleep(2000L)
    println("There have been $functionCalls calls so far")
}

suspend fun completeMessage() {
    delay(500L)
    println("Word!")
    functionCalls++
}

suspend fun imporoveMessage() {
    delay(1000L)
    println("suspend function are cool")
    functionCalls++
}
