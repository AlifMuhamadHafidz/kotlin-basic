package com.example.learningkotlin

fun main(){
    //if

    var nilai = 80;

    if (nilai > 80 ){
        println("kamu lulus, nilai kamu A")
    }else if (nilai == 80){
        println("kamu lulus juga, nilai kamu B")
    }else if (nilai < 80){
        println("kamu hampir gak lulus, nilai kamu C")
    }else if (nilai < 60){
        println("kamu ngulang ya, nilai kamu D")
    }else{
        println("kamu gak lulus dan harus ngulang, nilai kamu E")
    }
}