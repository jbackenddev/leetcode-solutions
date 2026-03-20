package org.example.br.com.zeroufal.kotlin.course.exercicios

sealed class Transacao<T>

class Deposito(val valor: Double): Transacao<Double>()
class Saque(val valor: Double): Transacao<Double>()
class Transferencia(val valor: Double): Transacao<Double>()