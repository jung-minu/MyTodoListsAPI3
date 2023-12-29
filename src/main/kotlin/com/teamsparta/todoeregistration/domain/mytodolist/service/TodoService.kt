package com.teamsparta.todoeregistration.domain.mytodolist.service

import com.teamsparta.todoeregistration.domain.mytodolist.dto.CreatTodoRequest
import com.teamsparta.todoeregistration.domain.mytodolist.dto.TodolistsResponse
import com.teamsparta.todoeregistration.domain.mytodolist.dto.UpdatTodoRequest

interface TodoService {

    fun getAllTodoList(): List<TodolistsResponse>

    fun getTodoById(todoId: Long): TodolistsResponse

    fun creatTodo(request: CreatTodoRequest): TodolistsResponse

    fun updateTodo(todoId:Long, request: UpdatTodoRequest): TodolistsResponse

    fun deleteTodo(todoId:Long)
}