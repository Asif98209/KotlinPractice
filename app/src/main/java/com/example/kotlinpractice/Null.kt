package com.example.kotlinpractice
fun main() {
    val obj=Null()
    obj.nullvalue()
}

class Null {
   fun nullvalue(){
       var s1: String = "Asif"
       //s1 = null compilation error
       //To allow a variable to hold null, we can declare a variable as nullable string, written String?
       var s2: String? = "Ali"
       s2=null
       println(s2)
   }
}