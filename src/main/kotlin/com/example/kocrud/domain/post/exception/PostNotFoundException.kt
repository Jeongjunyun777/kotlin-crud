package com.example.kocrud.domain.post.exception

import com.example.kocrud.global.exception.ErrorCode
import com.example.kocrud.global.exception.GlobalException

class PostNotFoundException : GlobalException(ErrorCode.POST_NOT_FOUND) {
}