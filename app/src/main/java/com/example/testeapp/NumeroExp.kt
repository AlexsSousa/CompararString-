package com.example.testeapp
import java.util.*



import java.text.CharacterIterator

fun main (args: Array<String>) {

    println("Escreva algo : ")

    var nome   = readLine()


    nome = nome?.replace(" ", "")




        var (numero) = nome!!.partition { it.isDigit() }
        var (letra) = nome!!.partition { it.isLetter() }
        var (sinais) = nome!!.partition { !it.isLetterOrDigit() }

        println("São Numeros : " + numero)
        println("São Letras  : " + letra)
        println("São Sinais : " + sinais)






}







