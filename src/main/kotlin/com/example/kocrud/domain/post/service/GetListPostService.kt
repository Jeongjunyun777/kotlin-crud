package com.example.kocrud.domain.post.service

import com.example.kocrud.domain.post.presentation.data.response.PostResponse

interface GetListPostService {
    fun execute(): List<PostResponse>
}