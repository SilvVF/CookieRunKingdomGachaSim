package com.example.gacha_domain.repository

import com.example.gacha_domain.models.GachaCookie
import kotlinx.coroutines.flow.Flow

interface GachaRepository {

    suspend fun prePopulateDb()

    suspend fun getAllCookies(): List<GachaCookie>

    suspend fun updateCookie(cookieName: String, soulStoneCount: Int)

    suspend fun getDefaultList(): List<GachaCookie>

    suspend fun clearAllCookies()
}