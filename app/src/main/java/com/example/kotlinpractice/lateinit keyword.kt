package com.example.kotlinpractice

class lateinitkeyword {

    /*The “lateinit” keyword is used to declare those variables
    that are guaranteed to be initialized in the future.*/

    lateinit var a : String;
    fun initialized(){
        println("Is the variable a initialized? "+this::a.isInitialized)
        //now we are initializing variable a
        a="Asif"
        println("Is the variable a initilized? "+this::a.isInitialized)
    }
}
fun main(){
    lateinitkeyword().initialized()
}