package com.example.inventory_presentation.cookie_screen

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.inventory_presentation.R


@Composable
fun CookieCooldownBar(
    modifier: Modifier = Modifier,
    cooldown: Int
) {
    val maxCooldown = 20f
    val cooldownRatio = remember {
        Animatable(0f)
    }
    LaunchedEffect(key1 = cooldown) {
        cooldownRatio.animateTo(
            targetValue = cooldown / maxCooldown,
            animationSpec = tween(durationMillis = 800)
        )

    }
    Box(
        modifier = modifier
        .background(Color.DarkGray)
        .padding(6.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Canvas(modifier = Modifier.fillMaxWidth().height(30.dp).padding(4.dp)) {
            drawRoundRect(
                color = Color.LightGray,
                size = size,
                cornerRadius = CornerRadius(100f)
            )
            drawRoundRect(
                color = Color(0xffFFD401),
                size = Size(
                    width = (size.width * cooldownRatio.value),
                    height = size.height
                ),
                cornerRadius = CornerRadius(100f)
            )
        }
        Text(
            text = stringResource(com.example.core.R.string.cooldown) + ":\t$cooldown / 20",
            modifier = Modifier.padding(start = 8.dp),
            color = Color.Black
        )
    }
}