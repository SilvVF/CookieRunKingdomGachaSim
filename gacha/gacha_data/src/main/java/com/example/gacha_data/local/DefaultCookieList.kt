package com.example.gacha_data.local

import com.example.core.R
import com.example.core.data.CookieConstants.ANCIENT
import com.example.core.data.CookieConstants.HEALING
import com.example.core.data.local.entity.CookieEntity

class DefaultCookieList {

    fun getDefaultList(): List<CookieEntity>{
        return listOf(
            PURE_VANILLA,
            COOKIE1,
            COOKIE2,
            COOKIE3
        )
    }

    companion object {


        val PURE_VANILLA = CookieEntity(
            id = 1,
            name = "R.string.pure_vanilla",
            soulStoneImage = R.drawable.pure_vanilla_soulstone,
            cookieImage = R.drawable.pure_vanilla_character_card,
            cookieImageAnimated = R.drawable.pure_vanilla_animated,
            cookieGachaImage = R.drawable.pure_vanilla_face_icon,
            type = HEALING,
            rarity = ANCIENT,
            soulStoneCount = 0
        )
        val COOKIE1 = CookieEntity(
            id = 2,
            name = "R.string.pure_vanilla",
            soulStoneImage = R.drawable.pure_vanilla_soulstone,
            cookieImage = R.drawable.pure_vanilla_character_card,
            cookieImageAnimated = R.drawable.pure_vanilla_animated,
            cookieGachaImage = R.drawable.pure_vanilla_face_icon,
            type = HEALING,
            rarity = ANCIENT,
            soulStoneCount = 0
        )
        val COOKIE2 = CookieEntity(
            id = 3,
            name = "R.string.pure_vanilla",
            soulStoneImage = R.drawable.pure_vanilla_soulstone,
            cookieImage = R.drawable.pure_vanilla_character_card,
            cookieImageAnimated = R.drawable.pure_vanilla_animated,
            cookieGachaImage = R.drawable.pure_vanilla_face_icon,
            type = HEALING,
            rarity = ANCIENT,
            soulStoneCount = 0
        )
        val COOKIE3 = CookieEntity(
            id = 4,
            name = "R.string.pure_vanilla",
            soulStoneImage = R.drawable.pure_vanilla_soulstone,
            cookieImage = R.drawable.pure_vanilla_character_card,
            cookieImageAnimated = R.drawable.pure_vanilla_animated,
            cookieGachaImage = R.drawable.pure_vanilla_face_icon,
            type = HEALING,
            rarity = ANCIENT,
            soulStoneCount = 0
        )


    }
}