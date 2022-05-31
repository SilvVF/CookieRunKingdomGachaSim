package com.example.inventory_domain.use_cases

import android.icu.text.IDNA
import com.example.inventory_domain.models.InfoCookie
import com.example.inventory_domain.models.InventoryCookie
import com.example.inventory_domain.repository.InventoryRepository

class GetCookieByName (
    private val repository: InventoryRepository
) {

    suspend operator fun invoke(name: String): InfoCookie {
        return repository.getCookieByName(name = name)
    }
}