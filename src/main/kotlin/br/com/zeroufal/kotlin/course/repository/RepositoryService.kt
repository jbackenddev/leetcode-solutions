package org.example.br.com.zeroufal.kotlin.course.repository

class RepositoryService<T, E : Entity<T>>(repo: Repository<T, E>) : Repository<T, E> by repo