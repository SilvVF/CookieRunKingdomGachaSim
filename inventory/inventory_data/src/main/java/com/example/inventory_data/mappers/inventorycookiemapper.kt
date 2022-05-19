package com.example.inventory_data.mappers

import com.example.core.data.local.entity.CookieEntity
import com.example.inventory_domain.models.InventoryCookie
import com.example.inventory_domain.models.Rarity
import com.example.inventory_domain.models.Type

fun CookieEntity.toInventoryCookie(): InventoryCookie {
    return InventoryCookie(
        name = name ,
        soulStoneCount = soulStoneCount,
        soulStoneImage = soulStoneImage,
        cookieInventoryImage = cookieGachaImage,
        type = Type.fromString(type),
        rarity = Rarity.fromString(rarity)
    )
}