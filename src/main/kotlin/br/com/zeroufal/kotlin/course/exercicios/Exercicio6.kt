package org.example.br.com.zeroufal.kotlin.course.exercicios

class Exercicio6 {
    fun templateMethod() {
        val produtos = listOf(
            Produto("Notebook",5000.0),
            Produto("Mouse",100.0),
            Produto("Monitor",1200.0)
        )


        val lista = produtos.filter { it.price > 500 }.map { it.name }

        println(lista)
    }
}