package com.example.inventory_presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.core.R
import com.example.core_ui.LocalSpacing
import com.example.inventory_domain.models.InfoCookie
import com.example.inventory_presentation.cookie_screen.CookieRarityTag

@Composable
fun CookieInfoImageBox(
    modifier: Modifier = Modifier,
    cookie: InfoCookie,
) {
    val spacing = LocalSpacing.current
    Box(
        Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.maxresdefault),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(380.dp)
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Image(
                painter = painterResource(cookie.cookieInfoImage),
                contentDescription = cookie.name,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth()
                    .height(300.dp)
            )
            CookieRarityTag(
                rarity = cookie.rarity,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
            )
        }
    }
}