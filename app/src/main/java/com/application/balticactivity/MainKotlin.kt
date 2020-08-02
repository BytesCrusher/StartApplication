package com.application.helloworld

//точка входа в программу
fun main() {
    println("HelloWorld\n")
    //val - неизменяемая переменная, var - изменяемая

    //создание и вывод строки
    val helloWorldString: String = "Hello world"
    println(helloWorldString+"\n")

    //создание массива, добавление элементов в массив, вывод на экран
    val array = arrayListOf(1)
    array.add(2)
    array.add(3)
    println(array)

    //числовые переменные
    val shortVal:Short=123
    val intVal = 25000
    val longVal = 256256L

    val floatVal = 245.666666f
    val doubleVal = 343.777777777

    //логический тип
    val booleanVal1:Boolean = true
    val booleanVal2:Boolean = false

    val booleanVal3 = booleanVal1 || booleanVal2 //логическое или
    val booleanVal4 = booleanVal1 && booleanVal2 //логическое и
    val booleanVal5 = (booleanVal1).not() && booleanVal2 //логическое отрицание

    val isEqual = intVal == 5 //выдаст результат равно ли intVal числу 5
    println("intVal = 5 это " + isEqual + "\n")

    //символ
    val charVal:Char = '2'
    val stringVariable:String = "This is line of text"
    val multyStringVal = """
        Это многострочная строка
        в которую можно записать много текста
    """
    println(multyStringVal+"\n")

    //работа внутри строки, вставка значений
    val name = "Nikita"
    val lastName = "Kalistyy"
    val humanReadableName = "My name is ${name} and last name is ${lastName}"
    println(humanReadableName+"\n")

    //условное выражение прямо внутри строки
    val isMale = true
    val humanReadableExpanded = "${if(isMale == true) "His" else "Her"} name is ${name} and last name is ${lastName}"
                                //здесь можно убрать ==true     при вставке простых переменных можно не ставить { }
    println(humanReadableExpanded+"\n")

    //Перевод типов
    3456f.toDouble()
    1523.toString()
    "45356".toInt()

}