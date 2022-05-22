package com.example.inventory_presentation.cookie_screen

import com.example.inventory_domain.models.InventoryCookie

data class CookieScreenState(
    val cookie: InventoryCookie? = null,
    val name: String = ""
)
