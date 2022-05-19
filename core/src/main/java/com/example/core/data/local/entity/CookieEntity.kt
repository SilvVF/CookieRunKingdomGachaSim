package com.example.core.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CookieEntity (
    @PrimaryKey(autoGenerate = true)val id: Int = 0,
    val name: String, //res id
    val soulStoneCount: Int = 0,
    val soulStoneImage: Int,

    val cookieImage: Int,
    val cookieImageAnimated: Int,
    val cookieGachaImage: Int,

    val type: String,
    //val skill: String,
    val rarity: String,
    )