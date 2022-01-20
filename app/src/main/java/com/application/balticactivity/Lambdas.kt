package com.application.balticactivity

fun main() {
    val lambda = { println("Lambda")}
    lambda()

    val lambdaWithParams = {x: Int -> println("X from lambda: $x")}
    lambdaWithParams(10)

    var x = 15
    var y = 17
    val sumLambda = {x:Int, y:Int -> x + y}
    println("Sum $x and $y is ${sumLambda(x, y)}")

    val users = listOf<User>(
        User("Vasya", "Sergeev", 35),
        User("Ivan", "Sergeev", 44),
        User("Pavel", "Kotin", 18),
        User("Igar", "nikitin", 22)
    )

    var oldestUser:User? = null
    for (user in users){
        val currentAge = user.age
        val maxAge = oldestUser?.age?: Int.MIN_VALUE

        if (currentAge > maxAge){
            oldestUser = user
        }
    }
    println(oldestUser)

    val user1 = users[0]
    val oldestUserMaxBy = users.maxBy{user: User -> user1.age}

}
