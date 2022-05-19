package com.example.gacha_presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core.R

@Composable
fun DualColorButton(
    modifier: Modifier = Modifier,
    textTop: String,
    textBottom: String,
    colorText: Color = Color.White,
    colorTop: Color,
    colorBottom: Color,
    fontSize: Int = 30,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .height(40.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(colorBottom)
            .clickable {
                onClick()
            },
        contentAlignment = Alignment.Center
    ) {
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize(0.5f)
                .clip(RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp))
                .background(colorTop)
                .align(Alignment.TopCenter)
        )
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = textTop,
                color = colorText,
                fontSize = fontSize.sp,
                modifier = Modifier.weight(1f)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.weight(1f)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.crystal_icon),
                    contentDescription = null
                )
                Text(
                    text = textBottom,
                    color = colorText,
                    fontSize = fontSize.sp
                )
            }
        }
    }
}