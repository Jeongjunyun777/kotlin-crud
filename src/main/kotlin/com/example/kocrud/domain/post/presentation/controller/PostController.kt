package com.example.kocrud.domain.post.presentation.controller

import com.example.kocrud.domain.post.presentation.data.request.CreatePostRequest
import com.example.kocrud.domain.post.presentation.data.request.UpdatePostRequest
import com.example.kocrud.domain.post.presentation.data.response.PostResponse
import com.example.kocrud.domain.post.service.CreatePostService
import com.example.kocrud.domain.post.service.DeletePostService
import com.example.kocrud.domain.post.service.GetListPostService
import com.example.kocrud.domain.post.service.GetPostService
import com.example.kocrud.domain.post.service.UpdatePostService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/posts")
class PostController(
    private val createPostService: CreatePostService,
    private val updatePostService: UpdatePostService,
    private val deletePostService: DeletePostService,
    private val getPostService: GetPostService,
    private val getListPostService: GetListPostService,
) {

    @GetMapping
    fun getAllPosts() : ResponseEntity<List<PostResponse>> {
        return ResponseEntity.ok(getListPostService.execute())
    }

    @GetMapping("/{id}")
    fun getPostById(@PathVariable(value = "id") id: Long) : ResponseEntity<PostResponse> {
        return ResponseEntity.ok(getPostService.execute(id))
    }

    @PostMapping
    fun createPost(@RequestBody request: CreatePostRequest) : ResponseEntity<Void> {
        createPostService.execute(request)
        return ResponseEntity.ok().build()
    }

    @PatchMapping("/{id}")
    fun updatePost(@PathVariable(value = "id") id: Long, @RequestBody request: UpdatePostRequest) : ResponseEntity<Void> {
        updatePostService.execute(id, request)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{id}")
    fun deletePost(@PathVariable(value = "id") id: Long) : ResponseEntity<Void> {
        deletePostService.execute(id)
        return ResponseEntity.noContent().build()
    }
}