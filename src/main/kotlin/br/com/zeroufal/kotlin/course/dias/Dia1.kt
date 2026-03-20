package org.example.br.com.zeroufal.kotlin.course.dias

class Dia1 {
    private fun findType(type: Any) = when (type) {
        is Int -> "Int"
        is Double -> "Double"
        is Float -> "Float"
        is String -> "String"
        else -> "Unknown"
    }

    private fun celsiusToFahrenheit(temperature: Double) = ((temperature * 9/5) + 32)

    private fun validateLength(message: String = "No Message"): Boolean {
        return if (message.length > 20) false else true
    }

    private fun verifyRepetitions(lista: List<String>): Boolean {
        var valorCorrente = ""

        for(valor in lista) {
            if (valor == valorCorrente) {
                return true
            }
        }

        return false
    }

    private fun acharNumerosPares(n: Int) : List<Int>{
        val numerosPares = mutableListOf<Int>()

        for(i in 1..n) {
            if (i % 2 == 0) {
                numerosPares.add(i)
            }
        }

        return numerosPares
    }

    private fun classificarNota(nota: Int): String {
        return when {
            nota >= 9 -> "Excelente"
            nota >= 7 -> "Bom"
            nota >= 5 -> "Regular"
            else -> "Reprovado"
        }
    }

    fun templateMethod() {
        val convertedTemperature: Double = celsiusToFahrenheit(25.0)
        println("O valor da temperatura em Fahrenheit é $convertedTemperature")

        val type: String = findType("tiro")
        println("O tipo da variável é $type")

        val message = "Mensagem Invalida por que tem mais do que vinte caracteres"
        val validacao = validateLength(message)
        println("O resultado da validacao da mensagem é $validacao")

        val verificaRepeticao = verifyRepetitions(listOf("Ana", "Joao", "Maria"))
        println("Lista contem repeticao? $verificaRepeticao")

        val numerosPares = acharNumerosPares(30)
        println("Lista de numeros pares: $numerosPares")

        val resultadoDaNOta = classificarNota(4)
        println("Resultado da nota é $resultadoDaNOta")
    }
}
