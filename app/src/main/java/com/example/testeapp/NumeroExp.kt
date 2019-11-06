package com.example.testeapp
import java.util.*



import java.text.CharacterIterator

fun main (args: Array<String>) {

    println("Escreva algo : ")

    var nome   = readLine()


    nome = nome?.replace(" ", "")  // tirando espaçamentos


        var (numero) = nome!!.partition { it.isDigit() }  // verificando numeros
        var (letra) = nome!!.partition { it.isLetter() }  // verificando letras
        var (sinais) = nome!!.partition { !it.isLetterOrDigit() }  // verificando caracteres

        println("São Numeros : " + numero)
        println("São Letras  : " + letra)
        println("São Sinais : " + sinais)


}







