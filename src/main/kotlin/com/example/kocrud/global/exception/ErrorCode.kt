package com.example.kocrud.global.exception

import org.springframework.http.HttpStatus

enum class ErrorCode(
    val status : HttpStatus,
    val message: String
) {
    POST_NOT_FOUND(HttpStatus.NOT_FOUND, "Post not found"),
    POST_FORBIDDEN(HttpStatus.FORBIDDEN, "Post forbidden")
}