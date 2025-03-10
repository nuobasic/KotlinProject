package com.lecture.project.entity

import jakarta.persistence.*


@Entity
class OrderDetail(
        orderDetailQuantity : Number
): BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="order_detail_id")
    var id : Long? = null;

    var orderDetailQuantity : Number = orderDetailQuantity;

}