package com.teamsparta.todoeregistration.domain.mytodolist.controller

import com.teamsparta.todoeregistration.domain.exception.ModelNotFoundException
import com.teamsparta.todoeregistration.domain.mytodolist.dto.CreatTodoRequest
import com.teamsparta.todoeregistration.domain.mytodolist.dto.TodolistsResponse
import com.teamsparta.todoeregistration.domain.mytodolist.dto.UpdatTodoRequest
import com.teamsparta.todoeregistration.domain.mytodolist.service.TodoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RequestMapping("/todolists")
@RestController
class TodolistsController(
    private val todoService: TodoService

) {

    @GetMapping()
    fun getTodoLists(): ResponseEntity<List<TodolistsResponse>>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.getAllTodoList())
    }

    @GetMapping("/{todoId}")
    fun getTodo(@PathVariable todoId: Long): ResponseEntity<TodolistsResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.getTodoById(todoId))
    }

    @PostMapping
    fun createTodo(@RequestBody creatTodoRequest: CreatTodoRequest): ResponseEntity<TodolistsResponse>{
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(todoService.creatTodo(creatTodoRequest))
    }

    @PutMapping("/{todoId}")
    fun updateTodo(@PathVariable todoId: Long, @RequestBody updatTodoRequest: UpdatTodoRequest):
            ResponseEntity<TodolistsResponse>{
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.updateTodo(todoId, updatTodoRequest))
    }

    @DeleteMapping("/{todoId}")
    fun deleteTodo(@PathVariable todoId: Long): ResponseEntity<Unit>{
        todoService.deleteTodo(todoId)
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }


}