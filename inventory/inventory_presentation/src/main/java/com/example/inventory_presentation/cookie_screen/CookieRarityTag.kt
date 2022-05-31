package com.example.inventory_presentation.cookie_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.inventory_domain.models.Rarity
import com.example.core.R

@Composable
fun CookieRarityTag(
    modifier: Modifier = Modifier,
    rarity: Rarity
) {
    Box(modifier = modifier){
        Image(
            painter = when (rarity) {
                is Rarity.Rare -> {
                    painterResource(id = R.drawable.rare_tag)
                }
                is Rarity.Common -> {
                    painterResource(id = R.drawable.common_tag)
                }
                is Rarity.Epic -> {
                    painterResource(id = R.drawable.epic_tag)
                }
                is Rarity.SuperEpic -> {
                    painterResource(id = R.drawable.super_epic_tag)
                }
                is Rarity.Legendary -> {
                    painterResource(id = R.drawable.legendary_tag)
                }
                is Rarity.Ancient -> {
                    painterResource(id = R.drawable.ancient_tag)
                }
    
                else -> { painterResource(id = R.drawable.ancient_tag) }
            }, 
            contentDescription = rarity.name,
            modifier = Modifier.fillMaxSize()
        )
        
    }
}