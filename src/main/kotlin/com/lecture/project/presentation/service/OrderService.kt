package com.lecture.project.presentation.service

import com.lecture.project.presentation.dto.OrderDTO
import com.lecture.project.presentation.dto.StoreDTO
import com.lecture.project.repository.OrderRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class OrderService(
        private val orderRepository: OrderRepository
) {

    @Transactional(readOnly = true)
    fun findAll(): List<OrderDTO>{
        return orderRepository.findAll().map{ OrderDTO(it) }
    }

}