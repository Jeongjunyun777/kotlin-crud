package com.example.kocrud.domain.post.service

import com.example.kocrud.domain.post.presentation.data.request.CreatePostRequest

interface CreatePostService {
    fun execute(request: CreatePostRequest)
}