package com.example.kotlinpractice

class Null {
   fun main(){
       var a : String? ="BMW"
       //it means a can never be null or empty.
       var s1: String = "Asif"
       //s1 = null compilation error
       //To allow a variable to hold null, we can declare a variable as nullable string, written String?
       var s2: String? = "Ali"
       s2 = null // ok
       println(s2)
   }
}