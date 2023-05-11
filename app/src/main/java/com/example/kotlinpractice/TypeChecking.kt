package com.example.kotlinpractice

fun main(args: Array<String>) {
    var name = "Asif"
    var age = 22
    var salary = 5000.55
    val employeeDetails: List<Any> = listOf(name, age, salary)

    for (attribute in employeeDetails) {
       if(attribute is String){
           println("Name : "+attribute)
       }
        else  if(attribute is Int){
           println("Age : "+attribute)
       }
        else  if(attribute is Double){
           println("Salary : "+attribute)
       }
        else{
            println("Not an attribute")
        }
    }
}