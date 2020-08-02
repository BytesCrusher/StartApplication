package com.application.balticactivity

fun main() {
    print("Введите число: ")
    val n = readLine()?.toIntOrNull() ?: return
    println("Вы ввели число: $n")

    println("Сумма с помощью while = ${calculateSumByWhile(n)}")
    println("Сумма с помощью while и return= ${calculateSumByWhileInfiniteReturn(n)}")
    println("Сумма с помощью while и break= ${calculateSumByWhileInfiniteBreak(n)}")
    //printEvenNumbers(n)

    println("Сумма с помощью Do while: ${calculateSumDoWhile(n)}")
    println("Сумма с помощью For: ${calculateSumFor(n)}")

    printChars()
    printEvenNumberFor(n)

}

//нахождение суммы с While
fun calculateSumByWhile(n:Int):Long {
    var sum:Long = 0
    var currentNumber:Int = 0
    while (currentNumber <= n){
        //println("Iteration $currentNumber")
        sum += currentNumber
        currentNumber++
    }
    return sum
}

//бесконечный цикл и return по условию
fun calculateSumByWhileInfiniteReturn(n:Int):Long {
    var sum:Long = 0
    var currentNumber:Int = 0
    while (true){
        if (currentNumber>n) return sum
        sum += currentNumber
        currentNumber++
    }
}

//бесконечный цикл и break по условию
fun calculateSumByWhileInfiniteBreak(n:Int):Long {
    var sum:Long = 0
    var currentNumber:Int = 0
    while (true){
        if (currentNumber>n) break
        sum += currentNumber
        currentNumber++
    }
    return sum
}

//остаток от деления, continue
fun printEvenNumbers(n:Int):Unit {
    var currentNumber = 0
    while (currentNumber<=n) {
        val numberBefore :Int = currentNumber
        currentNumber++
        if (numberBefore % 2 == 1) continue
        println(numberBefore)
    }
}

//использование do while
fun calculateSumDoWhile(n:Int):Long {
    var sum:Long = 0
    var currentNumber:Int = 0
    do {
        //println("Iteration $currentNumber")
        sum+=currentNumber
        currentNumber++
    } while (currentNumber<=n)
    return sum
}


//цикл for
fun calculateSumFor(n:Int):Long {
    var sum:Long = 0
    val range = 0..n // здесь n включается в диапазон
    //var range = 0 until n // здесь n не включается в диапазон

    for (currentNumber : Int in range) {
        sum += currentNumber
    }
    return sum
}

//вывод каждого элемента строки
fun printChars() {
    for (currentCh in "String"){
        println(currentCh)
    }
}

//диапазоны
fun printEvenNumberFor(n: Int) {
    val range:IntProgression = 0..n step 2 //val range:IntProgression = 0 down to n step 2
    for (currentNumber in range) {
        println(currentNumber)
    }
}