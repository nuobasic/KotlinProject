package com.lecture.project.presentation.dto

import com.lecture.project.entity.Menu
import com.lecture.project.entity.Store

data class MenuDTO(
    val menuName : String,
    val menuPrice : Number,
) {
    constructor(menu: Menu) : this(
        menuName = menu.menuName,
        menuPrice = menu.menuPrice

    )
}