package org.example.br.com.zeroufal.kotlin.course.repository

data class Usuario(
        var cpf: String,
        var nome: String,
        var sobrenome: String,
        var email: String? = null
    ) : Entity<String>(cpf)