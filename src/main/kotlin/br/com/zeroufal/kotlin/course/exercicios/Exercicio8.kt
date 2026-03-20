package org.example.br.com.zeroufal.kotlin.course.exercicios

class Exercicio8 {
    fun templateMethod() {
        val vendas = listOf(
            100.0,
            250.0,
            80.0,
            400.0,
            150.0
        )

        val somaTotal = vendas.sum()
        val mediaAritmetica = somaTotal / vendas.size
        val maiorValor = vendas.max()

        println("Soma dos valores $somaTotal")
        println("Media dos valores $mediaAritmetica")
        println("Maior valor $maiorValor")
    }
}