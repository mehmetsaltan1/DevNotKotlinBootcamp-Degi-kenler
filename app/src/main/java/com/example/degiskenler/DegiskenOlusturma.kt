package com.example.degiskenler

fun main() {
    var ogrenciAdi = "Mehmet"
    var ogrenciYas = 21
    var ogrenciBoy = 1.84
    var ogrenciBasharf = 'M'
    var ogrenciDevamEdiyorMu = true
    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasharf)
    println(ogrenciDevamEdiyorMu)

    var urun_id:Int = 3416
    var urun_adi:String = "Kol Saati"
    var urun_adeti:Int = 100
    var urun_fiyat:Double = 149.99
    var urun_tedarikci:String = "rolex"
    println("Ürün id : $urun_id")
    println("Ürün adi : $urun_adi")
    println("Ürün adeti : $urun_adeti")
    println("Ürün fiyati : $urun_fiyat ₺")
    println("Ürün tedarikcisi : $urun_tedarikci")

    var a = 10
    var b = 20
    println("$a x $b : ${a*b}")

    //Sabitler

    var sayi = 30
    println(sayi)
    sayi=100
    println(sayi)

    val numara = 90
    println(numara)
println("-----------------------")
    //Tür Dönüşümü

    //Sayısaldan sayısala dönüşüm
    val i = 42
    val d = 78.95

    val sonuc1 = i.toDouble()
    println(sonuc1)
    val sonuc2 = d.toInt()
    println(sonuc2) //Veri kaybı yaşandı(ondalıklı kısım 0 a yuvarlandı)

    //Sayısaldan metine dönüştürme

    val sonuc3 = i.toString()
    val sonuc4 = d.toString()
    println(sonuc3)
    println(sonuc4)

    //Metinden sayısala dönüşüm
    val yazi = "67.54."
    val sonuc5 = yazi.toDoubleOrNull()
    if (sonuc5 !=null){
        println(sonuc5)

    }
    else{
       println("Dönüşümde sorun oluştu sayınızı kontrol ediniz !")
    }
}