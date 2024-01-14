package com.example.learningkotlin

fun main(){
    //Basic Anonymous Function
    val add : (Int, Int) -> Int = fun(a,b) : Int{return a + b}
    val add2 = fun(a: Int, b: Int) : Int{return a+b}

    //Example
    val numbers = listOf(1,2,3,4,5)
    val squareAnonymousFun = fun(x : Int) : Int{
        return x * x
    }
    val squareNumbers = numbers.map(squareAnonymousFun)
    println(squareNumbers)

    //TYPE of Anonymous Function
    //1. With Parameter and return value
    val multiply = fun(a: Int, b: Int) : Int{return a*b}
    println(multiply(6,6))
    println(multiply.invoke(6,6))

    //2. With Parameter and no Return Value
    val multiply2 = fun(a: Int, b: Int) : Unit{ println(a*b)}
    multiply2(6,5)

    //3. Without parameter but with return value
    val greeting = fun() : String {return "Without param"}
    println(greeting())

    //4. Without both parameter and return value
    val greeting2 = fun() {
        println("Without both param and return value")
    }
    greeting2()
}