package com.example.kocrud.domain.post.presentation.data.request

data class CreatePostRequest(
    val title: String,
    val content: String,
    val author: String,
)
