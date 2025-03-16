package com.lecture.project.presentation.dto

import com.lecture.project.entity.User

data class UserDTO (
    val userName : String,
    val userEmail : String,
    val userAddress : String,
){
    constructor(user: User) : this(
        userName = user.userName,
        userEmail = user.userEmail,
        userAddress =user.userAddress
    )
}