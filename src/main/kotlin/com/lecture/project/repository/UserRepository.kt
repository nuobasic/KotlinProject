package com.lecture.project.repository

import com.lecture.project.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository:JpaRepository<User,Long> {


}