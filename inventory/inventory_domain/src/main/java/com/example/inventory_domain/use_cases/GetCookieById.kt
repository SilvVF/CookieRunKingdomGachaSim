package com.example.inventory_domain.use_cases

import com.example.inventory_domain.models.InventoryCookie
import com.example.inventory_domain.repository.InventoryRepository

class GetCookieById (
    private val repository: InventoryRepository
) {

    suspend fun invoke(id: Int): InventoryCookie {
        return repository.getCookieById(id = id)
    }
}