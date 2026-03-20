package org.example.br.com.zeroufal.kotlin.course.dias

import java.time.LocalDate

sealed class PaymentResult

data class Success(val data: String) : PaymentResult()

data class InsufficientFunds(val funds: Double) : PaymentResult()

data class CardExpired(val date: LocalDate) : PaymentResult()

data class NetworkError(val errorMessage: String) : PaymentResult()

data class Box<T> (val value: T) {
    fun <T> convertToString(value: T) : String = "$value"
}


class Dia3 {
    fun handle(result: PaymentResult) : Any {
        when (result) {
            is Success -> return result.data
            is InsufficientFunds -> return result.funds
            is CardExpired -> return result.date
            is NetworkError -> return result.errorMessage
        }
    }

    fun templateMethod() {
        var paymentResult = handle(
            Success("""
            { 
                "nome": "Marcos,
                "idade": "42"
            }
        """.trimIndent())
        )
        println(paymentResult)

        paymentResult = handle(InsufficientFunds(100.0))
        println(paymentResult)

        paymentResult = handle(CardExpired(LocalDate.now()))
        println(paymentResult)

        paymentResult = handle(NetworkError("NotFound"))
        println(paymentResult)

        val resultInteiro = Box(1)
        print("Numero inteiro: $resultInteiro")

        val resultFlutuante = Box(1.0)
        print("Numero flutuante: $resultFlutuante")
        print(resultFlutuante.convertToString(1.0))
    }
}