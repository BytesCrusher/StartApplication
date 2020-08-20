package com.application.balticactivity
//Array - количество элементов не может изменяться
fun main() {
    val array = arrayOf("Петров", "Котин", "Скотин", "Страшный", "Калистый") + arrayOf("Сколеистый")

    //for (user in array) { println(user) }

    //array.forEach { println(it)  }

    array.forEachIndexed{index, user -> println("Index = $index, element = $user")}//вывод индекса и элемента массива

    //первый и последний элемент массива
    val firstElement = array[0]
    val lastElement = array[array.lastIndex]

    //изменение элемента массива
    array[0] = "Новый Петров"
    array.forEachIndexed{index, user -> println("Index = $index, element = $user")}//вывод индекса и элемента массива

    val emptyArray = emptyArray<String>() //создание пустого массива

    //создание массива конструктором массивов
    val largeArray = Array(100) {index -> "User #$index"}
    largeArray.forEach{ println(it)}


}