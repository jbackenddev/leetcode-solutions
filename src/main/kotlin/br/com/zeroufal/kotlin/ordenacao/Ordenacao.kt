package org.example.br.com.zeroufal.kotlin.ordenacao

class Ordenacao {
    private fun MutableList<Int>.bubbleSort() {
        var lista = this

        if (lista.isEmpty()) return

        var desordenado = false

        do {
            var i = 1
            var ultimo = lista[0]
            desordenado = false

            for(j in i..< lista.size) {
                if( lista[j] < ultimo ) {
                    desordenado = true
                    lista[j - 1] = lista[j]
                    lista[j] = ultimo
                } else {
                    ultimo = lista[j]
                }
            }
        } while(desordenado)
    }

    private fun MutableList<Int>.insertSort() {
        var lista = this

        if (lista.isEmpty()) return

        for(i in 1..< lista.size) {
            if (lista[i - 1] > lista[i]) {
                var j = 0;

                do {
                    if (lista[j] > lista[i]) {
                        break
                    }
                    j++
                } while(j < i)

                val backup = lista[i]

                for( w in i downTo j) {
                    if (w == j) {
                        lista[w] = backup
                    } else {
                        lista[w] = lista[w - 1]
                    }
                }
            }
        }
    }

    private fun MutableList<Int>.selectionSort() {
        var lista = this

        if (lista.isEmpty()) return


        for(j in 0 ..< lista.size) {
            var controle = j
            for(i in j..< lista.size) {
                if (lista[i] < lista[controle]) {
                    controle = i
                }
            }

            if (controle > 0) {
                val backup = lista[j]
                lista[j] = lista[controle]
                lista[controle] = backup
            }
        }
    }

    fun templateMethod() {
        val listaBubble = mutableListOf(5, 2, 0, 4, 6, 9, 8, 7, 1, 3)
        listaBubble.bubbleSort()
        println("Executando BubbleSort em $listaBubble")

        val listaInsert = mutableListOf(5, 2, 0, 4, 6, 9, 8, 7, 1, 3)
        listaInsert.insertSort()
        println("Executando InsertSort em $listaInsert")

        val listaSelection = mutableListOf(5, 2, 0, 4, 6, 9, 8, 7, 1, 3)
        listaSelection.selectionSort()
        println("Executando SelectionSort em $listaSelection")
    }
}

fun main() {
    Ordenacao().templateMethod()
}
