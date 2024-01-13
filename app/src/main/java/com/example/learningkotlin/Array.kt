package com.example.learningkotlin

fun main(){
    //array declaration
    var osNames = arrayOf("windows", "linux", "mac")

    //accessing array element
    var arrayFirstElement = osNames[0]
    val arraySecondElement = osNames[1]

    println(osNames.contentToString())
    println(arrayFirstElement)
    println(arraySecondElement)

    //change array element value
    arrayFirstElement = "win"

    osNames[0] = "winddddd"
    println(osNames.contentToString())

    println(arrayFirstElement)

    //array size

    val size = osNames.size
    println("array size $size")

    //itterate through array

    for (i in osNames){
        print("\n"+i)
    }

    println("\n")

    osNames.forEach { i -> println(i) }

}