package com.example.learningkotlin

fun main(){
    /*
    * High order function : can accept one or more function as parameter
      and also can return a function as it result
     */

    var mathSum = opearation(5,4){a,b -> a+b}
    var mathMultiply = opearation(5,4){a,b -> a*b}
    var mathDecrement = opearation(10,1){a,b -> a-b}
    var mathDivide = opearation(10,3){a,b -> a/b}
    println(mathSum)
    println(mathMultiply)
    println(mathDecrement)
    println(mathDivide)

}



fun opearation(a: Int, b:Int, mathOperation:(Int, Int) -> Int): Int{
    return mathOperation(a,b)
}