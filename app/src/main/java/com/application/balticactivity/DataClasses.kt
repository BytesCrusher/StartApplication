package com.application.balticactivity

import com.application.balticactivity.oop.Car

fun main() {
    val user1 = User("Nikita", "N")
    user1.innerState = "state1"
    val user2 = User("Kot", "K")
    user2.innerState = "state1"

    println("user1 = user2: ${user1 == user2}")

    //создание копии объекта
    val user3 = user1.copy(lastName = "copiedLastName")
    println("user3 information = ${user3}")
    println("user1 = $user1")//вызываем текстовое представление класса из метода toString

//Деструктивное определение
    //например нужен пользователь только единожды, и только для того, чтобы вывести инфу о нем на экран
    //такой класс нужен будет лишь единожды, и его можно упростить

    val user5 = User(name = "name276", lastName = "lsddfssdf")
    println("user5 name = ${user5.name}, last name = ${user5.lastName}")

    val (name, lastName) = User(name = "name276", lastName = "lsddfssdf")
    println("new user5 name = ${name}, last name = ${lastName}")

    //если есть список пользователей
    val users = listOf(
        user1,
        user2,
        user3,
        user5
    )

    //деструктивное определение
    //не обязательно ниже называть переменную name, если в классе она названа name
    users.forEach{(name, lastName) -> println("$name $lastName")}

//функции componentN
    //позволяют избавится от указания объекта при выводе объекта
    val user6 = User(name = "name", lastName = "lastName")
    val name1 = user6.component1()//выдает первое свойство из конструктора
    val lastName1 = user6.component2()//выдает второе свойство из конструктора

    println("user6 name = ${name1}, last name = ${lastName1}")

    //разложение класса на переменные, для этого пришлось описать методы component1 и 2
    val (wheelCount, doorCount) = Car(wheelCount = 6, doorCount = 3, maxSpeed = 140)

    //то же самое при использовании map
    val map = mapOf(
        1 to "1",
        2 to "2",
        3 to "3"
    )

    for ((key, value) in map){
        key
        value
    }
}