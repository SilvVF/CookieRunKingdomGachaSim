package com.example.inventory_presentation.inventory_screen.inventory_models

import com.example.inventory_domain.models.InventoryCookie

data class InventoryState(
    val cookieList: List<InventoryCookie> = emptyList(),
)
