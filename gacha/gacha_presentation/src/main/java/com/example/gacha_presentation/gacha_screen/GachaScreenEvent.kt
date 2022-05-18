package com.example.gacha_presentation.gacha_screen

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.lazy.LazyListState

sealed class GachaScreenEvent {

    object OnDrawTenButtonClick: GachaScreenEvent()
    object OnCookieListButtonClick: GachaScreenEvent()
    object OnToggleTreasureClick: GachaScreenEvent()
    object OnToggleCookieClick: GachaScreenEvent()
    object OnClearInventoryClick: GachaScreenEvent()
}
