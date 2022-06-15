package com.example.gacha_domain.models
import com.example.core.data.local.entity.CookieEntity


/**
 * maps the Data Layer CookieEntity stored in the shared database to values that
 * are needed for the state of the gacha screen
 */

fun CookieEntity.toCookie(): GachaCookie {
    return GachaCookie(
        id = id,
        name = name,
        soulStoneImage = soulStoneImage,
        cookieImageAnimated = cookieFullArt,
        cookieGachaImage = cookieFaceIcon,
        rarity = Rarity.fromString(rarity),
    )
}