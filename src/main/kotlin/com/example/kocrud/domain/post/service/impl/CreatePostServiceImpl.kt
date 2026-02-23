package com.example.kocrud.domain.post.service.impl

import com.example.kocrud.domain.post.entity.PostEntity
import com.example.kocrud.domain.post.presentation.data.request.CreatePostRequest
import com.example.kocrud.domain.post.repository.PostRepository
import com.example.kocrud.domain.post.service.CreatePostService

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CreatePostServiceImpl(
    private val postRepository: PostRepository
) : CreatePostService {

    override fun execute(request: CreatePostRequest) {
        val post = PostEntity().apply {
            title = request.title
            content = request.content
            author = request.author
        }
        postRepository.save(post)
    }
}