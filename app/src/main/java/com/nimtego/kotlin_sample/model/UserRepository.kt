package com.nimtego.kotlin_sample.model



class UserRepository<T : User> : UserRepositoryInterface<T> {


    private val users : MutableList<T> = ArrayList()


    override fun users(): Collection<T> {
        return users
    }
    override fun add(user: T): Boolean {
        if (userByName(user.login()) != null)
            return false
        return users.add(user)
    }

    override fun deletByName(name: String): Boolean {
        return users.remove(userByName(name))
    }
    override fun userByName(name: String): T? {
        return users.first{u -> u.login() == name}
    }

}