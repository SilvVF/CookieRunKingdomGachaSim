package com.example.gacha_domain.repository

import com.example.gacha_domain.models.Cookie
import kotlinx.coroutines.flow.Flow

interface GachaRepository {

    suspend fun prePopulateDb()

    fun getAllCookies(): Flow<Cookie>

    suspend fun insertAllCookies(cookieList: List<Cookie>)

    suspend fun updateCookie(cookie: Cookie)
}