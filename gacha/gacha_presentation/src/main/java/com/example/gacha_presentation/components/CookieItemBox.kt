package com.example.gacha_presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun CookieItemBox(
    modifier: Modifier = Modifier,
    height: Int = 60,
    width: Int = 60,
    imageId: Int,
    onClick: () -> Unit
) {

    Box(
        modifier = modifier
                .height(height.dp)
                .width(width.dp).clickable { onClick() },
            contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(imageId),
            contentDescription = null,
            Modifier.fillMaxSize()
        )
    }
}
