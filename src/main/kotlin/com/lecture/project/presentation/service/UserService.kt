package com.lecture.project.presentation.service

import com.lecture.project.entity.User
import com.lecture.project.presentation.dto.UserDTO
import com.lecture.project.repository.UserRepository
import org.springframework.transaction.annotation.Transactional
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(
        private val userRepository: UserRepository
) {

    @Transactional(readOnly = true)
    fun findAll(): List<UserDTO>{
        return userRepository.findAll().map{UserDTO(it)}
    }

    @Transactional(readOnly = true)
    fun findOneUser(userId : Long) : Optional<User> {
        return userRepository.findById(userId)
    }

}