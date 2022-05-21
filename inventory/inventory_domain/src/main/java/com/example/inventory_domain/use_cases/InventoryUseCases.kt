package com.example.inventory_domain.use_cases

data class InventoryUseCases(

    val getAllCookiesFromDb: GetAllCookiesFromDb,
    val getCookieById: GetCookieById,
    val getCookieByName: GetCookieByName,
)
