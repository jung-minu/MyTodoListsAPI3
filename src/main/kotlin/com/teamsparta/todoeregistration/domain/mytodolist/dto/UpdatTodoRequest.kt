package com.teamsparta.todoeregistration.domain.mytodolist.dto

data class UpdatTodoRequest(
    val todo: String,
    val datetodo: String,
    val tododatecreat: String,
    val writername: String

)