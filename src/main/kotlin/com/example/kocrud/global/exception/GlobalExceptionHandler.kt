package com.example.kocrud.global.exception

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(GlobalException::class)
    fun handleGlobalException(e: GlobalException): ResponseEntity<ErrorResponse> {
        return ResponseEntity
            .status(e.errorCode.status)
            .body(ErrorResponse.of(e.errorCode))
    }
}