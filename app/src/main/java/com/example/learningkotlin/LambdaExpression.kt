package com.example.learningkotlin

fun main(){
    //common lambda expression
    val add1 : (Int, Int) -> Int = {a: Int, b: Int -> a+b}
    val res1 = add1(5,3)
    val add2 = {a: Int, b: Int -> a+b}
    val res2 = add2(5,3)
    val add3 :(Int, Int) -> Int = {a,b -> a+b}
    val res3 = add3(5,3)

    println(res1)
    println(res2)
    println(res3)


    // TYPE of Lambda Expression
    //1. With Parameter and Return value
    val add : (Int, Int) -> Int = {a,b -> a+b}

    //2. With Parameter and no Return value
    val addTwo : (Int, Int) -> Unit = {a,b -> print(a+b)}
    addTwo(5,3)

    //3. Without Parameter but with return value
    val welcome : () -> String = {"\nWelcome Back"}
    println(welcome.invoke())

    //4. Without both parameter and return value
    val welcometwo : () -> Unit = { println("Without param and return value") }
    welcometwo()

    //5. Direct Use of Lambda Expression
    println({a: Int, b: Int -> a*b} (5,3))
}