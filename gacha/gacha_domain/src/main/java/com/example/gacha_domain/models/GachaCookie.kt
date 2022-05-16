package com.example.gacha_domain.models


data class GachaCookie(
    val id: Int,
    val name: String,
    val soulStoneImage: Int,
    val cookieImageAnimated: Int,
    val cookieGachaImage: Int,
    val rarity: Rarity,
    val isFullCookie: Boolean = false,
    val soulStoneCount:Int = 0
)
