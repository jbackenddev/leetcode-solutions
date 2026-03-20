package org.example.br.com.zeroufal.kotlin.course.exercicios

class Exercicio3 {
    fun handle(result: APIResult<*>) : Any? {
        return when (result) {
            is Success -> result.data
            is Error -> result.message
            is Loading -> "Carregando"
        }
    }

    fun templateMethod() {
        println(handle(Success("payload")))
        println(handle(Error("erro")))
        println(handle(Loading))
    }
}