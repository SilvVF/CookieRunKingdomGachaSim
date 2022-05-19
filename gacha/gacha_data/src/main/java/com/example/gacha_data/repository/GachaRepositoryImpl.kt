package com.example.gacha_data.repository

import com.example.core.data.local.entity.CookieDao
import com.example.gacha_domain.models.toCookie
import com.example.gacha_data.local.DefaultCookieList
import com.example.gacha_domain.models.GachaCookie
import com.example.gacha_domain.repository.GachaRepository
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList


class GachaRepositoryImpl constructor(
    private val cookieDao: CookieDao,
    private val defaultCookieList: DefaultCookieList
): GachaRepository {
    override suspend fun prePopulateDb() {
        cookieDao.upsertCookieInfo(
            defaultCookieList.list
        )
    }


    override suspend fun getAllCookies(): List<GachaCookie> {
        return cookieDao.getAllCookies().map {
            it.toCookie()
        }.toList()
    }


    override suspend fun updateCookie(cookieName: String, soulStoneCount: Int) {
        val cookie = cookieDao.getCookieByName(cookieName)
        val updatedCookie = cookie.copy(
            soulStoneCount = cookie.soulStoneCount + soulStoneCount
        )
        cookieDao.updateCookieInfo(updatedCookie)
    }

    override suspend fun getDefaultList(): List<GachaCookie> {
        return defaultCookieList.list.map {
            it.toCookie()
        }
    }

    override suspend fun clearAllCookies() {
        cookieDao.nuke()
        cookieDao.upsertCookieInfo(
            defaultCookieList.list
        )
    }
}