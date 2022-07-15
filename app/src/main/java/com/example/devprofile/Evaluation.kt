package com.example.devprofile

fun main(){
    var s1="Hello"
    var s2="Hi"
    var s3="Shivi"

    var lambda= {x:Int-> x*x}
    println(s1.add(s2,s3))
    val m= lambda(2)
    println(m)
}

fun String.add(s1:String,s2:String):String{
    return this+s1+s2
}



