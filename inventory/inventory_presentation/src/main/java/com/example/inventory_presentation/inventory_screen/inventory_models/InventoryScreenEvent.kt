package com.example.inventory_presentation.inventory_screen.inventory_models

sealed class InventoryScreenEvent {
    data class OnCookieClick(val id: Int): InventoryScreenEvent()
    object OnBackPressed: InventoryScreenEvent()
}
