package org.example.br.com.zeroufal.kotlin.course.exercicios

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

class Exercicio12 {
    fun runFlow() {
        val resultadoFlow = flow {
            for(i in 1..5) {
                delay(500)
                emit(i)
            }
        }

        runBlocking {
            resultadoFlow.collect {
                println(it)
            }
        }
    }
}


fun main() {
    Exercicio12().runFlow()
}