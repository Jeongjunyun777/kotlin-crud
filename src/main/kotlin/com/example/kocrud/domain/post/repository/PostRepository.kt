package com.example.kocrud.domain.post.repository

import com.example.kocrud.domain.post.entity.PostEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository : JpaRepository<PostEntity, Long> {
}