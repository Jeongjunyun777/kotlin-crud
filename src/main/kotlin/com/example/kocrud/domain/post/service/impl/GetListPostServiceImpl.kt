package com.example.kocrud.domain.post.service.impl

import com.example.kocrud.domain.post.presentation.data.response.PostResponse
import com.example.kocrud.domain.post.repository.PostRepository
import com.example.kocrud.domain.post.service.GetListPostService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class GetListPostServiceImpl (
    private val postRepository: PostRepository,
) : GetListPostService {
    override fun execute(): List<PostResponse> {
        return postRepository.findAll().map { post ->
            PostResponse(
                id = post.id,
                title = post.title,
                content = post.content ?: "",
                author = post.author,
                createdAt = post.createdAt,
                updatedAt = post.updatedAt,
            )
        }
    }
}