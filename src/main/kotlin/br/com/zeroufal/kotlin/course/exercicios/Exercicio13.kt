package org.example.br.com.zeroufal.kotlin.course.exercicios

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


class Exercicio13 {
   fun runChannel() {
       val channel = Channel<Int>()

       runBlocking {
           launch {
               for(i in 1..5) {
                   delay(500)
                   channel.send(i)
               }

               channel.close()
           }

           for(c in channel) {
               println("Consumindo $c")
           }
       }
   }
}

fun main() {
    Exercicio13().runChannel()
}