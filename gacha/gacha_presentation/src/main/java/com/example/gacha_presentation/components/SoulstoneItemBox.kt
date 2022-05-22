package com.example.gacha_presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SoulstoneItemBox(
    modifier: Modifier = Modifier,
    height: Int = 60,
    width: Int = 60,
    imageId: Int,
    count: Int,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .height(height.dp)
            .width(width.dp)
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(imageId),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
        Text(
            text = "x $count",
            color = Color.Black,
            fontSize = 24.sp,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .offset(x = (4).dp, y = (6).dp)
        )
    }
}