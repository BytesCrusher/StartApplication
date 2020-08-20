package com.application.functions
import kotlin.math.sqrt

fun main() {
    val solutionSum = solveEquation(a = 3, b = -14, c = -5)
    println(if (solutionSum is String) solutionSum else "Сумма корней: $solutionSum")
}

fun solveEquation(a:Int, b:Int, c:Int):Any {
    val result:Any
    result = if (a!=0) {
        val discriminant = b*b - (4*a*c) //рассчет дискриминанта
        if (discriminant<0){
            "Ошибка! Дискриминант меньше нуля, корней нет!" //ошибка, если дискриминант меньше нуля
        } else {
            //рассчет корней, если дискриминант >= 0
            val x1:Double = (-b+(sqrt(discriminant.toDouble())))/(2*a)
            val x2:Double = (-b-(sqrt(discriminant.toDouble())))/(2*a)
            println("Получены корни: x1 = $x1, x2 = $x2")
            x1 + x2 //присвоение result суммы корней
        }
    } else {
        "Ошибка! Значение 'а' равно нулю!" //ошибка, если было передано а = 0
    }
    return result
}