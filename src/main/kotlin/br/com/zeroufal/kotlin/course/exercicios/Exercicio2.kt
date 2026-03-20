package org.example.br.com.zeroufal.kotlin.course.exercicios

class Exercicio2 {
    fun templateMethod() {
        val numeros = (1..100).toList()

        println(numeros.filter { it % 3 == 0 }.map { it * 2 }.subList(0, 10))
    }
}