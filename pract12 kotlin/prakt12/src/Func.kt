class Func {
    fun func1()
    {
        try {
            println("Введите первое целое число")
            var one = readLine()!!.toInt()
            println("Введите второе целое число")
            var two = readLine()!!.toInt()
            if (one % 2 == 0 && two % 2 == 0) {
                println("Оба четные")
            } else if (one % 2 != 0 && two % 2 != 0) {
                println("Оба нечетные")
            } else if (one % 2 == 0 && two % 2 != 0) {
                println("Одно четное а другое нет")
            } else if (one % 2 != 0 && two % 2 == 0) {
                println("Одно четное а другое нет")
            }
        }catch (e:Exception){
            println("Неверный ввод")}
    }
    fun func2()
    {
        println("Введите сторону квадрата")
        var st = readLine()!!.toDouble()
        st = st*st
        println("Площадь квадрата - $st")
    }
}