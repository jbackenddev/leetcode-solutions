package org.example.br.com.zeroufal.kotlin.course.exercicios

class Exercicio10 {
    fun templateMethod() {
        val pedidos = listOf(
            Pedido(1,"Ana",200.0),
            Pedido(2,"Pedro",1500.0),
            Pedido(3,"Ana",300.0),
            Pedido(4,"Pedro",700.0),
            Pedido(5,"Carlos",50.0)
        )

        val resultado = pedidos.groupBy { it.cliente }.mapValues { it.value.sumOf { pedido -> pedido.valor } }

        println(resultado)

        val lista = listOf("a","b","a","c","b","a")

        lista.frequencia()
    }

    fun <T> List<T>.frequencia() {
        val resultado = this.groupingBy { it }.eachCount()

        println(resultado)
    }
}