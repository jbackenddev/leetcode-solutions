package org.example.br.com.zeroufal.kotlin.course.exercicio1

import java.util.stream.Collectors

class Service {
    fun templateMethod() {
        val usuarios = listOf(
            Usuario("Ana","SP"),
            Usuario("Pedro","RJ"),
            Usuario("Maria","SP"),
            Usuario("Carlos","RJ"),
            Usuario("João","MG")
        )

        println(getUsersByCidade(usuarios))
    }

    private fun getUsersByCidade(usuarios: List<Usuario>): Map<String, List<Usuario>> = usuarios.stream()
            .collect(Collectors.groupingBy(Usuario::cidade))
}