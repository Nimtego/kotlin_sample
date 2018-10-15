package com.nimtego.kotlin_sample.model

interface UserRepositoryInterface<T : UserInterface> {
    fun users() : Collection<T>
    fun userByName(name : String) : T?
    fun add(user :  T) : Boolean
    fun deletByName(name : String) : Boolean
}