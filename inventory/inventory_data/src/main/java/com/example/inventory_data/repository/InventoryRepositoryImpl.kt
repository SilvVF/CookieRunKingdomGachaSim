package com.example.inventory_data.repository

import com.example.core.data.local.entity.CookieDao
import com.example.inventory_domain.models.InfoCookie
import com.example.inventory_domain.models.InventoryCookie
import com.example.inventory_domain.models.toInfoCookie
import com.example.inventory_domain.models.toInventoryCookie
import com.example.inventory_domain.repository.InventoryRepository


class InventoryRepositoryImpl(
    private val cookieDao: CookieDao
): InventoryRepository {


    override suspend fun getListOfCookies(): List<InventoryCookie> {
        return cookieDao.getAllCookies().map {
            it.toInventoryCookie()
        }.toList()
    }

    override suspend fun getCookieByName(name: String): InfoCookie{
        return cookieDao.getCookieByName(name).toInfoCookie()
    }

    override suspend fun getCookieById(id: Int): InventoryCookie {
        return cookieDao.getCookieById(id).toInventoryCookie()
    }

}