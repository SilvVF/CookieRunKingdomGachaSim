package com.example.inventory_domain.repository

import com.example.inventory_domain.models.InventoryCookie

interface InventoryRepository {

    suspend fun getListOfCookies(): List<InventoryCookie>
}