package org.example.br.com.zeroufal.kotlin.course.exercicios

class Exercicio4 {
    fun List<Int>.segundoMaior() : Int? {
        if (this.size <= 2) return null

        var maior = 0
        var segundoMaior = 0

        for(numero in this) {
            if ( numero >= maior ) {
                segundoMaior = maior
                maior = numero
            }
        }

        return segundoMaior
    }

    fun templateMethod() {
        val segundoMaior = listOf(1, 2, 2, 3, 4).segundoMaior()

        println(segundoMaior)
    }
}