package com.example.degiskenler

fun main() {
    val yas = 11
    val isim = "Mehmet"

    if (yas >= 18){
     println("Reşitsiniz")
    }
    else{
        println("Reşit Değilsiniz")
    }
    if (isim == "Ahmet"){
        println("Merhaba Ahmet")
    }else if(isim=="Mehmet"){
        println("Merhaba Mehmet")
    }else{
        println("Tanınmayan kişi")
    }

    val ka = "admin"
    val s = 12345
    if(ka=="admin" && s==12345){
        println("Hoşgeldiniz")
    }
    else{
        println("Hatalı giriş")
    }
}