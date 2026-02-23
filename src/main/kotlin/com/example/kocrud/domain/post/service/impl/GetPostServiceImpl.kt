package com.example.kocrud.domain.post.service.impl

import com.example.kocrud.domain.post.exception.PostNotFoundException
import com.example.kocrud.domain.post.presentation.data.response.PostResponse
import com.example.kocrud.domain.post.repository.PostRepository
import com.example.kocrud.domain.post.service.GetPostService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class GetPostServiceImpl(
    private val postRepository: PostRepository
) : GetPostService {
    override fun execute(id: Long): PostResponse{
        val post = postRepository.findById(id).orElse(null)
            ?: throw PostNotFoundException()

        return PostResponse(
            id = post.id,
            title = post.title,
            content = post.content ?:"",
            author = post.author,
            createdAt = post.createdAt,
            updatedAt = post.updatedAt
        )
    }
}