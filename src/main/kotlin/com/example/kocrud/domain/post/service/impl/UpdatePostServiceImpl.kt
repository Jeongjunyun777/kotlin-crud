package com.example.kocrud.domain.post.service.impl

import com.example.kocrud.domain.post.exception.PostNotFoundException
import com.example.kocrud.domain.post.presentation.data.request.UpdatePostRequest
import com.example.kocrud.domain.post.presentation.data.response.PostResponse
import com.example.kocrud.domain.post.repository.PostRepository
import com.example.kocrud.domain.post.service.UpdatePostService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UpdatePostServiceImpl (
    private val postRepository: PostRepository
) : UpdatePostService {
    override fun execute(id: Long, request: UpdatePostRequest) : PostResponse {

        val post = postRepository.findById(id).orElse(null)
            ?: throw PostNotFoundException()
        post.update(request.title,request.content)

        return PostResponse(
            id = post.id,
            title = post.title,
            content = post.content ?: "",
            author = post.author,
            createdAt = post.createdAt,
            updatedAt = post.updatedAt,
        )
    }
}