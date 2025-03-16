package com.lecture.project.presentation.service

import com.lecture.project.presentation.dto.MenuDTO
import com.lecture.project.presentation.dto.StoreDTO
import com.lecture.project.repository.StoreRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class StoreService(
        private val storeRepository: StoreRepository
) {

    @Transactional(readOnly = true)
    fun findAll(): List<StoreDTO>{
        return storeRepository.findAll().map{ StoreDTO(it) }
    }


    @Transactional(readOnly = true)
    fun findAllMenu(storeId: Long): List<MenuDTO>{
        return storeRepository.findAllByMenu(
            storeId = TODO()
        ).map { MenuDTO(it) }
    }

}