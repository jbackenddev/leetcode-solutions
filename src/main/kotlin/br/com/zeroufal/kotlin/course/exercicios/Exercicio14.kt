package org.example.br.com.zeroufal.kotlin.course.exercicios

import kotlinx.coroutines.*

class Exercicio14 {
    private fun calculate(a: Double, b: Double, operation: (Double, Double) -> Double): Double {
        val resultado = operation(a, b)

        return resultado
    }

    fun somar(a: Double, b: Double) = runBlocking {
        delay(500)
        calculate(a, b) { x, y -> x + y }
    }

    fun subtrair(a: Double, b: Double) = runBlocking {
        delay(500)
        calculate(a, b) { x, y -> x - y }
    }

    fun multiplicar(a: Double, b: Double) = runBlocking {
        delay(500)
        calculate(a, b) { x, y -> x * y }
    }
}

fun main() {
    val exercicio = Exercicio14()
    val a = 10.0
    val b = 5.0

    runBlocking {
        val execucao1 = async(Dispatchers.Default) { exercicio.somar(a, b) }
        val execucao2 = async(Dispatchers.Default) { exercicio.subtrair(a, b) }
        val execucao3 = async(Dispatchers.Default) { exercicio.multiplicar(a ,b) }

        val resultado = execucao3.await() + execucao2.await() + execucao1.await()

        println(resultado)
    }
}