package com.example.kocrud.domain.post.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "post")

class PostEntity {

    @Column(nullable = false,name = "title")
    var title : String = ""

    @Column(nullable = false, name = "author")
    var author: String =""

    @Column(name = "content", nullable = false)
    var content : String ? = ""

    @Column(nullable = false,name = "created_at")
    val createdAt: LocalDateTime = LocalDateTime.now()

    var updatedAt: LocalDateTime = LocalDateTime.now()

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

    fun update(title: String, content: String) {
        title?.let{ this.title = it }
        content?.let{ this.content = it }
        this.updatedAt = LocalDateTime.now()
    }
}