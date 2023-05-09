package com.example.kotlinpractice

/*The primary constructor is initialized in the class header, goes after the class name,
using the constructor keyword. The parameters are optional in the primary constructor.*/

fun main(args: Array<String>)
{
    val add = Add(5, 6)
    println("The Sum of numbers 5 and 6 is: ${add.c}")
}


//primary constructor
class Add constructor(a: Int,b:Int)
{
    var c = a+b;
}