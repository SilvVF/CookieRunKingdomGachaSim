package com.example.gacha_presentation.gacha_screen


import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material.DismissState
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.gacha_domain.models.GachaCookie
import java.time.LocalDate
import java.time.LocalDateTime


data class GachaScreenState(
    val pulledCookies: List<List<GachaCookie>> = listOf(),
    val totalCrystals: Int = 0,
    val time: LocalDateTime = LocalDateTime.now(),
    val date: LocalDate = LocalDate.now(),
    val listState: LazyListState = LazyListState(),
    val shouldDisplayPopup: Boolean = false,
    //val alertDialogState: MutableState<Boolean> = mutableStateOf(false),
    val currentCookiePopups: Map<String, Int> = emptyMap()
)
