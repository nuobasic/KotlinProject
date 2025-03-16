package com.lecture.project.presentation.controller

import com.lecture.project.presentation.dto.MenuDTO
import com.lecture.project.presentation.dto.StoreDTO
import com.lecture.project.presentation.service.StoreService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController



@RestController
@RequestMapping("/api")
class StoreController (
        private val storeService: StoreService
) {

    @GetMapping("/stores")
    fun stores() : List<StoreDTO>{
        return storeService.findAll()
    }

    @GetMapping("/store/menus")
    fun storeMenu(storeId : Long): List<MenuDTO> {
        return storeService.findAllMenu(storeId)
    }



}