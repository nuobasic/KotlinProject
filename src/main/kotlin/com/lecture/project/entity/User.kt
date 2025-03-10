package com.lecture.project.entity

import jakarta.persistence.*


@Entity
class User(
        userName : String,
        userEmail : String,
        password: String,
        userAddress: String

): BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="user_id")
    var id : Long? = null;

    var userName : String = userName

    var userEmail : String = userEmail

    var password : String = password

    var userAddress : String = userAddress

    @OneToMany(targetEntity = Order :: class,
                fetch = FetchType.LAZY,
                cascade = [CascadeType.ALL])
    @JoinColumn(name = "order_id")
    var orders : MutableList<Order> = mutableListOf()

    @OneToMany(targetEntity = OrderDetail :: class,
        fetch = FetchType.LAZY,
        cascade = [CascadeType.ALL])
    @JoinColumn(name = "order__detail_id")
    var orderDetails : MutableList<OrderDetail> = mutableListOf()




}