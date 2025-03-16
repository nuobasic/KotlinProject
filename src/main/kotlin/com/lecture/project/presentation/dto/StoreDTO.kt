package com.lecture.project.presentation.dto

import com.lecture.project.entity.Store
import com.lecture.project.entity.User

data class StoreDTO (
    val storeName : String,
    val storeAddress : String,
    val storeTime : String,
    val storePhone : String,
    val storeContent : String?,

){
    constructor(store: Store) : this(
        storeName = store.storeName,
        storeAddress = store.storeAddress,
        storeTime =store.storeTime,
        storePhone = store.storePhone,
        storeContent =store.storeContent
    )
}