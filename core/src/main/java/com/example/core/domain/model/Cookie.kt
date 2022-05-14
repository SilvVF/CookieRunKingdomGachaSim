package com.example.core.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

data class Cookie(
    val id: Int?,
    val name: String,
    val soulStoneCount: Int,
    val soulStoneImage: String,

    val starOneCount: Int,
    val starTwoCount: Int,
    val starThreeCount: Int,
    val starFourCount: Int,
    val starFiveCount: Int,

    val cookieImage: String,
    val cookieImageAnimated: String,
    val cookieGachaImage: String,

    val story: String,
    val position: String,
    val type: String,
    val skill: String,
    val rarity: String,
)
