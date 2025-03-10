package com.lecture.project.entity

import com.lecture.project.constant.enumType.OrderStateType
import jakarta.persistence.*


@Entity
class Order(
        orderPrice : Number,
        orderRequest : String?,
        orderState : String

): BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="order_id")
    var id : Long? = null;

    var orderPrice : Number = orderPrice

    var orderRequest : String? = orderRequest

    @Column(name = "order_state")
    @Enumerated(value = EnumType.STRING)
    var orderState : OrderStateType = OrderStateType.valueOf(orderState)


    @OneToMany(targetEntity = OrderDetail :: class,
        fetch = FetchType.LAZY,
        cascade = [CascadeType.ALL])
    @JoinColumn(name = "order_detail_id")
    var orderDetails : MutableList<OrderDetail> = mutableListOf()


}