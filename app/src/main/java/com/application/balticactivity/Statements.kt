package com.application.balticactivity

import kotlin.random.Random

fun main() {
    //если в if есть else, то это выражениие
    val a = if (true) 4 else 0

    val g = when {
        false -> "test"
        else -> "else"
    }

    //takeIf принимает значение нул, если не соответсвует тому, что написано в takeIf, иначе не нул
    calculateRandomInt()
        .takeIf { it>4 }
        //после этого надо использовать safe call, т.к. возможен null
        ?.let { println("number is greater than 4") }

}

fun calculateRandomInt() = Random.nextInt()