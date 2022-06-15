package com.example.myapplication

data class Event(val id: String, val idUsuario: String ,val name: String, val description: String)

class EventsMock {
    private val eventList = listOf<Event>(
        Event("1", "1", "Motorock Leopoldina", "Maior e melhor evento da região! As maiores bandas de rock reunidas!"),
        Event("2", "2","Motorock Miraí", "Evento raiz com as melhores bandas de hardrock de Minas Gerais!"),
    )

    fun getEvents(id: String): Event {
        val events = eventList.filter{it.id.equals(id)}
        return events[0]
    }

    fun getUserEvent(id: String): Event {
        val events = eventList.filter{it.idUsuario.equals(id)}
        return events[0]
    }
}