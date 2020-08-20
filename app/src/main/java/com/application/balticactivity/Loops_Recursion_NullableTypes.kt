package com.application.loops_recursion_nullabletypes

import kotlin.math.abs

fun main() {
    var cycle = true
    var amountOfNumbers:Int = 0
    while(cycle) {
        println("Введите количество чисел: ")
        readLine()?.toIntOrNull()
            ?.let {
                if (it>0) {
                    println("Вы ввели число $it")
                    println("Введите ниже $it чисел\n")
                    amountOfNumbers = it
                    cycle = false
                }
            }
            ?: println("Вы ввели не целое число! Повторите ввод!")
    }

    var sumEnteredNumbers:Int = 0
    var numberOfPositiveNumbers: Int = 0
    var i:Int=0
    while (i < amountOfNumbers) {
        println("Введите число ${i+1}: ")
        readLine()?.toIntOrNull()
            ?.let {
                if (it>0){
                    numberOfPositiveNumbers++
                }
                sumEnteredNumbers+=it
                i++
            }
            ?: println("Вы ввели не целое число! Повторите ввод числа ${i+1}:")
    }

    println("Ввод окончен.\nВы ввели $numberOfPositiveNumbers положительных чисел.")
    println("Сумма введенных вами чисел равна $sumEnteredNumbers\n")

    cycle = true
    var secondNumberForNOD:Int=0
    while(cycle) {
        println("Введите целое число для вычисления НОД с полученной суммой: ")
        readLine()?.toIntOrNull()
            ?.let {
                println("Вы ввели число $it")
                secondNumberForNOD = it
                cycle = false
            }
            ?: println("Вы ввели не целое число! Повторите ввод!")
    }

    println("НОД для $sumEnteredNumbers и $secondNumberForNOD равен : ${gcd(sumEnteredNumbers, secondNumberForNOD)}")
}

tailrec fun gcd(a: Int, b: Int): Int {
    return if (b == 0) abs(a) else gcd(b, a % b)
}
