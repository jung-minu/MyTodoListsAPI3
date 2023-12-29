package com.teamsparta.todoeregistration.domain.exception

data class ModelNotFoundException(val modelName: String, val id: Long): RuntimeException(
    "Model $modelName not found wiht given id: $id"
)