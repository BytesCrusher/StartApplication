package com.application.balticactivity

data class User(
    val name:String,
    val lastName:String,
    val age: Int = 0
) {
    var innerState:String = ""
}