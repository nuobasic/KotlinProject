package com.lecture.project.entity

import jakarta.persistence.*
import java.sql.Time
import java.time.LocalDateTime


@Entity
class Store(
    storeName : String,
    storeAddress: String,
    storeTime : String,
    storePhone : String,
    storeContent : String?

    ): BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="store_id")
    var id : Long? = null;


    var storeName : String = storeName

    var storeAddress : String = storeAddress

    var storeTime : String = storeTime

    var storePhone : String = storePhone

    var storeContent : String? = storeContent

    @OneToMany(targetEntity = Menu :: class,
        fetch = FetchType.LAZY,
        cascade = [CascadeType.ALL])
    @JoinColumn(name = "menu_id")
    var menuDetails : MutableList<Menu> = mutableListOf()


}