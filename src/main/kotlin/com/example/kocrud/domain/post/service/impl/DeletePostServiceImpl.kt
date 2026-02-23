package com.example.kocrud.domain.post.service.impl

import com.example.kocrud.domain.post.exception.PostNotFoundException
import com.example.kocrud.domain.post.repository.PostRepository
import com.example.kocrud.domain.post.service.DeletePostService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class DeletePostServiceImpl(
    private val postRepository : PostRepository,
) : DeletePostService {
    override fun execute(id:Long) {
        val post = postRepository.findById(id).orElse(null)
            ?: throw PostNotFoundException()

        postRepository.delete(post)
    }
}