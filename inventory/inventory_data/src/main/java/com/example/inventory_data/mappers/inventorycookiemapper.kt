package com.example.inventory_data.mappers

import com.example.core.data.local.entity.CookieEntity
import com.example.inventory_domain.models.InventoryCookie
import com.example.inventory_domain.models.Rarity
import com.example.inventory_domain.models.Type

fun CookieEntity.toInventoryCookie(): InventoryCookie {
    return InventoryCookie(
        name = name ,
        soulStoneCount = when (this.soulStoneCount) {
            in (0..19) -> this.soulStoneCount
            in (20..49) -> this.soulStoneCount - 20
            in (50..99) -> this.soulStoneCount - 50
            in (100..169) -> this.soulStoneCount - 100
            in (170..269) -> this.soulStoneCount - 170
            else -> 100
        },
        soulStoneImage = soulStoneImage,
        cookieInventoryImage = cookieGachaImage,
        type = Type.fromString(type),
        rarity = Rarity.fromString(rarity),
        starCount = when (this.soulStoneCount) {
                in (0..19) -> 0
                in (20..49) -> 1
                in (50..99) -> 2
                in (100..169) -> 3
                in (170..269) -> 4
                else -> 5
        },
        soulStoneMax = when (this.soulStoneCount) {
            in (0..19) -> 20
            in (20..49) -> 30
            in (50..99) -> 50
            in (100..169) -> 70
            in (170..269) -> 100
            else -> 5
        }
    )


}