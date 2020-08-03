package com.application.balticactivity

import kotlin.random.Random

fun main() {
    //если в if есть else, то это выражениие
    val a = if (true) 4 else 0

    //принимает нул, если не соответсвует тому, что написано в takeIf, иначе не нул
    calculateRandomInt()
        .takeIf { it>4 }
    //после этого надо использовать safe call
        ?.let { println("number is greater than 4") }

}

fun calculateRandomInt() = Random.nextInt()