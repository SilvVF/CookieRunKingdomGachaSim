package com.example.inventory_data.repository

import com.example.core.data.local.entity.CookieDao
import com.example.inventory_data.mappers.toInventoryCookie
import com.example.inventory_domain.models.InventoryCookie
import com.example.inventory_domain.repository.InventoryRepository
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList

class InventoryRepositoryImpl(
    private val cookieDao: CookieDao
): InventoryRepository {


    override suspend fun getListOfCookies(): List<InventoryCookie> {
        return cookieDao.getAllCookies().map {
            it.toInventoryCookie()
        }.toList()
    }
}