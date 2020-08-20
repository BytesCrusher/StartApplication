package com.application.balticactivity

fun main() {
    //неизменяемые множества
    val immutableSet = setOf(1, 2, 3, 4, 5, 6, 7, 8, 2)
    println(immutableSet)

    //массивы, списки, множества и отображения можно вычитать, складывать и пересекать и т.д.
    val unionSet = setOf(1,2,6,7,8).union(setOf(3, 4, 5))
    println("Объединение множеств: $unionSet")

    val subtractsSet = setOf(1, 2, 3, 4, 5, 6, 7, 8).subtract(setOf(1,2,6,8))
    println("Вычитание множеств: $subtractsSet")

    val insertionSet = setOf(1, 2, 3, 4, 5, 6, 7, 8).intersect(setOf(1,2,6,8))
    println("Пересечение множеств: $insertionSet")

    val naturalSet = sortedSetOf(1, 18, -5, 4, 11, 0, -3, 8)
    println("Сортированное множество: $naturalSet")

    val descendingSet = sortedSetOf(1, 18, -5, 4, 11, 0, -3, 8)
    println("Сортированное наоборот множество: ${descendingSet.descendingSet()}")

    //изменяемые множества
    val mutuableSet = setOf(1, 2, 3, 4, 5, 6, 7, 8).toMutableSet()
    val mutableSet2 = mutableSetOf(1, 4, 2, 7, 5, 9, 11)

    //создание hash set
    val hashSet = hashSetOf(1,2,3)
    hashSet.add(1)

    //содержит ли множество указанный элемент
    var hasElementInHashSet:Boolean = hashSet.contains(1) // вернет есть ли элемент во множестве
    hasElementInHashSet = 1 in hashSet
    println("Есть ли этот элемент внутри hash set? - $hasElementInHashSet")


}