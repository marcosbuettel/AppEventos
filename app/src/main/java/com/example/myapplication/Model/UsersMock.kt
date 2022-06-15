package com.example.myapplication

data class User(val id: String, val login: String, val password: String)

var userLogado:String = ""

class UsersMock {

    private var userList = listOf<User>(
        User("1","guilherme", "123" ),
        User("2","marcos", "123" ),
    )

    fun getUserByEmail(email: String): List<User> {
        val userLogin = userList.filter{it.login.equals(email) }
        userLogado = userLogin[0].id

        return userLogin
    }


    fun getUserLogado(): String {
        return userLogado
    }
}