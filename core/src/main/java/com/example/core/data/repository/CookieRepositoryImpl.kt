package com.example.core.data.repository

import com.example.core.data.DefaultCookieList
import com.example.core.data.local.entity.CookieDao
import com.example.core.domain.CookieRepository
import com.example.core.domain.model.Cookie
import com.example.core.util.toCookie
import com.example.core.util.toCookieEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class CookieRepositoryImpl(
    private val dao: CookieDao,
    private val cookieList: DefaultCookieList
): CookieRepository {
    override fun getAllCookies(): Flow<Cookie> {
        return dao.getAllCookies().map {
            it.toCookie()
        }
    }

    override suspend fun insertAllCookies(cookieList: List<Cookie>) {
        dao.upsertCookieInfo(
            cookieList.map {
                it.toCookieEntity()
            }
        )
    }

    override suspend fun updateCookie(cookie: Cookie) {
        dao.updateCookieInfo(cookie.toCookieEntity())
    }

    override suspend fun prePopulateWithAllCookies() {
        dao.upsertCookieInfo(
            cookieList.getDefaultList()
        )
    }
}