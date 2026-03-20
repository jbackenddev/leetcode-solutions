package org.example.br.com.zeroufal.kotlin.course.exercicios

class Exercicio7 {
    fun templateMethod() {
        val clientes = listOf(
            Cliente("Ana","ana@email.com"),
            Cliente("Pedro",null),
            Cliente("Maria","maria@email.com")
        )

        val resultado = clientes.mapNotNull { it.email }

        println(resultado)
    }
}