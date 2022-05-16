package com.example.gacha_domain.repository.use_cases

import com.example.gacha_domain.models.GachaCookie
import com.example.gacha_domain.repository.GachaRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList

class GetCookieList(
    private val repository: GachaRepository
) {

    suspend operator fun invoke(): List<GachaCookie> {
        return repository.getAllCookies().toList()
    }
}