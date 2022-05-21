package com.example.inventory_presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.core_ui.LocalSpacing
import com.example.inventory_domain.models.InventoryCookie


@Composable
fun CookieRow(
    modifier: Modifier = Modifier,
    cookies: List<InventoryCookie>,
) {
    val spacing = LocalSpacing.current
    Row(
        modifier = modifier
    ) {
        Box(
            Modifier.weight(1f)
        ) {
            if (cookies.getOrNull(0) != null)
            InventoryCookieItem(
                cookie = cookies[0],
            ){

            }
        }
        Spacer(modifier = Modifier.width(spacing.spaceMedium))
        Box (
            Modifier.weight(1f)
        ){
            if (cookies.getOrNull(1) != null)
            InventoryCookieItem(
                cookie = cookies[1],
            ){

            }
        }
    }

}