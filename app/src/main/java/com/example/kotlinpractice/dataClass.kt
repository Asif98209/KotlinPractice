package com.example.kotlinpractice


fun main(args: Array<String>)
{
    //declaring a data class
    data class man(val name: String, val id : Int)
    {
        //property declared in class body
        var height: Int = 0;
    }

    //declaring a variable of the above data class and
    //initializing values to all parameters

    val man1=man("manish", 112)
    //class body properties must be assigned uniquely
    man1.height = 70

    //this method prints the details of class that
    //are declared in primary constructor
    println(man1.toString());

    //printing the height of man1
    println(man1.height);
}