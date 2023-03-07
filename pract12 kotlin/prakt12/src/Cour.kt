import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun main() {
    var cl = Func()



    println("Сколько раз вы хотите вызвать функцию?")
    var count = readLine()!!.toInt()
    count = count-1
    for (i in 0..count) {
        GlobalScope.launch {
            delay(5000L)
            print(cl.func2())
        }
        }
        println(cl.func1())
        runBlocking {
            delay(5000L)
        }





}
