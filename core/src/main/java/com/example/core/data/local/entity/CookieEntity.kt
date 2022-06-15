package com.example.core.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CookieEntity (
    @PrimaryKey(autoGenerate = true)val id: Int = 0,
    val name: String, //res id
    val soulStoneCount: Int = 0,
    val soulStoneImage: Int,

    val cookieCard: Int,
    val cookieFullArt: Int,
    val cookieFaceIcon: Int,

    val type: String,
    val rarity: String,
    val position: String,
    val skillDesc: String,
    val gameDescription: String,
    val skill: String,
    val skillIcon: Int,
    val quote: String,

    //skill stats
    val cooldown: Int,
    val skillStats: String,
    )