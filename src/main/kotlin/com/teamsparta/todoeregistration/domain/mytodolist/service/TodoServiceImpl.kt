package com.teamsparta.todoeregistration.domain.mytodolist.service

import com.teamsparta.todoeregistration.domain.exception.ModelNotFoundException
import com.teamsparta.todoeregistration.domain.mytodolist.dto.CreatTodoRequest
import com.teamsparta.todoeregistration.domain.mytodolist.dto.TodolistsResponse
import com.teamsparta.todoeregistration.domain.mytodolist.dto.UpdatTodoRequest
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service


@Service
class TodoServiceImpl: TodoService {
    override fun getAllTodoList(): List<TodolistsResponse> {
        // TODO: DB에서 모든 Todo 목록을 조회하여 TodolistResponse 목록으로 변환 후 반환
        //
        TODO("Not yet implemented")
    }


    override fun getTodoById(todoId: Long): TodolistsResponse {
        //TODO: 만약 todoId에 해당하는 todo가 없다면 throw ModelNOtFoundException
        //TODO: DB에서 Id기반으로 Todo를 가져와서 TodolistResponse로 변환 후 반환
//        TODO("Not yet implemented")
        throw  ModelNotFoundException(modelName = "Todo", id= 1L)
    }

    @Transactional
    override fun creatTodo(request: CreatTodoRequest): TodolistsResponse {
        //TODO: request를 Todo로 변환 후 DB에 저장
        TODO("Not yet implemented")
    }

    @Transactional
    override fun updateTodo(todoId: Long, request: UpdatTodoRequest): TodolistsResponse {
        //TODO: 만약 todoId에 해당하는 todo가 없다면 throw ModelNOtFoundException
        //TODO: DB에서 Id기반으로 Todo를 가져와서 request기반으로 업데이트 후 DB에 저장, 결과를 TodoResponse로 변환 후 저장
        TODO("Not yet implemented")
    }

    @Transactional
    override fun deleteTodo(todoId: Long) {
        //TODO: 만약 todoId에 해당하는 todo가 없다면 throw ModelNOtFoundException
        // TODO: DB에서 Todo를 삭제
        TODO("Not yet implemented")
    }
}