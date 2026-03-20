package org.example.br.com.zeroufal.kotlin.course.calculator

class CalculatorService {
    fun templateMethod() {
        val calculator = Calculator()

        val a = 2.0
        val b = 3.0
        val c = 0.0

        val sum = calculator.calculateSum(a, b)
        val sub = calculator.calculateSub(a, b)
        val mul = calculator.calculateMultiplication(a, b)
        val div = calculator.calculateDivision(a, b)
        val div2 = calculator.calculateDivision(a, c)

        println("O resultado da soma $a e $b é $sum")
        println("O resultado da subtracao $a e $b é $sub")
        println("O resultado da multiplicacao $a e $b é $mul")
        println("O resultado da divisao $a e $b é $div")
        println("O resultado da divisao $a e $c é $div2")
    }

}