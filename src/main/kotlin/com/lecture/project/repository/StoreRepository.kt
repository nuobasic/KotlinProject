package com.lecture.project.repository

import com.lecture.project.entity.Menu
import com.lecture.project.entity.Store
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface StoreRepository:JpaRepository<Store, Long> {

    @Query("select s from Store s left join fetch s.menuDetails where s.storeId =:storeId  ")
    fun findAllByMenu(storeId : Long): List<Menu>
}