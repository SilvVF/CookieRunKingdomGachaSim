package com.example.inventory_domain.models

data class InventoryCookie(
    val name: String, //res id
    val soulStoneCount: Int = 0,
    val starCount: Int = 0,
    val soulStoneMax: Int = 0,
    val soulStoneImage: Int,
    val cookieInventoryImage: Int,

    val type: Type,
    //val skill: String,
    val rarity: Rarity,


)
