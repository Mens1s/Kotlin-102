package com.example.oopkotlin

open class Sanatci(isim:String, yas:Int, meslek:String) {
    // Encapsulation
    /* Erişebilirlik seviyeleri
    * bir nesneye nereden nasıl ulasilabilir
    * bunları düzenler
    */
    var isim : String? = isim
        private set
        get
    var yas : Int? = yas


    fun test(){
        println(isim)
    }
}