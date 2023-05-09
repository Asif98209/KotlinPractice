package com.example.kotlinpractice


fun main(args: Array<String>) {
    //Please remove the comments sign if you want to get the code output
    val obj = UserInput()
    //obj.a()
    val obj1 = Operators()
    //obj1.arithmatic()
    //obj1.relational()
    //obj1.logical()
    //obj1.assigment()


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
        if (email && password==true){
            println("Yes! you can login")
        }
        else if(email==true && password==false){
            println("No! you can not login")
        }
        else if(email==false && password==true){
            println("No! you can not login")

        }
        else if(email==false && password==false){
            println("No! you can not login")
        }
    }
//And operator (&) works like if anyone is false, it will return false, it will always return false untill all the entries are true


fun assigment(){
    val asif = 23
    val year = asif
    println(year)
    //it will return 23
    println("Let's do one more example")
    var a=88
    a+=12
    //this will return 100 because the logic behind that is the sum of both.
    println(a)
}
}

