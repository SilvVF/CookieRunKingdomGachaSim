package com.example.gacha_presentation.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun GachaHistoryText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.body1
) {
    Text(
        modifier = modifier,
        text = text,
        style = style,
        fontSize = 30.sp
    )
}


