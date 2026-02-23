package com.example.kocrud.domain.post.presentation.data.response

import java.time.LocalDateTime

data class PostResponse(
    val id: Long,
    val title: String,
    val content: String,
    val author: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
)
