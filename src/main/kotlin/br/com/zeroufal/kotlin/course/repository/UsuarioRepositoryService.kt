package org.example.br.com.zeroufal.kotlin.course.repository

class UsuarioRepositoryService {
    val repositoryService = RepositoryService<String, Usuario>(MemoryRepository())

    private fun addElements() {
        repositoryService.save(Usuario("1", "Marcos", "Silva"))
        repositoryService.save(Usuario("2", "Doublas", "Damiao"))
    }

    fun templateMethod() {
        addElements()

        println("valores iniciais: ${repositoryService.findAllElements()}")

        val resultadoSave = repositoryService.save(Usuario("3", "Teste", "Teste"))
        println("add novo usuario: $resultadoSave")
        val resultadoRepetido = repositoryService.save(Usuario("1", "Marcos", "Silva"))
        println("add usuario existente: $resultadoRepetido")

        val usuario = repositoryService.findById("1") ?: Usuario("0", "0", "0")

        val resultadoDelete = repositoryService.delete(usuario)
        println("removendo usuario existente: $resultadoDelete")

        val resultadoDeleteNaoExistente = repositoryService.delete(Usuario("x", "x", "x"))
        println("removendo usuario nao existente: $resultadoDeleteNaoExistente")

        println("valores finais: ${repositoryService.findAllElements()}")
    }
}