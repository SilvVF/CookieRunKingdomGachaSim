package com.example.inventory_domain.use_cases

import com.example.inventory_domain.models.InventoryCookie
import com.example.inventory_domain.repository.InventoryRepository

class GetCookieByName (
    private val repository: InventoryRepository
) {

    suspend operator fun invoke(name: String): InventoryCookie {
        return repository.getCookieByName(name = name)
    }
}