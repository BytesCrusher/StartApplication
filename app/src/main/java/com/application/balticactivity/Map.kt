package com.application.balticactivity
//map - отображение (ключ-значение, ключи уникальны)
//tree map - в натуральном порядке ключи, sorted - отсортированы, hash - неизвестно
//по умолчанию создается сохраняющий порядок map
fun main() {
    val pair1 = Pair("key", "value") // создание пары
    val pair2 = 1 to 2 //инфиксная функция, такое же создание пары по сути

    println("Вывод первой пары.\nПервый элемент: ${pair1.first}, второй элемент: ${pair1.second}")
    println("Вывод второй пары: $pair2")

    val map = mapOf(
        "Name1" to "+7900",
        "Name2" to "+7950",
        "Name3" to "+7990"
    )

    println("Вывод элемента по ключу: ${map["Name1"]}")//получить значение по ключу
    println("Вывод элемента по ключу: ${map["Name2"]}")

    val map2 = mapOf(
        "Name1" to 1,
        "Name2" to 2,
        "Name3" to 3
    )

    //map, создаваемый через mapOf по умолчанию не мутабельный
    //создание map, в котором можно изменять значения
    map2.toMutableMap()
    val map3 = mutableMapOf(1 to "2456")

    map3[1] = "KiT"
    map3.put(2, "986")
    map3.put(3, "yyy")
    map3.remove(3) //удаление элемента по ключу

    map3.toMap()//здесь мутабельное отображение превращается в немутабельное

    val sortedMap = sortedMapOf(
        4 to "kot",
        5 to "566",
        1 to "kit",
        -5 to "bobric"
    )
    println("Отсортированное по ключам отображение $sortedMap")


    //hash map - не гарантирует порядок
    val hashMap = hashMapOf(
        4 to "kot",
        5 to "hello",
        1 to "kit"
    )
    println("Hash Map $hashMap")

    //обращение по значению
    println(hashMap.keys)
    println(hashMap.values)

    //перебор в цикле
    for (key in hashMap.keys) {
        println("key = ${key}, value = ${hashMap[key]}")
    }

    //деструктивное определение
    hashMap.forEach{ (key, value) ->
        key
        value
    }

}