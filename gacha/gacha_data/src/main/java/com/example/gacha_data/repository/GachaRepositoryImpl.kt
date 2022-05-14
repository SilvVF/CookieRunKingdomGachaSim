package com.example.gacha_data.repository

import com.example.core.data.local.entity.CookieDao
import com.example.core.util.toCookie
import com.example.core.util.toCookieEntity
import com.example.gacha_data.local.DefaultCookieList
import com.example.gacha_domain.models.Cookie
import com.example.gacha_domain.repository.GachaRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class GachaRepositoryImpl constructor(
    private val cookieDao: CookieDao,
    private val defaultCookieList: DefaultCookieList
): GachaRepository {
    override suspend fun prePopulateDb() {
        cookieDao.upsertCookieInfo(
            defaultCookieList.getDefaultList()
        )
    }

    override fun getAllCookies(): Flow<Cookie> {
        return cookieDao.getAllCookies().map {
            it.toCookie()
        }
    }

    override suspend fun insertAllCookies(cookieList: List<Cookie>) {
        cookieDao.upsertCookieInfo(
            cookieList.map {
                it.toCookieEntity()
            }
        )
    }

    override suspend fun updateCookie(cookie: Cookie) {
        cookieDao.updateCookieInfo(cookie.toCookieEntity())
    }


}