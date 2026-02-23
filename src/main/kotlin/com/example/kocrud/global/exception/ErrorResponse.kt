package com.example.kocrud.global.exception

data class ErrorResponse(
    val status : Int,
    val message: String
){
    companion object {
        fun of(errorCode: ErrorCode) = ErrorResponse(
            status = errorCode.status.value(),
            message = errorCode.message
        )
    }
}
