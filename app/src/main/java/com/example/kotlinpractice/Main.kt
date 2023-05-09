package com.example.kotlinpractice


fun main(args: Array<String>) {
   //val obj = UserInput()
    //obj.a()
    val obj1 = Operators()
    //obj1.arithmatic()
    //obj1.relational()
    obj1.logical()


}

class UserInput{
    fun a(){
        println("Please enter num 1: ")
        val a= readLine()
        println("You entered: "+a)
        println("Please enter your name")
        val b= readLine()
        println("Your name is: "+b)
    }
}

class Operators{
    fun arithmatic(){
        println("Please enter num 1: ")
        var a= readLine()
        println("Please enter num 2: ")
        var b= readLine()
        val sum = a+b
       println("The sum is "+sum)
    }

    fun relational(){
       if(3<10){
           println("It is true")
       }
        else{
            println("it is false")
       }
        if(22>=10){
            println("It is true")
        }
        else{
            println("It is false")
        }

        if(55==10){
            println("true")
        }
        else{
            println("false")
        }

    }

    fun logical(){
        val email=true
        val password=false
      println("Can I login? ")
        //if(pass)
    }
}

