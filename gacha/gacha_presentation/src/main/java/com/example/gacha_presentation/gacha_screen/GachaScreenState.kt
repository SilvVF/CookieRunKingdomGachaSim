package com.example.gacha_presentation.gacha_screen


import com.example.gacha_domain.models.GachaCookie
import java.time.LocalDate
import java.time.LocalDateTime


data class GachaScreenState(
    val pulledCookies: MutableList<List<GachaCookie>> = mutableListOf(),
    val totalCrystals: Int = 0,
    val time: LocalDateTime = LocalDateTime.now(),
    val date: LocalDate = LocalDate.now(),
)
