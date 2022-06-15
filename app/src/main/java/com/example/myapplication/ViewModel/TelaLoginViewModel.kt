package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TelaLoginViewModel : ViewModel() {

    public fun checkUsers (user: String, password: String): Boolean{
        val user = UsersMock().getUserByEmail(user)
        if(!user.isEmpty()) {
            if (user[0].password == password) {
                return true
            }
        }
        return false
    }
}