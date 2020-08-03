package com.application.balticactivity

fun main() {
    val string:String = "string" //тип стринг, не Null абельная
    val nullableString : String? = null //тип стринг, Null абельная переменная

    println(string.length)
    println(nullableString?.length)//safe call - безопасный вызов метода для нулабельной строки

    val lenght:Int = string.length
    val nullableLenght : Int? = nullableString?.length//используем нулабельный int

    nullableString?.reversed()//переворачиваем строку
        ?.find {it == '4'}//ищем символ 4
        ?.isDigit()

    //проверка на null, если не null, выводим длину, иначе пишем что нул
    if (nullableString != null) {
        //здесь автоматически преобразуется нулабельная строка в обычную, !! работает не всегда
        println("String lengh is ${nullableString.length}")
    } else {
        println("String is null")
    }

    //эта запись - сокращение if - else, приведенного выше
    println("String lengh is ${nullableString?.length ?: "incorrect"}") //здесь ?: Элвис-оператор
    //проверяется первый операнд, если он нул, то второй операнд, иначе - ничего не возвращается


    //Scoped function - let
    println("\n\n\n")

    //!!!!!!Если вводят строку и надо проверить, является ли она числом
//    readLine()?.toIntOrNull()
//        ?.let { number ->
//            println("Вы ввели $number")
//        }
//        ?: println("Вы ввели не число!")

    //можно эту же функцию записать используя неявный параметр
//    readLine()?.toIntOrNull()
//        ?.let {
//            println("Вы ввели $it")
//        }
//        ?: println("Вы ввели не число!")


    //функция для вывода длинны любой строки
    printLenght(null)
}

fun printLenght(string:String?) {
    string ?: return
    println("Длинна строки: ${string.length}")


    //not null Not-Null Assertion
    //когда точно знаешь, что строка не будет иметь значение null, не рекомендуется
    //println("Длинна строки: ${string!!.length}")
    
}