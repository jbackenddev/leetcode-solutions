package org.example.br.com.zeroufal.kotlin.course.repository

open class Entity<T>(val id: T)

interface Repository<T, E : Entity<T>> {
    fun save(e: E) : Boolean

    fun <T> findById(id: T) : E?

    fun delete(e: E) : Boolean

    fun findAllElements() : Set<E>
}

class MemoryRepository<T, E: Entity<T>> : Repository<T, E> {
    private val values = mutableSetOf<E>()

    override fun save(e: E) : Boolean = values.add(e)

    override fun <T> findById(id: T) : E? = values.find { it.id == id }

    override fun delete(e: E) : Boolean = values.remove(e)

    override fun findAllElements() : Set<E> = values.toSet()
}