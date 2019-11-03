package com.example.testeapp
import java.util.*



import java.text.CharacterIterator

fun main (args: Array<String>) {

    var nome   = "A l e x 8 a l o 8 6 3 d + - /"


    nome = nome.replace(" ", "")




        val (numero) = nome.partition { it.isDigit() }
        val (letra) = nome.partition { it.isLetter() }
        val (sinais) = nome.partition { !it.isLetterOrDigit() }

        println("São Numeros : " + numero)
        println("São Letras  : " + letra)
        println("São Sinais : " + sinais)






}







