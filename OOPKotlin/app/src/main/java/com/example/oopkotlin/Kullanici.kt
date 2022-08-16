package com.example.oopkotlin

class Kullanici : Insan{
    var isim: String? = null
    var yas: Int? = null

    constructor(isim:String, yas:Int){
        this.isim = isim
        this.yas = yas
        println("**********Constructor Cagrildi**************")
    }
    init {
        println("******init cagrildi*********")
    }
}