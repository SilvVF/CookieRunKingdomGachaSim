package com.example.gacha_domain.models


data class Cookie(
    val id: Int?,
    val name: String,
    val soulStoneCount: Int,
    val soulStoneImage: Int,


    val cookieImage: Int,
    val cookieImageAnimated: Int,
    val cookieGachaImage: Int,

    val story: String,
    val position: String,
    val type: String,
    val skill: String,
    val rarity: String,
)
