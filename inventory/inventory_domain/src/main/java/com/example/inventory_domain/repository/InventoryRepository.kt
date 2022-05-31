package com.example.inventory_domain.repository

import android.icu.text.IDNA
import com.example.inventory_domain.models.InfoCookie
import com.example.inventory_domain.models.InventoryCookie

interface InventoryRepository {

    suspend fun getListOfCookies(): List<InventoryCookie>

    suspend fun getCookieByName(name: String): InfoCookie

    suspend fun getCookieById(id: Int): InventoryCookie
}