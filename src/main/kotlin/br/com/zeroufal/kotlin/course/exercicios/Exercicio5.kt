package org.example.br.com.zeroufal.kotlin.course.exercicios


class Exercicio5 {
    private fun String.contaPalavras() = this.trim().split("\\s+".toRegex()).groupingBy { it }.eachCount()

    fun templateMethod() {
        val palavra = "kotlin java kotlin spring kotlin java"

        println(palavra.contaPalavras())
    }
}