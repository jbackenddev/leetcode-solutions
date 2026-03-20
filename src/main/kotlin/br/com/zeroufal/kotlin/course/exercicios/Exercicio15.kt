package org.example.br.com.zeroufal.kotlin.course.exercicios

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Exercicio15 {
    fun cancela() {
        runBlocking {
            val job = launch {
                while(true) {
                    delay(200)
                    println("rodando")
                }
            }
            delay(2000)
            job.cancel()
            println("cancelado")
        }
    }
}

fun main() {
    Exercicio15().cancela()
}