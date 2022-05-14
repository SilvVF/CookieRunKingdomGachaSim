package com.example.core.util

import com.example.core.data.local.entity.CookieEntity
import com.example.gacha_domain.models.Cookie


fun Cookie.toCookieEntity(): CookieEntity {
    return CookieEntity(
        id = id,
        name = name,
        soulStoneCount = soulStoneCount,
        soulStoneImage = soulStoneImage,
        cookieImage = cookieImage,
        cookieImageAnimated = cookieImageAnimated,
        cookieGachaImage = cookieGachaImage,
        type = type,
        rarity = rarity
    )
}

fun CookieEntity.toCookie(): Cookie {
    return Cookie(
        id = id,
        name = name,
        soulStoneCount = soulStoneCount,
        soulStoneImage = soulStoneImage,
        cookieImage = cookieImage,
        cookieImageAnimated = cookieImageAnimated,
        cookieGachaImage = cookieGachaImage,
        type = type,
        rarity = rarity,
        story = "",
        position = "",
        skill = ""
    )
}