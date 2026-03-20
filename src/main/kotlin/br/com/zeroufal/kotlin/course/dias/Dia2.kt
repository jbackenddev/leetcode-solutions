package org.example.br.com.zeroufal.kotlin.course.dias

import org.example.br.com.zeroufal.kotlin.course.biblioteca.Livro

class Dia2 {
    private fun printTelefoneNullable(telefone: String?) = println(telefone ?: "Vazio")

    private fun printTelefone(telefone: String) = println(telefone)

    private fun livroRecente(livro: Livro) = livro.ano > 2015

    private fun encontrarMaiorNumero(listaDeNumeros: List<Int>): Int {
        return listaDeNumeros.max()
    }

    private fun numbersMultipleOf(startNumber: Int = 1, finalNumber: Int = 100, number: Int) : List<Int> {
        val newListOfNumbers = mutableListOf<Int>()

        for(i in startNumber..finalNumber) {
            newListOfNumbers.add(i);
        }

        return newListOfNumbers.filter { it % 7 == 0 }
    }

    fun templateMethod() {
        /*printTelefone("123")
        printTelefoneNullable(null)

        val livro = Livro("O Problema dos Tres Corpos", "Liu Cixin", 2006)
        val recente = livroRecente(livro)
        println("O livro é recente? $recente")

        val (titulo, autor, ano) = livro

        println("Os valores dos campos do Livro sao => Titulo: $titulo, Autor: $autor, Ano: $ano")

        val livros = mutableListOf<Livro>()

        livros.add(Livro("O Problema dos Tres Corpos", "Liu Cixin", 2006))
        livros.add(Livro("Devoradores de Estrelas", "Andy Weir", 2021))

        livros.forEach(System.out::println)*/

        val multiple = 7
        val listOfNumbers = numbersMultipleOf(1, 100, multiple)
        println("The multiples of $multiple are $listOfNumbers")

        val listaDeNumeros = listOf<Int>(1, 3, 5, 4, 2)
        val maiorNumero = encontrarMaiorNumero(listaDeNumeros)
        println("O Maior numero é: $maiorNumero")
    }
}