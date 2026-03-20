package org.example.br.com.zeroufal.kotlin.course.calculator

class Calculator {
    private fun calculate(a: Double, b: Double, op: (Double, Double) -> Double): Double {
        return op(a, b)
    }

    fun calculateSum(a: Double, b: Double) = calculate(a, b) { x, y -> x + y}

    fun calculateSub(a: Double, b: Double) = calculate(a, b) { x, y -> x - y}

    fun calculateMultiplication(a: Double, b: Double) = calculate(a, b) { x, y -> x * y}

    fun calculateDivision(a: Double, b: Double) : Double {
        if (b == 0.0) {
            return 0.0;
        } else {
            return calculate(a, b) { x, y -> x / y}
        }
    }
}