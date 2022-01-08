package com.example.degiskenler

fun main() {
    val a = 10
    val b = 80
    val x = 40
    val y = 5
    println(a==b)
    println(a!=b)
    println(a>=b)
    println(a<b)
    println(a<=b)

    //AND : VE : true ve true : aksi halde sonuç hep false
    println(a==b && x<y )
    //OR : VEYA : false ve false : aksi halde sonuç hep true
    println(a==b || x<y )
}