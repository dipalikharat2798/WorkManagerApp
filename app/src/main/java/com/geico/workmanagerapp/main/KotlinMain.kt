package com.geico.workmanagerapp.main

fun main(){
    val nums= listOf(1,2,3,4)
    val list=nums.filter { it  % 2 != 0 }
    println(list)
//    var fn: (a: Int, b: Int) -> Int = ::com.geico.workmanagerapp.main.sum
//    val lambda1: (Int, Int) -> Int ={ x:Int, y:Int -> x+y}
//    val multilineLambda: () -> Int ={
//        println("Hello")
//        val a=2+3
//        "Hello cheezyCode"
//        2
//    }
//
//    val sungleParamLambda: (Int) -> Int ={ x:Int->x*x}
//    val lambda2:(Int)->Int={x->x*x}
//
//    val sayHi = {msg:String->println("Hello $msg")}
//    val sayHi2:(String)->Unit={msg->println("Hello $msg")}
//  //  println(multilineLambda())
//
//    val singleParam:(Int)->Int={ it+it}
//    val simplifySingleParam:(Int)->Int={it+it}
//
//    com.geico.workmanagerapp.main.calculator(1,2) { a, b -> a + b }
}

fun sum(a:Int, b:Int):Int=a+b

fun calculator(a:Int, b:Int, op:(Int,Int)->Int):Int{
    return op(a,b)
}

fun odd(a:Int):Boolean{
    return a % 2 != 0
}