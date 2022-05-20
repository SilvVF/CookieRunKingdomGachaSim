package com.example.inventory_domain.use_cases

data class InventoryUseCases(

    val getAllCookiesFormDb: GetAllCookiesFromDb,
    val getCookieById: GetCookieById,
    val getCookieByName: GetCookieByName,
)
