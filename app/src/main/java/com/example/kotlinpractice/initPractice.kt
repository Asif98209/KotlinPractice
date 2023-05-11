package com.example.kotlinpractice


class employee(emp_id: Int=100, emp_name:String="abc"){
   val id: Int
   var name: String

   init {
       id=emp_id
       name=emp_name

       print("Emplyee id is "+id)
       println(" name is "+name)
       println()
   }
}
fun main(){
    val emp1 = employee(10002, "Asif")
    val emp2 = employee(100022)
    val emp3 = employee()
}