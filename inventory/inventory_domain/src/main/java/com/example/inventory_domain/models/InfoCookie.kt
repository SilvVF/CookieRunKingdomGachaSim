package com.example.inventory_domain.models

data class InfoCookie(
    val name: String, //res id
    val cookieFullArt: Int,

    val headIcon: Int,

    val type: Type,
//val skill: String,
    val rarity: Rarity,
    val position: Position,
    val skillDesc: String,
    val gameDescription: String,
    val skill: String,
    val skillIcon: Int,
    val quote: String,
    val skillStats: String,
    val skillCooldown: Int
)
