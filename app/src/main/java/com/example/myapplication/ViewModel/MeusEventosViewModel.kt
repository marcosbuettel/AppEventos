package com.example.myapplication

import androidx.lifecycle.ViewModel

class MeusEventosViewModel : ViewModel() {
    public fun checkUserEvent (): Event {
        val userLogado = UsersMock().getUserLogado()
        val userEvent = EventsMock().getUserEvent(userLogado)
        return userEvent
    }
}