package org.example.br.com.zeroufal.kotlin.course.dias

import org.example.br.com.zeroufal.kotlin.course.repository.Usuario

class Dia4 {
    private fun Int.impar() : Boolean = this % 2 != 0

    private fun String.contrario() : String {
        val reverseString = StringBuilder()

        for(i in this.length -1 downTo 0 step 1) {
            reverseString.append(this[i])
        }

        return reverseString.toString()
    }

    private fun List<String>.palindromo() : Boolean {
        var comparison = true
        val mid: Int = this.size / 2
        var i = 0
        while(comparison && i <= mid) {
            if(this[i] != this[this.size - 1 - i]) {
                comparison = false
            }
            i++
        }

        return comparison
    }

    private fun List<Int>.mediaAritmetica() : Double {
        var sum = 0.0;

        this.forEach { sum += it }

        return sum / this.size
    }

    fun templateMethod() {
        val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

        numeros.filter { it.impar() }.forEach { println(it) }

        val stringContent = "marcos"

        println(stringContent.contrario())

        println(listOf("M", "A", "A", "M").palindromo())

        println(listOf(1, 2, 3).mediaAritmetica())

        val usuario = Usuario("", "", "").apply {
            cpf = "1"
            nome = "Marcos"
            sobrenome = "Silva"
            email = "marcos@gmail.com"
        }


        usuario.email?.let {
            println("Email será enviado para: $it")
        }

        println(usuario)
    }
}