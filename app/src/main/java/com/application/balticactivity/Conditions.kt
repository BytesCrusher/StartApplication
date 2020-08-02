package com.application.helloworld

fun main() {
    println(maxInt(a = 10, b = 25))
    println("\n")
    println(getCarType (maxSpeed = 300, hasSportMode = true))
    println("\n")
    println(getDeveloperPosition(experience = 2))
    println(calcPrice(param = 1 > 0))

    //вопрос со звездочкой
    val exp:Int = 2
    val position = when (exp) {
        0->"intern"
        in 1..2->"Junior"
        in 3..4->"Middle"
        else ->"Error"}
    println("This Position is "+position)
}

//Ниже два одинаковых варианта maxInt
fun maxInt(a:Int, b:Int):Int = if (a>b) a else b

//fun maxInt(a:Int, b:Int):Int{
//    val maxValue:Int
//    if (a>b){
//        maxValue=a
//    } else {
//        maxValue = b
//    }
//    return maxValue
//}

fun calculatePrice(BooleanParam: Boolean):Int {
    return if(BooleanParam){
        var intermediateRezult : Int = 254+334
        intermediateRezult + 3
        } else {
        var intermediateRezult : Int = 16+29
        intermediateRezult + 1
    }
}


//вложенные if - else, ниже два примера
//fun getCarType (maxSpeed: Int, hasSportMode:Boolean):String {
//    return when {
//        maxSpeed<20 -> {
//            "Трактор"
//        }
//        maxSpeed <60 -> {
//            "Медленная машина"
//        }
//        maxSpeed<200 -> {
//            "Обычная машина"
//        }
//        else -> {
//            "Быстрая машина"
//        }
//    }
//}

//fun getCarType (maxSpeed: Int):String {
//    return if (maxSpeed<20){
//        "Трактор"
//    } else if(maxSpeed <60){
//        "Медленная машина"
//    } else if (maxSpeed<200){
//        "Обычная машина"
//    } else {
//        "Быстрая машина"
//    }
//}

//======================================

fun getCarType (maxSpeed: Int, hasSportMode:Boolean):String {
    return when {
        maxSpeed<20 -> {"Трактор"}
        maxSpeed <60 -> {"Медленная машина"}
        hasSportMode && maxSpeed<200 -> {"Обычная машина"}
        else -> {"Быстрая машина"}
    }
}

//использование when
fun getDeveloperPosition(experience:Int):String {
    return if (experience<0) {
        "Incorrect experience"
    } else {
        when (experience){
            0-> "Intern"
            in 1..2 -> "Junior"
            in 3..4 -> "Middle"
            else -> "Senior"
        }
    }
}

//Функция со звёздочкой
fun calcPrice(param:Boolean):Int {
    return if (param == true){
        val Rez = 1+2
        Rez + 2
        Rez + 5
    } else {
        val Rez = 2+4
        Rez +100
    }
}

