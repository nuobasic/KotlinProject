package com.lecture.project.presentation.dto

import com.lecture.project.entity.Order

data class OrderDTO (
        val orderPrice : Number,
        val orderRequest : String?
) {
    constructor(order: Order) : this(
        orderPrice = order.orderPrice,
        orderRequest = order.orderRequest
    )
}