package com.example.leson_1_m6

data class Task(
    val title: String,
    var isDone: Boolean = false){

    fun toggleDone(){
        isDone = !isDone
    }
}
