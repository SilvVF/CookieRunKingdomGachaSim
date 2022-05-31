package com.example.gacha_presentation.gacha_screen


sealed class GachaScreenEvent {

    object OnDrawTenButtonClick: GachaScreenEvent()
    object OnCookieListButtonClick: GachaScreenEvent()
    object OnToggleTreasureClick: GachaScreenEvent()
    object OnToggleCookieClick: GachaScreenEvent()
    object OnClearInventoryClick: GachaScreenEvent()
    object OnDismissPopupScreen: GachaScreenEvent()
}
