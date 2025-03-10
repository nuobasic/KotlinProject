package com.lecture.project.entity

import com.lecture.project.constant.enumType.MenuStateType
import jakarta.persistence.*


@Entity
class Menu(
        menuName: String,
        menuPrice : Number,
        menuState : String
) : BaseEntity(){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="menu_id")
    var id : Long? = null;

    var menuName : String = menuName

    var menuPrice : Number = menuPrice

    @Column(name = "menu_state")
    @Enumerated(value = EnumType.STRING)
    var menuState : MenuStateType = MenuStateType.valueOf(menuState)


    @OneToMany(targetEntity = OrderDetail :: class,
        fetch = FetchType.LAZY,
        cascade = [CascadeType.ALL])
    @JoinColumn(name = "order_detail_id")
    var orderDetails : MutableList<OrderDetail> = mutableListOf()
}