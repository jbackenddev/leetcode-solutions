package org.example.br.com.zeroufal.kotlin.course.exercicios

class Exercicio9 {
    fun calculate(a: Double, b: Double, op: (Double, Double) -> Double ): Double {
        return op(a, b)
    }

    fun calculateDeposito(a: Double, b: Double) = calculate(a, b) { x, y -> x + y}

    fun calculateSaque(a: Double, b: Double) = calculate(a, b) { x, y -> x - y}

    fun calculateTransferencia(a: Double, b: Double) = calculate(a, b) { x, y -> x - y}

    fun saldoFinal(transacoes: List<Transacao<*>>): Double {
        var saldo = 0.0

        for(transacao in transacoes) {
            saldo = when(transacao) {
                is Deposito -> calculateDeposito(saldo, transacao.valor)
                is Saque -> calculateSaque(saldo, transacao.valor)
                is Transferencia -> calculateTransferencia(saldo, transacao.valor)
            }
        }

        return saldo
    }

    fun templateMethod() {
        val transacoes = listOf(Deposito(1000.0), Saque(200.0), Transferencia(100.0))
        val saldo = saldoFinal(transacoes)
        println("O saldo final e: $saldo")
    }
}