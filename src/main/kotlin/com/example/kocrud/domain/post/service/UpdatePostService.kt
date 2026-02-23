package com.example.kocrud.domain.post.service

import com.example.kocrud.domain.post.presentation.data.request.UpdatePostRequest
import com.example.kocrud.domain.post.presentation.data.response.PostResponse

interface UpdatePostService {
    fun execute(id: Long, request: UpdatePostRequest) : PostResponse
}