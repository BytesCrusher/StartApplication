package com.application.balticactivity

fun main() {
    print("Введите число: ")
    val n = readLine()?.toIntOrNull() ?: return
    println("Вы ввели число: $n")

    println(calculateSumRecursive(n))
}

//рекурсивная функция с базой
//чтобы использовать tailrec нужно чтобы рекурсивный вызов был последней строкой функции
tailrec fun calculateSumRecursive(n:Int, accum:Long = 0) :Long {
    return if (n==0) {
        accum
    } else {
        calculateSumRecursive(n-1, accum + n)
    }
}