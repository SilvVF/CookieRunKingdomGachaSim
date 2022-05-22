package com.example.inventory_presentation.cookie_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.inventory_domain.models.InventoryCookie

@Composable
fun CookieScreen(
    cookie: InventoryCookie
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(cookie.cookieInventoryImage),
            contentDescription = cookie.name
        )
        CookieRarityTag(
            rarity =  cookie.rarity
        )
    }
}