package com.example.learningkotlin

fun isPalindrome(s: String): Boolean{
    for (i in 0 until s.length/2){
        val firstIndex = s[i]
        val lastIndex = s[s.length - i -1]

        if (firstIndex != lastIndex){
            return false
        }
    }
    return true
}

fun isPrime(n: Int): Boolean{
    if (n < 2){
        return false
    }
    var i = 2
    while (i * i <=n){
        if (n % i == 0){
            return false
        }
        i++
    }
    return true
}

fun factorial(n: Int): Int{
    if (n == 0){
        return 1
    }

    return n * factorial(n-1)
}

fun facto(n: Int): Int{
    if (n == 0){
        return 1
    }

    var result = 1

    var i = 1

    while (i <= n){
        result *= i
        i++
    }
    return result
}




fun main(){
    println(isPalindrome("aaaaaaaaaaaaaaaaab"))
    println(isPalindrome("aaaaaaaaaaaaaaaaa"))
    println("prime\n")
    println(isPrime(5))
    println(isPrime(2))
    println(isPrime(20))
    println("\nfactorial")
    println(factorial(5))
    println(facto(5))
}
