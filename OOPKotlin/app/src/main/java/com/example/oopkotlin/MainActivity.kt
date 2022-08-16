package com.example.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("---------Classes--------")
        val kullanici = Kullanici("Ahmet",20)
        val digerk = Kullanici("Mahmut",21)

        println("---------Enclapsulataion--------")
        val ahmet = Sanatci("ahmet", 17, "BM")
        ahmet.test()

        // get public
        println(ahmet.isim)
        // set private
        // ahmet.isim = "DENEME"

        ahmet.test()


        println("----------INHERITANCE---------")
        val mehmet = OzelSanatci("Ahmet", 14,"Tiyatro")
        mehmet.calarim = "Nulbosr"
        mehmet.yas = 10

        println("-------POLYMORPHISM--------")

        // static polymorphism
        val islem = Islemler()
        println(islem.carpma())
        println(islem.carpma(1,2))
        println(islem.carpma(1,2,3))
        // dynamic polymorphism
        val kopek = Kopek()
        kopek.sesCikar()

        println("--------ABSTRACTION & INTERFACE--------")
        Kullanici("a",1).insanFonksiyonu()


        var gitar = Gitar()
        gitar.marka = "Gitar Markas"
        gitar.elektro = true

        gitar.bilgi()
        println(gitar.oda)

        println("--------Lambda Gösterimleri--------")

        val wtowLambda = {verilenString : String -> println(verilenString)}
        wtowLambda("aad")

        val carpLambda = {a: Int, b: Int ->  a * b }
        println(carpLambda(4,5))

        val carpLambdaV2 : (Int, Int) -> Int = {a,b -> a * b }
        println(carpLambdaV2(4,5))
    }
    fun wtow(string: String){
        println(string)
    }
}