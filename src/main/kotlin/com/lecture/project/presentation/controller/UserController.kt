package com.lecture.project.presentation.controller

import com.lecture.project.entity.User
import com.lecture.project.presentation.dto.UserDTO
import com.lecture.project.presentation.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Optional

@RestController
@RequestMapping("/api")
class UserController(
        private val userService: UserService
) {

    @GetMapping("/users")
    fun users() : List<UserDTO>{
        return userService.findAll()
    }

    @GetMapping("/user/{userId}")
    fun user(@PathVariable userId : Long): Optional<User> {
        return userService.findOneUser(userId)
    }
}