package com.example.inventory_presentation.cookie_screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.inventory_domain.models.Rarity
import com.example.inventory_presentation.R

@Composable
fun CookieRarityTag(
    modifier: Modifier = Modifier,
    rarity: Rarity
) {
    when (rarity) {
        is Rarity.Rare -> {
            painterResource(id = com.example.core.R.drawable.legendary_tag)
        }
    }
}