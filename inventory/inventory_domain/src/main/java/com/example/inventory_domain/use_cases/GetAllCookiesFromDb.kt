package com.example.inventory_domain.use_cases

import com.example.inventory_domain.models.InventoryCookie
import com.example.inventory_domain.repository.InventoryRepository

class GetAllCookiesFromDb(
    private val repository: InventoryRepository
) {

     suspend fun invoke(): List<InventoryCookie> {
         return repository.getListOfCookies()
     }
}