package com.example.gacha_domain.repository.use_cases

import com.example.gacha_domain.models.Cookie
import com.example.gacha_domain.repository.GachaRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetCookieList(
    private val repository: GachaRepository
) {

    operator fun invoke(): Flow<Cookie> {
        return repository.getAllCookies()
    }
}