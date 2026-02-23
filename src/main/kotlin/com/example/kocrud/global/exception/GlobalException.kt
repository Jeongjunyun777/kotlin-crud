package com.example.kocrud.global.exception

open class GlobalException(
    val errorCode: ErrorCode,
) : RuntimeException(errorCode.message) {
}