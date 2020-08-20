package com.application.basicsyntax

fun main() {
    val firstName = "Никита"
    val lastName = "Калистый"
    var height:Int = 183
    val weight = 91.4f
    var isChild:Boolean = if(height < 150 || weight < 40) true else false

    var info:String = "Здравствуйте, $firstName $lastName! Ваш рост $height см, вес $weight кг, это значит, что вы ${if(isChild == false) "не являетесь ребенком" else "ребенок"}"
    println(info)

    height = 145
    isChild = if(height < 150 || weight < 40) true else false
    info = "Здравствуйте, $firstName $lastName! Ваш рост $height см, вес $weight кг, это значит, что вы ${if(isChild == false) "не являетесь ребенком" else "ребенок"}"
    println(info)

}