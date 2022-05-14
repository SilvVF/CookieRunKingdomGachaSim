package com.example.core.util

import com.example.core.data.local.entity.CookieEntity
import com.example.core.domain.model.Cookie


fun Cookie.toCookieEntity(): CookieEntity {
    return CookieEntity(
        id = id,
        name = name,
        soulStoneCount = soulStoneCount,
        soulStoneImage = soulStoneImage,
        starOneCount = starOneCount,
        starTwoCount = starTwoCount,
        starThreeCount,
        starFourCount,
        starFiveCount,
        cookieImage,
        cookieImageAnimated,
        cookieGachaImage,
        story,
        position,
        type,
        skill,
        rarity
    )
}

fun CookieEntity.toCookie(): Cookie {
    return Cookie(
        id,
        name,
        soulStoneCount,
        soulStoneImage,
        starOneCount,
        starTwoCount,
        starThreeCount,
        starFourCount,
        starFiveCount,
        cookieImage,
        cookieImageAnimated,
        cookieGachaImage,
        story,
        position,
        type,
        skill,
        rarity
    )
}