package com.example.kotlinpractice


fun main(){
    var a: Int?= null
    a?.let {
        //system will not execute this block as a is null
        print(it)
    }

    a=2
    a?.let {
        //system will execute this block as a is not null
        print(it)
    }
}