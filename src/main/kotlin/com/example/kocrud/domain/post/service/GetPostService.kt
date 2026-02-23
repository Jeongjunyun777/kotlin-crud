package com.example.kocrud.domain.post.service

import com.example.kocrud.domain.post.presentation.data.response.PostResponse

interface GetPostService {
    fun execute(id: Long): PostResponse
}