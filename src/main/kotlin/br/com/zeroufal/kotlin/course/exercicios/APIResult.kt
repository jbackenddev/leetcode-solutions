package org.example.br.com.zeroufal.kotlin.course.exercicios

sealed class APIResult<T>

class Success<T>(val data: T) : APIResult<T>()

class Error(val message: String) : APIResult<Nothing>()

object Loading : APIResult<Nothing>()