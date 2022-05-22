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
    onCookieClick:(String) -> Unit
) {
    val spacing = LocalSpacing.current
    Row(
        modifier = modifier
    ) {
        cookies.forEach { cookie ->
            Box(
                Modifier.weight(1f).padding(6.dp)
            ) {
                if (cookies.getOrNull(0) != null)
                    InventoryCookieItem(
                        cookie = cookie,
                    ){
                        onCookieClick(it)
                    }
            }
            Spacer(modifier = Modifier.width(spacing.spaceSmall))
        }

    }

}