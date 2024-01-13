package com.example.learningkotlin

fun main(){

    var angka = 1
    //for
    println("for\n")
    for (i in 1..5){
        println("angka ke - "+ i)
    }
    //while
    println("while\n")
    var angka2 = 1
    while (angka2 < 5){
        println("angka ke - $angka2")
        angka2++
    }

    //do while
    println("do while\n")

    do {
        println("angka ke- $angka")
        angka++
    }while (angka < 10)
}