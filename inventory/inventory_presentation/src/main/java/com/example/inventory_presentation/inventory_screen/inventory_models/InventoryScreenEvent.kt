package com.example.inventory_presentation.inventory_screen.inventory_models

sealed class InventoryScreenEvent {
    data class OnCookieClick(val name: String?, val id: Int?): InventoryScreenEvent()
    object OnClearInventoryPressed: InventoryScreenEvent()
}
