package com.lecture.project.presentation.controller

import com.lecture.project.presentation.dto.OrderDTO
import com.lecture.project.presentation.dto.StoreDTO
import com.lecture.project.presentation.service.OrderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class OrderController (
        private val orderService: OrderService
){

    @GetMapping("/orders")
    fun orders() : List<OrderDTO>{
        return orderService.findAll()
    }
}