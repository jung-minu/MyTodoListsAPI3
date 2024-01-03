package com.teamsparta.todoeregistration.domain.mytodolist.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "todo")
class TodoEntity(
    @Column(name = "todo")
    var todo: String,

    @Column(name = "datetodo")
    var datetodo: String,

    @Column(name = "tododatecreat")
    var tododatecreat: String,

    @Column(name = "writername")
    var writername: String
)