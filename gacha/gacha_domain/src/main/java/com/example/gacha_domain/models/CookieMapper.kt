package com.example.gacha_domain.models
import com.example.core.data.local.entity.CookieEntity


fun GachaCookie.toCookieEntity(soulStoneCount: Int, cookieImage: Int, type: String): CookieEntity {
    return CookieEntity(
        name = name,
        soulStoneCount = soulStoneCount,
        soulStoneImage = soulStoneImage,
        cookieImageAnimated = cookieImageAnimated,
        cookieGachaImage = cookieGachaImage,
        rarity = rarity.name,
        cookieImage = cookieImage,
        type = type
    )
}

fun CookieEntity.toCookie(): GachaCookie {
    return GachaCookie(
        name = name,
        soulStoneImage = soulStoneImage,
        cookieImageAnimated = cookieImageAnimated,
        cookieGachaImage = cookieGachaImage,
        rarity = Rarity.fromString(rarity),
    )
}