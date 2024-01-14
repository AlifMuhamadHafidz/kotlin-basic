package com.example.learningkotlin

fun main(){
    /*
    It statement can be used to replace the lambda expression
    or anonymous function that only have 1 single parameter
     */

    val numbers = listOf(1,2,3,4,5,)
    // example
    // 1. It Statement
    val itSquaredNumber = numbers.map{it * it}
    println("it result : $itSquaredNumber")
    val itEvenNumber = numbers.filter { it % 2 == 0 }
    println("it even number : $itEvenNumber")

    // 2. Lambda Expression
    val lambdaSquaredNumber = numbers.map{x : Int -> x *x}
    println("lambda result : $lambdaSquaredNumber")
    val lambdaEvenNumber = numbers.filter{x : Int -> x % 2 == 0}
    println("lambda even number $lambdaEvenNumber")

    // 3. Anonymous function
    val anonymousSquaredNumber = fun(x : Int) : Int{
        return x * x
    }
    val anonymousEvenNumber = fun(x : Int) : Boolean{
       return x % 2 == 0
    }

    println(numbers.map(anonymousSquaredNumber))
    println(numbers.filter(anonymousEvenNumber))
}