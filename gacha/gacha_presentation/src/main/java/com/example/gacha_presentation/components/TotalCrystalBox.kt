package com.example.gacha_presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.core.R
import com.example.core_ui.LocalSpacing

@Composable
fun TotalCrystalBox(
    total: Int,
    modifier: Modifier = Modifier,
    textSize: Int = 16
) {
    val spacing = LocalSpacing.current
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.crystal_icon),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(
                width = 24.dp,
                height = 24.dp
            )
        )
        Spacer(modifier = Modifier.width(spacing.spaceMedium))
        Text(
            text =  "Total Spent: $total",
            modifier = Modifier,
            fontSize = textSize.sp,
            color = Color.Black,
            style = MaterialTheme.typography.h3,
            fontWeight = FontWeight.Normal
        )
    }
}
