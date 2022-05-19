package com.example.gacha_domain.repository.use_cases

import com.example.gacha_domain.models.GachaCookie
import com.example.gacha_domain.repository.GachaRepository

class DeleteInventory (
    private val repository: GachaRepository
) {
    suspend operator fun invoke() {
        repository.clearAllCookies()
    }
}