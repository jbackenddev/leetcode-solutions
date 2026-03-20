package org.example.br.com.zeroufal.kotlin.course.dias

import kotlinx.coroutines.*

class Dia5 {
    fun exercicio1() {
        runBlocking {
            launch {
                println("Hello")
            }

            launch {
                delay(500)
                println("World")
            }

        }
    }

    fun exercicio2() {
        runBlocking {
            launch {
                delay(500)
                println("rotina 1")
            }

            launch {
                delay(500)
                println("rotina 2")
            }

            launch {
                delay(500)
                println("rotina 3")
            }
        }
    }

    private fun resultadoFuncao1() = runBlocking {
        delay(2000)
        59
    }

    private fun resultadoFuncao2() = runBlocking {
        delay(500)
        1
    }

    fun exercicio3() {
        var resultado = 0

        runBlocking {
            val resultado1 = async {
                resultadoFuncao1()
            }

            val resultado2 = async {
                resultadoFuncao2()
            }

            resultado = resultado1.await() + resultado2.await()
        }

        println(resultado)
    }

    fun tryExecute(tempo: Long): String {
        var resultado = "executed"

        runBlocking {
            val job = launch {
                delay(tempo)
            }

            if (tempo >= 4000) {
                delay(2000)
                job.cancel()
                resultado = "failed"
            }
        }

        return resultado
    }

    fun exercicio4() {
        runBlocking {
            val tentativa = async { tryExecute(2000) }

            val resultado = tentativa.await()
            println(resultado)
        }
    }
}

fun main() {
    Dia5().exercicio4()
}