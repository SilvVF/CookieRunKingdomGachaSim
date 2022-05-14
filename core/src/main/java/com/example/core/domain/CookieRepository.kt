package com.example.core.domain


import com.example.core.domain.model.Cookie
import kotlinx.coroutines.flow.Flow


interface CookieRepository {

    fun getAllCookies(): Flow<Cookie>

    suspend fun insertAllCookies(cookieList: List<Cookie>)

    suspend fun updateCookie(cookie: Cookie)

    suspend fun prePopulateWithAllCookies()
}