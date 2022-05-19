package com.example.gacha_data.local

import com.example.core.R
import com.example.core.util.CookieConstants.AMBUSH
import com.example.core.util.CookieConstants.ANCIENT
import com.example.core.util.CookieConstants.CHARGE
import com.example.core.util.CookieConstants.COMMON
import com.example.core.util.CookieConstants.DEFENSE
import com.example.core.util.CookieConstants.EPIC
import com.example.core.util.CookieConstants.HEALING
import com.example.core.util.CookieConstants.LEGENDARY
import com.example.core.util.CookieConstants.MAGIC
import com.example.core.util.CookieConstants.RANGED
import com.example.core.util.CookieConstants.RARE
import com.example.core.util.CookieConstants.SUPPORT
import com.example.core.data.local.entity.CookieEntity

object DefaultCookieList {
    val list = listOf(
        CookieEntity(
            name = "Pure Vanilla",
            soulStoneImage = R.drawable.pure_vanilla_soulstone,
            cookieImage = R.drawable.pure_vanilla_character_card,
            cookieImageAnimated = R.drawable.pure_vanilla_animated,
            cookieGachaImage = R.drawable.pure_vanilla_face_icon,
            type = HEALING,
            rarity = RARE,
            soulStoneCount = 0
        ),
        CookieEntity(
            name = "Angel Cookie",
            soulStoneImage = R.drawable.angel_cookie_soulstone,
            cookieImage = R.drawable.angel_cookie_character_card,
            cookieImageAnimated = R.drawable.angel_cookie_animated,
            cookieGachaImage = R.drawable.angel_cookie_face_icon,
            type = HEALING,
            rarity = COMMON,
            soulStoneCount = 0
        ),
        CookieEntity(
            name = "Avocado Cookie",
            soulStoneImage = R.drawable.avocado_cookie_soulstone,
            cookieImage = R.drawable.avocado_cookie_character_card,
            cookieImageAnimated = R.drawable.avocado_cookie_animated,
            cookieGachaImage = R.drawable.avocado_cookie_face_icon,
            type = DEFENSE,
            rarity = RARE,
            soulStoneCount = 0
        ),
        CookieEntity(
            name = "Beet Cookie",
            soulStoneImage = R.drawable.beet_cookie_soulstone,
            cookieImage = R.drawable.beet_cookie_character_card,
            cookieImageAnimated = R.drawable.beet_cookie_animated,
            cookieGachaImage = R.drawable.beet_cookie_face_icon,
            type = RANGED,
            rarity = COMMON,
            soulStoneCount = 0
        ),
        CookieEntity(
            name = "Ginger Brave",
            soulStoneImage = R.drawable.ginger_brave_soulstone,
            cookieImage = R.drawable.ginger_brave_character_card,
            cookieImageAnimated = R.drawable.ginger_brave_animated,
            cookieGachaImage = R.drawable.ginger_brave_face_icon,
            type = CHARGE,
            rarity = COMMON,
            soulStoneCount = 0
        ),
        CookieEntity(
            name = "Muscle Cookie",
            soulStoneImage = R.drawable.muscle_cookie_soulstone,
            cookieImage = R.drawable.muscle_cookie_character_card,
            cookieImageAnimated = R.drawable.muscle_cookie_animated,
            cookieGachaImage = R.drawable.muscle_cookie_face_icon,
            type = CHARGE,
            rarity = COMMON,
            soulStoneCount = 0
        ),
        CookieEntity(
            name = "Ninja Cookie",
            soulStoneImage = R.drawable.ninja_cookie_soulstone,
            cookieImage = R.drawable.ninja_cookie_character_card,
            cookieImageAnimated = R.drawable.ninja_cookie_animated,
            cookieGachaImage = R.drawable.ninja_cookie_face_icon,
            type = AMBUSH,
            rarity = COMMON,
            soulStoneCount = 0
        ),
        CookieEntity(
            name = "Princess Cookie",
            soulStoneImage = R.drawable.princess_cookie_soulstone,
            cookieImage = R.drawable.princess_cookie_character_card,
            cookieImageAnimated = R.drawable.princess_cookie_animated,
            cookieGachaImage = R.drawable.princess_cookie_face_icon,
            type = CHARGE,
            rarity = RARE,
            soulStoneCount = 0
        ),
        CookieEntity(
            name = "Strawberry Cookie",
            soulStoneImage = R.drawable.strawberry_cookie_soulstone,
            cookieImage = R.drawable.strawberry_cookie_character_card,
            cookieImageAnimated = R.drawable.strawberry_cookie_animated,
            cookieGachaImage = R.drawable.strawberry_cookie_face_icon,
            type = DEFENSE,
            rarity = COMMON,
            soulStoneCount = 0
        ),
        CookieEntity(
            name = "Wizard Cookie",
            soulStoneImage = R.drawable.wizard_cookie_soulstone,
            cookieImage = R.drawable.wizard_cookie_character_card,
            cookieImageAnimated = R.drawable.wizard_cookie_animated,
            cookieGachaImage = R.drawable.wizard_cookie_face_icon,
            type = MAGIC,
            rarity = COMMON,
            soulStoneCount = 0
        ),
        CookieEntity(
            name = "Cookie1",
            soulStoneImage = R.drawable.wizard_cookie_soulstone,
            cookieImage = R.drawable.wizard_cookie_character_card,
            cookieImageAnimated = R.drawable.wizard_cookie_animated,
            cookieGachaImage = R.drawable.wizard_cookie_face_icon,
            type = RANGED,
            rarity = EPIC,
            soulStoneCount = 0
        ),
        CookieEntity(
            name = "Cookie 3",
            soulStoneImage = R.drawable.wizard_cookie_soulstone,
            cookieImage = R.drawable.wizard_cookie_character_card,
            cookieImageAnimated = R.drawable.wizard_cookie_animated,
            cookieGachaImage = R.drawable.wizard_cookie_face_icon,
            type = HEALING,
            rarity = ANCIENT,
            soulStoneCount = 0
        ),
        CookieEntity(
            name = "Cookie 3",
            soulStoneImage = R.drawable.wizard_cookie_soulstone,
            cookieImage = R.drawable.wizard_cookie_character_card,
            cookieImageAnimated = R.drawable.wizard_cookie_animated,
            cookieGachaImage = R.drawable.wizard_cookie_face_icon,
            type = SUPPORT,
            rarity = LEGENDARY,
            soulStoneCount = 0
        )
    )
}