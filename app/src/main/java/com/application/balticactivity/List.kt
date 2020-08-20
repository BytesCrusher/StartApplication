package com.application.balticactivity

fun main() {
    val immutableList = listOf("1", "2", "3")//неизменяемый список, элементы нельзя изменить
    val mutableList = mutableListOf("1", "2", "3", "4")//изменяемый список
    println(immutableList)//печать списка

    immutableList[0]//обращение по индексу
    immutableList.forEach { println(it) }
    val emptyList = emptyList<String>()//создание пустого списка

    mutableList.removeAt(3)//удаление по индексу
    mutableList.add("4")//добавление в конец элемента "4"
    mutableList.add(1,"new 1")//обавление по индексу

    mutableList.addAll(listOf("10", "11"))//добавление в mutableList всех элементов другого списка
    println(mutableList)
}