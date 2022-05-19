package com.example.gacha_presentation.components

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gacha_presentation.R

@Composable
fun CookieItemBox(
    modifier: Modifier = Modifier,
    height: Int = 60,
    width: Int = 60,
    imageId: Int,
) {
    Box(
        modifier = modifier
            .height(height.dp)
            .width(width.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(imageId),
            contentDescription = null,
            Modifier.fillMaxSize()
        )
    }
}