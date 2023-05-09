package com.example.kotlinpractice

/*Kotlin may have one or more secondary constructors.Secondary constructors allow initialization
of variables and allow to provide some logic to the class as well. They are prefixed with the constructor keyword.*/


fun main(args: Array<String>)
{
    Add1(5, 6)
}
//class with one secondary constructor

class Add1
{
    constructor(a: Int, b:Int)
    {
        var c = a + b
        println("The sum of numbers 5 and 6 is: ${c}")
    }
}